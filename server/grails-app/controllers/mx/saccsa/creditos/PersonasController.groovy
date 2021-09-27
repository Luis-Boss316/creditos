package mx.saccsa.creditos

import grails.gorm.transactions.Transactional
import grails.rest.RestfulController

import java.text.SimpleDateFormat


class PersonasController extends RestfulController<Personas>{
    PersonasController() {super (Personas)}

    @Transactional
    def save() {
        //DatosGenerales
        params
        request
        DatosGeneralesPersonas instance1 = new DatosGeneralesPersonas()
        if(request.JSON.primerNombre != null) {
            instance1.primerNombre = request.JSON.primerNombre
        }
        if(request.JSON.segundoNombre != null) {
            instance1.segundoNombre = request.JSON.segundoNombre
        }
        if(request.JSON.apellidoPaterno != null) {
            instance1.apellidoPaterno = request.JSON.apellidoPaterno
        }
        if(request.JSON.apellidoMaterno != null) {
            instance1.apellidoMaterno = request.JSON.apellidoMaterno
        }
        if(request.JSON.genero != null) {
            instance1.genero = request.JSON.genero
        }
        if(request.JSON.estadoCivil != null) {
            EstadoCivil estadoCivil = EstadoCivil.findById(request.JSON.estadoCivil as Long)
            instance1.estadoCivil = estadoCivil
        }
        if(request.JSON.nacionalidad != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidad as Long)
            instance1.nacionalidad = nacionalidades
        }
        if(request.JSON.fechaNacimiento != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            def fecha = request.JSON.fechaNacimiento ? sdf.parse(request.JSON.fechaNacimiento) : null
            instance1.fechaNacimiento = fecha
        }
        if(request.JSON.actividad != null) {
            instance1.actividad = request.JSON.actividad
        }
        if(request.JSON.giro != null) {
            GiroEmpresarial giroEmpresarial = GiroEmpresarial.findById(request.JSON.giro as Long)
            instance1.giro = giroEmpresarial
        }
        if(request.JSON.paisNacimiento != null) {
            Paises paises = Paises.findById(request.JSON.paisNacimiento as Long)
            instance1.paisNacimiento = paises
        }
        if(request.JSON.estadoNacimiento != null) {
            Estados estados = Estados.findById(request.JSON.estadoNacimiento as Long)
            instance1.estadoNacimiento = estados
        }
        instance1.save(flush: true, failOnError: true)

        //DatosAlternos
        DatosAlternos instance2 = new DatosAlternos()
        if(request.JSON.primerNombreA != null) {
            instance2.primerNombreA = request.JSON.primerNombreA
        }
        if(request.JSON.segundoNombreA != null) {
            instance2.segundoNombreA = request.JSON.segundoNombreA
        }
        if(request.JSON.apellidoPaternoA != null) {
            instance2.apellidoPaternoA = request.JSON.apellidoPaternoA
        }
        if(request.JSON.apellidoMaternoA != null) {
            instance2.apellidoMaternoA = request.JSON.apellidoMaternoA
        }
        instance2.save(flush: true, failOnError: true)

        //DatosBancarios
        DatosBancarios instance3 = new DatosBancarios()
        if(request.JSON.banco != null) {
            instance3.banco = request.JSON.banco
        }
        if(request.JSON.cuenta != null) {
            instance3.cuenta = request.JSON.cuenta
        }
        if(request.JSON.clabe != null) {
            instance3.clabe = request.JSON.clabe
        }
        if(request.JSON.noTarjeta != null) {
            instance3.noTarjeta = request.JSON.noTarjeta
        }
        instance3.save(flush: true, failOnError: true)

        //Correos
        Correos instance4 = new Correos()
        if(request.JSON.activo != null) {
            instance4.activo = request.JSON.activo
        }
        if(request.JSON.principal != null) {
            instance4.principal = request.JSON.principal
        }
        if(request.JSON.tipo != null) {
            instance4.tipo = request.JSON.tipo
        }
        if(request.JSON.correo != null) {
            instance4.correo = request.JSON.correo
        }
        instance4.save(flush: true, failOnError: true)

        //Contactos
        Contactos instance5 = new Contactos()
        if(request.JSON.relacion != null) {
            TiposRelaciones tiposRelaciones = TiposRelaciones.findById(request.JSON.relacion as Long)
            instance5.relacion = tiposRelaciones
        }
        if(request.JSON.persona != null) {
            instance5.persona = request.JSON.persona
        }
        instance5.save(flush: true, failOnError: true)

        //Telefonos
        Telefonos instance6 = new Telefonos()
        if(request.JSON.activo1 != null) {
            instance6.activo1 = request.JSON.activo1
        }
        if(request.JSON.principal1 != null) {
            instance6.principal1 = request.JSON.principal1
        }
        if(request.JSON.tipo1 != null) {
            instance6.tipo1 = request.JSON.tipo1
        }
        if(request.JSON.compania != null) {
            instance6.compania = request.JSON.compania
        }
        if(request.JSON.lada != null) {
            instance6.lada = request.JSON.lada
        }
        if(request.JSON.telefono != null) {
            instance6.telefono = request.JSON.telefono
        }
        if(request.JSON.extencion != null) {
            instance6.extencion = request.JSON.extencion
        }
        if(request.JSON.observaciones != null) {
            instance6.observaciones = request.JSON.observaciones
        }
        instance6.save(flush: true, failOnError: true)

        Personas instance = new Personas()
        instance.persona = instance1
        instance.datos = instance2
        instance.bancarios = instance3
        instance.correo = instance4
        instance.contacto = instance5
        instance.telefono = instance6
        instance.save(flush: true, failOnError: true)

        respond(instance)
    }

    def index(){
        def personas = Personas.list().collect({
            [
                    id: it.persona?.id,
                    primerNombre: it.persona.primerNombre?it.persona.primerNombre:'N/A',
                    segundoNombre: it.persona.segundoNombre?it.persona.segundoNombre:'N/A',
                    apellidoPaterno: it.persona.apellidoPaterno?it.persona.apellidoPaterno:'N/A',
                    apellidoMaterno: it.persona.apellidoMaterno?it.persona.apellidoMaterno:'N/A',
                    paisNacimiento: it.persona.paisNacimiento?it.persona.paisNacimiento.descLabel:'N/A',
            ]
        })

        respond(personas)
    }

    def edit(Long id){
        def personas = Personas.findById(id).collect({
            [
                    id: it.id,

                    idDatosGenerales: it.persona.id,
                    primerNombre: it.persona.primerNombre?it.persona.primerNombre:null,
                    segundoNombre: it.persona.segundoNombre?it.persona.segundoNombre:null,
                    apellidoPaterno: it.persona.apellidoPaterno?it.persona.apellidoPaterno:null,
                    apellidoMaterno: it.persona.apellidoMaterno?it.persona.apellidoMaterno:null,
                    genero: it.persona.genero?it.persona.genero:null,
                    estadoCivil: it.persona.estadoCivil?it.persona.estadoCivil:null,
                    nacionalidad: it.persona.nacionalidad?it.persona.nacionalidad:null,
                    fechaNacimiento: it.persona.fechaNacimiento?it.persona.fechaNacimiento:null,
                    actividad: it.persona.actividad?it.persona.actividad:null,
                    giro: it.persona.giro?it.persona.giro:null,
                    paisNacimiento: it.persona.paisNacimiento?it.persona.paisNacimiento:null,
                    estadoNacimiento: it.persona.estadoNacimiento?it.persona.estadoNacimiento:null,

                    idDatosAlternos: it.datos.id,
                    primerNombreA: it.datos.primerNombreA?it.datos.primerNombreA:null,
                    segundoNombreA: it.datos.segundoNombreA?it.datos.segundoNombreA:null,
                    apellidoPaternoA: it.datos.apellidoPaternoA?it.datos.apellidoPaternoA:null,
                    apellidoMaternoA: it.datos.apellidoMaternoA?it.datos.apellidoMaternoA:null,

                    idDatosBancarios: it.bancarios.id,
                    banco: it.bancarios.banco?it.bancarios.banco:null,
                    cuenta: it.bancarios.cuenta?it.bancarios.cuenta:null,
                    clabe: it.bancarios.clabe?it.bancarios.clabe:null,
                    noTarjeta: it.bancarios.noTarjeta?it.bancarios.noTarjeta:null,

                    idCorreos: it.correo.id,
                    activo: it.correo.activo?it.correo.activo:null,
                    principal: it.correo.principal?it.correo.principal:null,
                    tipo: it.correo.tipo?it.correo.tipo:null,
                    correo: it.correo.correo?it.correo.correo:null,

                    idContactos: it.contacto.id,
                    relacion: it.contacto.relacion?it.contacto.relacion:null,
                    persona: it.contacto.persona?it.contacto.persona:null,

                    idTelefonos: it.telefono.id,
                    activo1: it.telefono.activo1?it.telefono.activo1:null,
                    principal1: it.telefono.principal1?it.telefono.principal1:null,
                    tipo1: it.telefono.tipo1?it.telefono.tipo1:null,
                    compania: it.telefono.compania?it.telefono.compania:null,
                    lada: it.telefono.lada?it.telefono.lada:null,
                    telefono: it.telefono.telefono?it.telefono.telefono:null,
                    extencion: it.telefono.extencion?it.telefono.extencion:null,
                    observaciones: it.telefono.observaciones?it.telefono.observaciones:null,
            ]
        })

        respond(personas[0])
    }

    @Transactional
    def update(Long id){
        request
        params
        def personas = Personas.findById(id)

        //Datos Generales
        def datosgenerales = DatosGeneralesPersonas.findById(personas.persona.id)
        datosgenerales.primerNombre = request.JSON.primerNombre
        datosgenerales.segundoNombre = request.JSON.segundoNombre
        datosgenerales.apellidoPaterno = request.JSON.apellidoPaterno
        datosgenerales.apellidoMaterno = request.JSON.apellidoMaterno
        datosgenerales.genero = request.JSON.genero
        if(request.JSON.estadoCivil != null) {
            EstadoCivil estadoCivil = EstadoCivil.findById(request.JSON.estadoCivil as Long)
            datosgenerales.estadoCivil = estadoCivil
        }
        if(request.JSON.nacionalidad != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidad as Long)
            datosgenerales.nacionalidad = nacionalidades
        }

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        def fecha = request.JSON.fechaNacimiento ? sdf.parse(request.JSON.fechaNacimiento) : null
        datosgenerales.fechaNacimiento = fecha

        datosgenerales.actividad = request.JSON.actividad
        if(request.JSON.giro != null) {
            GiroEmpresarial giro = GiroEmpresarial.findById(request.JSON.giro as Long)
            datosgenerales.giro = giro
        }
        if(request.JSON.paisNacimiento != null) {
            Paises paises = Paises.findById(request.JSON.paisNacimiento as Long)
            datosgenerales.paisNacimiento = paises
        }
        if(request.JSON.estadoNacimiento != null) {
            Estados estados = Estados.findById(request.JSON.estadoNacimiento as Long)
            datosgenerales.estadoNacimiento = estados
        }
        datosgenerales.save(flush: true, failOnError: true)

        //Datos Alternos
        def datosAlternos = DatosAlternos.findById(personas.datos.id)
        datosAlternos.primerNombreA = request.JSON.primerNombreA
        datosAlternos.segundoNombreA = request.JSON.segundoNombreA
        datosAlternos.apellidoPaternoA = request.JSON.apellidoPaternoA
        datosAlternos.apellidoMaternoA = request.JSON.apellidoMaternoA
        datosAlternos.save(flush: true, failOnError: true)


        //Datos Bancarios
        def datosBancarios = DatosBancarios.findById(personas.bancarios.id)
        datosBancarios.banco = request.JSON.banco
        datosBancarios.cuenta = request.JSON.cuenta
        datosBancarios.clabe = request.JSON.clabe
        datosBancarios.noTarjeta = request.JSON.noTarjeta
        datosBancarios.save(flush: true, failOnError: true)


        //Correos
        def correos = Correos.findById(personas.correo.id)
        correos.activo = request.JSON.activo
        correos.principal = request.JSON.principal
        correos.tipo = request.JSON.tipo
        correos.correo = request.JSON.correo
        correos.save(flush: true, failOnError: true)


        //Contactos
        def contactos = Contactos.findById(personas.contacto.id)
        contactos.relacion =request.JSON.relacion
        contactos.persona =request.JSON.persona
        contactos.save(flush: true, failOnError: true)


        //Telefonos
        def telefonos = Telefonos.findById(personas.telefono.id)
        telefonos.activo1 = request.JSON.activo1
        telefonos.principal1 = request.JSON.principal1
        telefonos.tipo1 = request.JSON.tipo1
        telefonos.compania = request.JSON.compania
        telefonos.lada = request.JSON.lada
        telefonos.telefono = request.JSON.telefono
        telefonos.extencion = request.JSON.extencion
        telefonos.observaciones = request.JSON.observaciones
        telefonos.save(flush: true, failOnError: true)
    }
}
