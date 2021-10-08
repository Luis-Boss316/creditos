package mx.saccsa.creditos

import grails.gorm.transactions.Transactional
import grails.rest.RestfulController

import java.text.SimpleDateFormat


class NegociosController extends RestfulController<Negocios>{
      NegociosController() {super (Negocios)}

    @Transactional
    def save() {
        //Datos Generales
        params
        request
        DatosGeneralesNegocios instance1 = new DatosGeneralesNegocios()
        if(request.JSON.nombre != null) {
            instance1.nombre = request.JSON.nombre
        }
        if(request.JSON.tipoPersona != null) {
            instance1.tipoPersona = request.JSON.tipoPersona
        }
        if(request.JSON.tipoSociedad != null) {
            TiposSociedad tiposSociedad = TiposSociedad.findById(request.JSON.tipoSociedad as Long)
            instance1.tipoSociedad = tiposSociedad
        }
        if(request.JSON.tipoOperacion != null) {
            instance1.tipoOperacion = request.JSON.tipoOperacion
        }
        if(request.JSON.fechaInicioOperaciones != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            def fecha = request.JSON.fechaInicioOperaciones ? sdf.parse(request.JSON.fechaInicioOperaciones) : null
            instance1.fechaInicioOperaciones = fecha
        }
        if(request.JSON.fechaInicioRegistro != null) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            def fechaInicio = request.JSON.fechaInicioRegistro ? sdf.parse(request.JSON.fechaInicioRegistro) : null
            instance1.fechaInicioRegistro = fechaInicio
        }
        if(request.JSON.actividad != null) {
            Ocupaciones ocupaciones = Ocupaciones.findById(request.JSON.actividad as Long)
            instance1.actividad = ocupaciones
        }
        if(request.JSON.giro != null) {
            GiroEmpresarial giroEmpresarial = GiroEmpresarial.findById(request.JSON.giro as Long)
            instance1.giro = giroEmpresarial
        }
        if(request.JSON.establecimiento != null) {
            instance1.establecimiento = request.JSON.establecimiento
        }
        if(request.JSON.nacionalidad != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidad as Long)
            instance1.nacionalidad = nacionalidades
        }
        if(request.JSON.paginaWeb != null) {
            instance1.paginaWeb = request.JSON.paginaWeb
        }
        instance1.save(flush: true, failOnError: true)


        //Telefonos
        TelefonosNegocios instance2 = new TelefonosNegocios()
        if(request.JSON.activo != null) {
            instance2.activo = request.JSON.activo
        }
        if(request.JSON.principal != null) {
            instance2.principal = request.JSON.principal
        }
        if(request.JSON.tipo != null) {
            instance2.tipo = request.JSON.tipo
        }
        if(request.JSON.compania != null) {
            instance2.compania = request.JSON.compania
        }
        if(request.JSON.lada != null) {
            instance2.lada = request.JSON.lada
        }
        if(request.JSON.telefono != null) {
            instance2.telefono = request.JSON.telefono
        }
        if(request.JSON.extencion != null) {
            instance2.extencion = request.JSON.extencion
        }
        if(request.JSON.observaciones != null) {
            instance2.observaciones = request.JSON.observaciones
        }
        instance2.save(flush: true, failOnError: true)


        //Correos
        CorreosNegocios instance3 = new CorreosNegocios()
        if(request.JSON.activo1 != null) {
            instance3.activo1 = request.JSON.activo1
        }
        if(request.JSON.principal1 != null) {
            instance3.principal1 = request.JSON.principal1
        }
        if(request.JSON.tipo1 != null) {
            instance3.tipo1 = request.JSON.tipo1
        }
        if(request.JSON.correo != null) {
            instance3.correo = request.JSON.correo
        }
        instance3.save(flush: true, failOnError: true)


        //Participantes
        Participantes instance4 = new Participantes()
        if(request.JSON.participante != null) {
            instance4.participante = request.JSON.participante
        }
        if(request.JSON.puesto != null) {
            instance4.puesto = request.JSON.puesto
        }
        if(request.JSON.porcentajeParticipacion != null) {
            instance4.porcentajeParticipacion = request.JSON.porcentajeParticipacion
        }
        if(request.JSON.apoderado != null) {
            instance4.apoderado = request.JSON.apoderado
        }
        if(request.JSON.poder != null) {
            instance4.poder = request.JSON.poder
        }
        if(request.JSON.firma != null) {
            instance4.firma = request.JSON.firma
        }
        instance4.save(flush: true, failOnError: true)


        //Contactos
        ContactosNegocios instance5 = new ContactosNegocios()
        if(request.JSON.relacion != null) {
            instance5.relacion = request.JSON.relacion
        }
        if(request.JSON.persona != null) {
            instance5.persona = request.JSON.persona
        }
        instance5.save(flush: true, failOnError: true)


        //Datos Bancarios
        CuentasBancariasNegocios instance6 = new CuentasBancariasNegocios()
        if(request.JSON.banco != null) {
            instance6.banco = request.JSON.banco
        }
        if(request.JSON.cuenta != null) {
            instance6.cuenta = request.JSON.cuenta
        }
        if(request.JSON.clabe != null) {
            instance6.clabe = request.JSON.clabe
        }
        if(request.JSON.noTarjeta != null) {
            instance6.noTarjeta = request.JSON.noTarjeta
        }
        instance6.save(flush: true, failOnError: true)

        Negocios instance = new Negocios()
        instance.negocios = instance1
        instance.telefonosNegocios = instance2
        instance.correosNegocios = instance3
        instance.participantes = instance4
        instance.contactosNegocios = instance5
        instance.cuentasBancarias = instance6
        instance.save(flush: true, failOnError: true)

        respond(instance)
    }

    def index()  {
        def negocios = Negocios.list().collect({
            [
                    id: it.negocios?.id,
                    nombre: it.negocios.nombre?it.negocios.nombre: 'N/A',
                    tipoSociedad: it.negocios.tipoSociedad?it.negocios.tipoSociedad.descLabel: 'N/A',
                    giro: it.negocios.giro?it.negocios.giro.descLabel: 'N/A',
                    nacionalidad: it.negocios.nacionalidad?it.negocios.nacionalidad.descLabel: 'N/A',
                    paginaWeb: it.negocios.paginaWeb?it.negocios.paginaWeb: 'N/A',
            ]
        })
        respond(negocios)
    }

    def edit(Long id) {
        def negocios = Negocios.findById(id).collect({
            [
                    id: it.id,

                    idDatosGenerales: it.negocios.id,
                    nombre: it.negocios.nombre?it.negocios.nombre: null,
                    tipoPersona: it.negocios.tipoPersona?it.negocios.tipoPersona: null,
                    tipoSociedad: it.negocios.tipoSociedad?it.negocios.tipoSociedad: null,
                    tipoOperacion: it.negocios.tipoOperacion?it.negocios.tipoOperacion: null,
                    fechaInicioOperaciones: it.negocios.fechaInicioOperaciones?it.negocios.fechaInicioOperaciones: null,
                    fechaInicioRegistro: it.negocios.fechaInicioRegistro?it.negocios.fechaInicioRegistro: null,
                    actividad: it.negocios.actividad?it.negocios.actividad: null,
                    giro: it.negocios.giro?it.negocios.giro: null,
                    establecimiento: it.negocios.establecimiento?it.negocios.establecimiento: null,
                    nacionalidad: it.negocios.nacionalidad?it.negocios.nacionalidad: null,
                    paginaWeb: it.negocios.paginaWeb?it.negocios.paginaWeb: null,

                    idTelefonos: it.telefonosNegocios.id,
                    activo: it.telefonosNegocios.activo?it.telefonosNegocios.activo: null,
                    principal: it.telefonosNegocios.principal?it.telefonosNegocios.principal: null,
                    tipo: it.telefonosNegocios.tipo?it.telefonosNegocios.tipo: null,
                    compania: it.telefonosNegocios.compania?it.telefonosNegocios.compania: null,
                    lada: it.telefonosNegocios.lada?it.telefonosNegocios.lada: null,
                    telefono: it.telefonosNegocios.telefono?it.telefonosNegocios.telefono: null,
                    extencion: it.telefonosNegocios.extencion?it.telefonosNegocios.extencion: null,
                    observaciones: it.telefonosNegocios.observaciones?it.telefonosNegocios.observaciones: null,

                    idCorreos: it.correosNegocios.id,
                    activo1: it.correosNegocios.activo1?it.correosNegocios.activo1: null,
                    principal1: it.correosNegocios.principal1?it.correosNegocios.principal1: null,
                    tipo1: it.correosNegocios.tipo1?it.correosNegocios.tipo1: null,
                    correo: it.correosNegocios.correo?it.correosNegocios.correo: null,

                    idParticipantes: it.participantes.id,
                    participante: it.participantes.participante?it.participantes.participante: null,
                    puesto: it.participantes.puesto?it.participantes.puesto: null,
                    porcentajeParticipacion: it.participantes.porcentajeParticipacion?it.participantes.porcentajeParticipacion: null,
                    apoderado: it.participantes.apoderado?it.participantes.apoderado: null,
                    poder: it.participantes.poder?it.participantes.poder: null,
                    firma: it.participantes.firma?it.participantes.firma: null,

                    idContactos: it.contactosNegocios.id,
                    relacion: it.contactosNegocios.relacion?it.contactosNegocios.relacion: null,
                    persona: it.contactosNegocios.persona?it.contactosNegocios.persona: null,

                    idCuentas: it.cuentasBancarias.id,
                    banco: it.cuentasBancarias.banco?it.cuentasBancarias.banco: null,
                    cuenta: it.cuentasBancarias.cuenta?it.cuentasBancarias.cuenta: null,
                    clabe: it.cuentasBancarias.clabe?it.cuentasBancarias.clabe: null,
                    noTarjeta: it.cuentasBancarias.noTarjeta?it.cuentasBancarias.noTarjeta: null,
            ]
        })
        respond(negocios[0])
    }

    @Transactional
    def update(Long id) {
        request
        params
        def negocios = Negocios.findById(id)

        //Datos Generales
        def datosGenerales = DatosGeneralesNegocios.findById(negocios.negocios.id)
        datosGenerales.nombre = request.JSON.nombre
        datosGenerales.tipoPersona = request.JSON.tipoPersona
        if(request.JSON.tipoSociedad != null) {
            TiposSociedad tiposSociedad = TiposSociedad.findById(request.JSON.tipoSociedad as Long)
            datosGenerales.tipoSociedad = tiposSociedad
        }
        datosGenerales.tipoOperacion = request.JSON.tipoOperacion

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        def fecha = request.JSON.fechaInicioOperaciones ? sdf.parse(request.JSON.fechaInicioOperaciones) : null
        datosGenerales.fechaInicioOperaciones = fecha

        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        def fechaInicio = request.JSON.fechaInicioRegistro ? s.parse(request.JSON.fechaInicioRegistro) : null
        datosGenerales.fechaInicioRegistro = fechaInicio

        if(request.JSON.actividad != null) {
            Ocupaciones actividad = Ocupaciones.findById(request.JSON.actividad as Long)
            datosGenerales.actividad = actividad
        }
        if(request.JSON.giro != null) {
            GiroEmpresarial giro = GiroEmpresarial.findById(request.JSON.giro as Long)
            datosGenerales.giro = giro
        }
        datosGenerales.establecimiento = request.JSON.establecimiento
        if(request.JSON.nacionalidad != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidad as Long)
            datosGenerales.nacionalidad = nacionalidades
        }
        datosGenerales.paginaWeb = request.JSON.paginaWeb
        datosGenerales.save(flush: true, failOnError: true)

        //Telefonos
        def telefonos = TelefonosNegocios.findById(negocios.telefonosNegocios.id)
        telefonos.activo = request.JSON.activo
        telefonos.principal = request.JSON.principal
        telefonos.tipo = request.JSON.tipo
        telefonos.compania = request.JSON.compania
        telefonos.lada = request.JSON.lada
        telefonos.telefono = request.JSON.telefono
        telefonos.extencion = request.JSON.extencion
        telefonos.observaciones = request.JSON.observaciones
        telefonos.save(flush: true, failOnError: true)

        //Correos
        def correos = CorreosNegocios.findById(negocios.correosNegocios.id)
        correos.activo1 = request.JSON.activo1
        correos.principal1 = request.JSON.principal1
        correos.tipo1 = request.JSON.tipo1
        correos.correo = request.JSON.correo
        correos.save(flush: true, failOnError: true)

        //Participantes
        def participantes = Participantes.findById(negocios.participantes.id)
        participantes.participante = request.JSON.participante
        participantes.puesto = request.JSON.puesto
        participantes.porcentajeParticipacion = request.JSON.porcentajeParticipacion
        participantes.apoderado = request.JSON.apoderado
        participantes.poder = request.JSON.poder
        participantes.firma = request.JSON.firma
        participantes.save(flush: true, failOnError: true)

        //Contactos
        def contactos = ContactosNegocios.findById(negocios.contactosNegocios.id)
        contactos.relacion = request.JSON.relacion
        contactos.persona = request.JSON.persona
        contactos.save(flush: true, failOnError: true)

        //Cuentas Bancarias
        def cuentas = CuentasBancariasNegocios.findById(negocios.cuentasBancarias.id)
        cuentas.banco = request.JSON.banco
        cuentas.cuenta = request.JSON.cuenta
        cuentas.clabe = request.JSON.clabe
        cuentas.noTarjeta = request.JSON.noTarjeta
        cuentas.save(flush: true, failOnError: true)
    }
}
