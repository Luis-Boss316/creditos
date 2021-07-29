package mx.saccsa.creditos

import grails.gorm.transactions.Transactional
import grails.rest.RestfulController
import org.apache.poi.ss.formula.functions.Na


class ClientesController extends RestfulController<Clientes> {
    ClientesController() { super(Clientes) }

    @Transactional
    def save() {
        //titular
        params
        request
        Titular instance1 = new Titular()
        if(request.JSON.titularNombre != null) {
            instance1.titularNombre = request.JSON.titularNombre
        }
        if(request.JSON.apellidoPaterno != null) {
            instance1.apellidoPaterno = request.JSON.apellidoPaterno
        }
        if(request.JSON.apellidoMaterno != null) {
            instance1.apellidoMaterno = request.JSON.apellidoMaterno
        }
        if(request.JSON.grupoFamilia != null) {
            GrupoFamilia grupo = GrupoFamilia.findByClave(request.JSON.grupoFamilia as String)
            instance1.grupoFamilia = grupo
        }
        if(request.JSON.promotor != null ) {
            Promotor promo = Promotor.findById(request.JSON.promotor as Long)
            instance1.promotor = promo
        }
        if(request.JSON.tipoInversionista != null) {
            TipoInversionistas tipo = TipoInversionistas.findByCveTipoInversionista(request.JSON.tipoInversionistas as String)
            instance1.tipoInversionista = tipo
        }
        if(request.JSON.excentoIsr != null) {
            instance1.excentoIsr = request.JSON.excentoIsr
        }
        if(request.JSON.excentoIva != null) {
            instance1.excentoIva = request.JSON.excentoIva
        }
        if(request.JSON.fechaNacimiento != null) {
            instance1.fechaNacimiento = request.JSON.fechaNacimiento
        }
        if(request.JSON.entidadFederativaNacimiento != null) {
            Estados entidad = Estados.findById(request.JSON.entidadFederativaNacimiento as Long)
            instance1.entidadFederativaNacimiento = entidad
        }
        if(request.JSON.fechaInicioOperaciones != null) {
            instance1.fechaInicioOperaciones = request.JSON.fechaInicioOperaciones
        }
        if(request.JSON.estadoCivil != null) {
            instance1.estadoCivil = request.JSON.estadoCivil
        }
        if(request.JSON.profesion != null) {
            Profesiones profe = Profesiones.findById(request.JSON.profesion as Long)
            instance1.profesion = profe
        }
        if(request.JSON.nombreEmpresaPrestaServicios != null) {
            instance1.nombreEmpresaPrestaServicios = request.JSON.nombreEmpresaPrestaServicios
        }
        if(request.JSON.nombrePuesto != null) {
            instance1.nombrePuesto = request.JSON.nombrePuesto
        }
        if(request.JSON.funcionesGeneralesDirectivas != null) {
            instance1.funcionesGeneralesDirectivas = request.JSON.funcionesGeneralesDirectivas
        }
        if(request.JSON.nivelJerarquico != null) {
            instance1.nivelJerarquico = request.JSON.nivelJerarquico
        }
        if(request.JSON.antiguedadEmpleo != null) {
            instance1.antiguedadEmpleo = request.JSON.antiguedadEmpleo
        }
        if(request.JSON.sectorEmpresa != null) {
            instance1.sectorEmpresa = request.JSON.sectorEmpresa
        }
        if(request.JSON.giroEmpresa != null) {
            instance1.giroEmpresa = request.JSON.giroEmpresa
        }
        if(request.JSON.tipoIngreso != null) {
            instance1.tipoIngreso = request.JSON.tipoIngreso
        }
        if(request.JSON.ingresoAdicional != null) {
            instance1.ingresoAdicional = request.JSON.ingresoAdicional
        }
        if(request.JSON.sectorPrestaServicio != null) {
            instance1.sectorPrestaServicio = request.JSON.sectorPrestaServicio
        }
        if(request.JSON.giroEspecificoServicios != null) {
            ActVulnerable act = ActVulnerable.findByCveActVulnerable(request.JSON.giroEspecificoServicios as String)
            instance1.giroEspecificoServicios = act
        }
        if(request.JSON.sectorEmpresa2 != null) {
            instance1.sectorEmpresa2 = request.JSON.sectorEmpresa2
        }
        if(request.JSON.razonSocialEmpresa != null) {
            instance1.razonSocialEmpresa = request.JSON.razonSocialEmpresa
        }
        if(request.JSON.actividadEmpresa != null) {
            instance1.actividadEmpresa = request.JSON.actividadEmpresa
        }
        if(request.JSON.ingresoAdicional2 != null) {
            instance1.ingresoAdicional2 = request.JSON.ingresoAdicional2
        }
        if(request.JSON.ocupacionActual != null) {
            instance1.ocupacionActual = request.JSON.ocupacionActual
        }
        if(request.JSON.fuenteIngresos != null) {
            instance1.fuenteIngresos = request.JSON.fuenteIngresos
        }
        if(request.JSON.sociedadesAsociacionesRFCEmpresa != null) {
            instance1.sociedadesAsociacionesRFCEmpresa = request.JSON.sociedadesAsociacionesRFCEmpresa
        }
        if(request.JSON.nacionalidadEmpresa != null) {
            Nacionalidades nacio = Nacionalidades.findById(request.JSON.nacionalidadEmpresa as Long)
            instance1.nacionalidadEmpresa = nacio
        }
        if(request.JSON.telefonoEmpresa != null) {
            instance1.telefonoEmpresa = request.JSON.telefonoEmpresa
        }
        if(request.JSON.sectorEmpresa3 != null) {
            instance1.sectorEmpresa3 = request.JSON.sectorEmpresa3
        }
        if(request.JSON.actividadGiroEspecificoEmpresa != null) {
            instance1.actividadGiroEspecificoEmpresa = request.JSON.actividadGiroEspecificoEmpresa
        }
        if(request.JSON.porcentajeCapitalSocial != null) {
            instance1.porcentajeCapitalSocial = request.JSON.porcentajeCapitalSocial
        }
        if(request.JSON.consejeroEmpresaRFCEmpresa != null) {
            instance1.consejeroEmpresaRFCEmpresa = request.JSON.consejeroEmpresaRFCEmpresa
        }
        if(request.JSON.nacionalidadEmpresa2 != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadEmpresa2 as Long)
            instance1.nacionalidadEmpresa2 = nacionalidades
        }
        if(request.JSON.telefonoEmpresa2 != null) {
            instance1.telefonoEmpresa2 = request.JSON.telefonoEmpresa2
        }
        if(request.JSON.sectorEmpresa4 != null) {
            instance1.sectorEmpresa4 = request.JSON.sectorEmpresa4
        }
        if(request.JSON.actividadGiroEmpresa3 != null) {
            instance1.actividadGiroEmpresa3 = request.JSON.actividadGiroEmpresa3
        }
        if(request.JSON.vinculoPatrimonial != null) {
            instance1.vinculoPatrimonial = request.JSON.vinculoPatrimonial
        }
        if(request.JSON.consejeroEmpresa != null) {
            instance1.consejeroEmpresa = request.JSON.consejeroEmpresa
        }
        if(request.JSON.cargoDesempeno != null) {
            instance1.cargoDesempeno = request.JSON.cargoDesempeno
        }
        if(request.JSON.nombreInstitucion != null) {
            instance1.nombreInstitucion = request.JSON.nombreInstitucion
        }
        if(request.JSON.institucionCargoExtranjero != null) {
            instance1.institucionCargoExtranjero = request.JSON.institucionCargoExtranjero
        }
        if(request.JSON.pais != null) {
            Paises paises = Paises.findById(request.JSON.pais as Long)
            instance1.pais = paises
        }
        if(request.JSON.cargo != null) {
            instance1.cargo = request.JSON.cargo
        }
        if(request.JSON.relacionPersonaNacionalExtranjera != null) {
            instance1.relacionPersonaNacionalExtranjera = request.JSON.relacionPersonaNacionalExtranjera
        }
        if(request.JSON.cargo2 != null) {
            instance1.cargo2 = request.JSON.cargo2
        }
        if(request.JSON.institucionDesempenaCargo != null) {
            instance1.institucionDesempenaCargo = request.JSON.institucionDesempenaCargo
        }
        instance1.save(flush: true, failOnError: true)

        //Cotitular
        Cotitular instance2 = new Cotitular()
        if(request.JSON.nombreCotitular != null) {
            instance2.nombreCotitular = request.JSON.nombreCotitular
        }
        if(request.JSON.apellidoPaternoC != null) {
            instance2.apellidoPaternoC = request.JSON.apellidoPaternoC
        }
        if(request.JSON.apellidoMaternoC != null) {
            instance2.apellidoMaternoC = request.JSON.apellidoMaternoC
        }
        if(request.JSON.estadoCivilC != null) {
            instance2.estadoCivilC = request.JSON.estadoCivilC
        }
        if(request.JSON.lugarPrestaServicios != null) {
            instance2.lugarPrestaServicios = request.JSON.lugarPrestaServicios
        }
        if(request.JSON.nombrePuestoC != null) {
            instance2.nombrePuestoC = request.JSON.nombrePuestoC
        }
        if(request.JSON.funcionesGeneralesDirectivasC != null) {
            instance2.funcionesGeneralesDirectivasC = request.JSON.funcionesGeneralesDirectivasC
        }
        if(request.JSON.nivelJerarquicoC != null) {
            instance2.nivelJerarquicoC = request.JSON.nivelJerarquicoC
        }
        if(request.JSON.antiguedadEmpleoC != null) {
            instance2.antiguedadEmpleoC = request.JSON.antiguedadEmpleoC
        }
        if(request.JSON.sectorEmpresaC != null) {
            instance2.sectorEmpresaC = request.JSON.sectorEmpresaC
        }
        if(request.JSON.tipoIngresoC != null) {
            instance2.tipoIngresoC = request.JSON.tipoIngresoC
        }
        if(request.JSON.ingresoAdicionalC != null) {
            instance2.ingresoAdicionalC = request.JSON.ingresoAdicionalC
        }
        if(request.JSON.formasProporcionaServicios != null) {
            instance2.formasProporcionaServicios = request.JSON.formasProporcionaServicios
        }
        if(request.JSON.sectorPrestaServicios != null) {
            instance2.sectorPrestaServicios = request.JSON.sectorPrestaServicios
        }
        if(request.JSON.actividadGiroEEmpresaC != null) {
            instance2.actividadGiroEEmpresaC = request.JSON.actividadGiroEEmpresaC
        }
        if(request.JSON.rfcEmpresa != null) {
            instance2.rfcEmpresa = request.JSON.rfcEmpresa
        }
        if(request.JSON.sectorDEmpresaC != null) {
            instance2.sectorDEmpresaC = request.JSON.sectorDEmpresaC
        }
        if(request.JSON.actividadGiroEmpresaC != null) {
            instance2.actividadGiroEmpresaC = request.JSON.actividadGiroEmpresaC
        }
        if(request.JSON.cingresoAdicionalC != null) {
            instance2.cingresoAdicionalC = request.JSON.cingresoAdicionalC
        }
        if(request.JSON.ocupacionActualC != null) {
            instance2.ocupacionActualC = request.JSON.ocupacionActualC
        }
        if(request.JSON.fuenteIngresoC != null) {
            instance2.fuenteIngresoC = request.JSON.fuenteIngresoC
        }
        if(request.JSON.razonSocialEmpresaC != null) {
            instance2.razonSocialEmpresaC = request.JSON.razonSocialEmpresaC
        }
        if(request.JSON.rfc != null) {
            instance2.rfc = request.JSON.rfc
        }
        if(request.JSON.nacionalidadEmpresaC != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadEmpresaC as Long)
            instance2.nacionalidadEmpresaC = nacionalidades
        }
        if(request.JSON.telefonoEmpresaC != null) {
            instance2.telefonoEmpresaC = request.JSON.telefonoEmpresaC
        }
        if(request.JSON.sector1EmpresaC != null) {
            instance2.sector1EmpresaC = request.JSON.sector1EmpresaC
        }
        if(request.JSON.actividadEmpresaC1 != null) {
            instance2.actividadEmpresaC1 = request.JSON.actividadEmpresaC1
        }
        if(request.JSON.porcentajeEmpresaC != null) {
            instance2.porcentajeEmpresaC = request.JSON.porcentajeEmpresaC
        }
        if(request.JSON.esConsejero != null) {
            instance2.esConsejero = request.JSON.esConsejero
        }
        if(request.JSON.razonSocialC != null) {
            instance2.razonSocialC = request.JSON.razonSocialC
        }
        if(request.JSON.rfcC != null) {
            instance2.rfcC = request.JSON.rfcC
        }
        if(request.JSON.nacionalidadDEmpresaC != null) {
            Nacionalidades nacionalidad = Nacionalidades.findById(request.JSON.nacionalidadEmpresaC as Long)
            instance2.nacionalidadDEmpresaC = nacionalidad
        }
        if(request.JSON.telefonoDEmpresaC != null) {
            instance2.telefonoDEmpresaC = request.JSON.telefonoDEmpresaC
        }
        if(request.JSON.sectorDLEmpresaC != null) {
            instance2.sectorDLEmpresaC = request.JSON.sectorDLEmpresaC
        }
        if(request.JSON.actividadEmpresaC2 != null) {
            instance2.actividadEmpresaC2 = request.JSON.actividadEmpresaC2
        }
        if(request.JSON.porcentajeEmpresaPertenece != null) {
            instance2.porcentajeEmpresaPertenece = request.JSON.porcentajeEmpresaPertenece
        }
        if(request.JSON.consejeroEmpresaC != null) {
            instance2.consejeroEmpresaC = request.JSON.consejeroEmpresaC
        }
        if(request.JSON.institucionesCargosPublicosRelacion != null) {
            instance2.institucionesCargosPublicosRelacion = request.JSON.institucionesCargosPublicosRelacion
        }
        if(request.JSON.institucionDesempenaCargoC != null) {
            instance2.institucionDesempenaCargoC = request.JSON.institucionDesempenaCargoC
        }
        if(request.JSON.relacionPersonaNacionalExtranjeraC != null) {
            instance2.relacionPersonaNacionalExtranjeraC = request.JSON.relacionPersonaNacionalExtranjeraC
        }
        instance2.save(flush: true, failOnError: true)

        //Procedencia de recursos
        ProcedenciaRecursos instance3 = new ProcedenciaRecursos()
        if(request.JSON.procedenciaRecurso != null) {
            instance3.procedenciaRecurso = request.JSON.procedenciaRecurso
        }
        if(request.JSON.detalleRecurso != null) {
            instance3.detalleRecurso = request.JSON.detalleRecurso
        }
        instance3.save(flush: true, failOnError: true)

        //Proveedor de recursos
        ProveedorRecursos instance4 = new ProveedorRecursos()
        if(request.JSON.proveedorrecursoNombre != null) {
            instance4.proveedorrecursoNombre = request.JSON.proveedorrecursoNombre
        }
        if(request.JSON.apellidoPaternoP != null) {
            instance4.apellidoPaternoP = request.JSON.apellidoPaternoP
        }
        if(request.JSON.apellidoMaternoP != null) {
            instance4.apellidoMaternoP = request.JSON.apellidoMaternoP
        }
        if(request.JSON.nacionalidadP != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadP as Long)
            instance4.nacionalidadP = nacionalidades
        }
        if(request.JSON.fechaNacimientoP != null) {
            instance4.fechaNacimientoP = request.JSON.fechaNacimientoP
        }
        if(request.JSON.curp != null) {
            instance4.curp = request.JSON.curp
        }
        if(request.JSON.rfcP != null) {
            instance4.rfcP = request.JSON.rfcP
        }
        if(request.JSON.firmaElectronica != null) {
            instance4.firmaElectronica = request.JSON.firmaElectronica
        }
        if(request.JSON.tipoVialidad != null) {
            instance4.tipoVialidad = request.JSON.tipoVialidad
        }
        if(request.JSON.nombreVialidad != null) {
            instance4.nombreVialidad = request.JSON.nombreVialidad
        }
        if(request.JSON.noExterior != null) {
            instance4.noExterior = request.JSON.noExterior
        }
        if(request.JSON.noInterior != null) {
            instance4.noInterior = request.JSON.noInterior
        }
        if(request.JSON.colonia != null) {
            instance4.colonia = request.JSON.colonia
        }
        if(request.JSON.municipio != null) {
            Municipios municipios = Municipios.findById(request.JSON.municipio as Long)
            instance4.municipio = municipios
        }
        if(request.JSON.ciudad != null) {
            Ciudades ciudades = Ciudades.findById(request.JSON.ciudad as Long)
            instance4.ciudad = ciudades
        }
        if(request.JSON.estado != null) {
            Estados estados = Estados.findById(request.JSON.estado as Long)
            instance4.estado = estados
        }
        if(request.JSON.cp != null) {
            instance4.cp = request.JSON.cp
        }
        if(request.JSON.paisP != null) {
            Paises paises = Paises.findById(request.JSON.paisP as Long)
            instance4.paisP = paises
        }
        if(request.JSON.personaMoralRazonSocial != null) {
            instance4.personaMoralRazonSocial = request.JSON.personaMoralRazonSocial
        }
        if(request.JSON.nacionalidad != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidad as Long)
            instance4.nacionalidad = nacionalidades
        }
        if(request.JSON.rfcPR != null) {
            instance4.rfcPR = request.JSON.rfcPR
        }
        if(request.JSON.firmaElectronicaP != null) {
            instance4.firmaElectronicaP = request.JSON.firmaElectronicaP
        }
        if(request.JSON.domicilio != null) {
            instance4.domicilio = request.JSON.domicilio
        }
        if(request.JSON.tipoVialidadP != null) {
            instance4.tipoVialidadP = request.JSON.tipoVialidadP
        }
        if(request.JSON.nombreVialidadP != null) {
            instance4.nombreVialidadP = request.JSON.nombreVialidadP
        }
        if(request.JSON.noExteriorP != null) {
            instance4.noExteriorP = request.JSON.noExteriorP
        }
        if(request.JSON.noInteriorP != null) {
            instance4.noInteriorP = request.JSON.noInteriorP
        }
        if(request.JSON.coloniaP != null) {
            instance4.coloniaP = request.JSON.coloniaP
        }
        if(request.JSON.delegacion != null) {
            Municipios municipios = Municipios.findById(request.JSON.delegacion as Long)
            instance4.delegacion = municipios
        }
        if(request.JSON.ciudadP != null) {
            Ciudades ciudades = Ciudades.findById(request.JSON.ciudadP as Long)
            instance4.ciudadP = ciudades
        }
        if(request.JSON.estadoP != null) {
            Estados estados = Estados.findById(request.JSON.estadoP as Long)
            instance4.estadoP = estados
        }
        if(request.JSON.codigoPostal != null) {
            instance4.codigoPostal = request.JSON.codigoPostal
        }
        if(request.JSON.paisPR != null) {
            Paises paises = Paises.findById(request.JSON.paisPR as Long)
            instance4.paisPR = paises
        }
        instance4.save(flush: true, failOnError: true)

        //Propietario Real
        PropietarioReal instance5 = new PropietarioReal()
        if(request.JSON.propietarioRealNombre != null) {
            instance5.propietarioRealNombre = request.JSON.propietarioRealNombre
        }
        if(request.JSON.apellidoPaternoPRE != null) {
            instance5.apellidoPaternoPRE = request.JSON.apellidoPaternoPRE
        }
        if(request.JSON.apellidoMaternoPRE != null) {
            instance5.apellidoMaternoPRE = request.JSON.apellidoMaternoPRE
        }
        if(request.JSON.genero != null) {
            instance5.genero = request.JSON.genero
        }
        if(request.JSON.fechaNacimientoPRE != null) {
            instance5.fechaNacimientoPRE = request.JSON.fechaNacimientoPRE
        }
        if(request.JSON.curpPRE != null) {
            instance5.curpPRE = request.JSON.curpPRE
        }
        if(request.JSON.paisNacimiento != null) {
            Paises paises = Paises.findById(request.JSON.paisNacimiento  as Long)
            instance5.paisNacimiento = paises
        }
        if(request.JSON.estadoNacimiento != null) {
            Estados estados = Estados.findById(request.JSON.estadoNacimiento as Long)
            instance5.estadoNacimiento = estados
        }
        if(request.JSON.nacionalidadPRE != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadPRE as Long)
            instance5.nacionalidadPRE = nacionalidades
        }
        if(request.JSON.calidadMigratoria != null) {
            instance5.calidadMigratoria = request.JSON.calidadMigratoria
        }
        if(request.JSON.paisResidencia != null) {
            Paises paises = Paises.findById(request.JSON.paisResidencia as Long)
            instance5.paisResidencia = paises
        }
        if(request.JSON.regimenFiscal != null) {
            instance5.regimenFiscal = request.JSON.regimenFiscal
        }
        if(request.JSON.rfcPRE != null) {
            instance5.rfcPRE = request.JSON.rfcPRE
        }
        if(request.JSON.firmaElectronicaAvanzada != null) {
            instance5.firmaElectronicaAvanzada = request.JSON.firmaElectronicaAvanzada
        }
        if(request.JSON.telefonoParticular != null) {
            instance5.telefonoParticular = request.JSON.telefonoParticular
        }
        if(request.JSON.telefonoCelular != null) {
            instance5.telefonoCelular = request.JSON.telefonoCelular
        }
        if(request.JSON.correoElectronico != null) {
            instance5.correoElectronico = request.JSON.correoElectronico
        }
        if(request.JSON.domicilioPropietario != null) {
            instance5.domicilioPropietario = request.JSON.domicilioPropietario
        }
        if(request.JSON.tipoVialidadPRE != null) {
            instance5.tipoVialidadPRE = request.JSON.tipoVialidadPRE
        }
        if(request.JSON.nombreVialidadPRE != null) {
            instance5.nombreVialidadPRE = request.JSON.nombreVialidadPRE
        }
        if(request.JSON.noExteriorPRE != null) {
            instance5.noExteriorPRE = request.JSON.noExteriorPRE
        }
        if(request.JSON.noInteriorPRE != null) {
            instance5.noInteriorPRE = request.JSON.noInteriorPRE
        }
        if(request.JSON.coloniaPRE != null) {
            instance5.coloniaPRE = request.JSON.coloniaPRE
        }
        if(request.JSON.delegacionPRE != null) {
            Municipios municipios = Municipios.findById(request.JSON.delegacionPRE as Long)
            instance5.delegacionPRE = municipios
        }
        if(request.JSON.ciudadPRE != null) {
            Ciudades ciudades = Ciudades.findById(request.JSON.ciudadPRE as Long)
            instance5.ciudadPRE = ciudades
        }
        if(request.JSON.estadoPRE != null) {
            Estados estados = Estados.findById(request.JSON.estadoPRE as Long)
            instance5.estadoPRE = estados
        }
        if(request.JSON.paisPRE != null) {
            Paises paises = Paises.findById(request.JSON.paisPRE)
            instance5.paisPRE = paises
        }
        if(request.JSON.codigo != null) {
            instance5.codigo = request.JSON.codigo
        }
        instance5.save(flush: true, failOnError: true)

        //Uso y movimientos de la cuenta
        UsoCuenta instance6 = new UsoCuenta()
        if(request.JSON.tipoCliente != null) {
            TipoCliente tipoCliente = TipoCliente.findById(request.JSON.tipoCliente as Long)
            instance6.tipoCliente = tipoCliente
        }
        if(request.JSON.uso != null) {
            instance6.uso = request.JSON.uso
        }
        if(request.JSON.montoDepositoInicial != null) {
            instance6.montoDepositoInicial = request.JSON.montoDepositoInicial
        }
        if(request.JSON.numeroAproxDepoMensualesMin != null) {
            instance6.numeroAproxDepoMensualesMin = request.JSON.numeroAproxDepoMensualesMin
        }
        if(request.JSON.numeroAproxDepoMensualesMax != null) {
            instance6.numeroAproxDepoMensualesMax = request.JSON.numeroAproxDepoMensualesMax
        }
        if(request.JSON.porccentajePromedioMensualDepositosMin != null) {
            instance6.porccentajePromedioMensualDepositosMin = request.JSON.porccentajePromedioMensualDepositosMin
        }
        if(request.JSON.porccentajePromedioMensualDepositosMax != null) {
            instance6.porccentajePromedioMensualDepositosMax = request.JSON.porccentajePromedioMensualDepositosMax
        }
        if(request.JSON.numeroAproxRetirosMensualesMin != null) {
            instance6.numeroAproxRetirosMensualesMin = request.JSON.numeroAproxRetirosMensualesMin
        }
        if(request.JSON.numeroAproxRetirosMensualesMax != null) {
            instance6.numeroAproxRetirosMensualesMax = request.JSON.numeroAproxRetirosMensualesMax
        }
        if(request.JSON.montoAproxMensualRetirosMin != null) {
            instance6.montoAproxMensualRetirosMin = request.JSON.montoAproxMensualRetirosMin
        }
        if(request.JSON.montoAproxMensualRetirosMax != null) {
            instance6.montoAproxMensualRetirosMax = request.JSON.montoAproxMensualRetirosMax
        }
        if(request.JSON.fechaBaja != null) {
            instance6.fechaBaja = request.JSON.fechaBaja
        }
        if(request.JSON.liqVSsaldo != null) {
            instance6.liqVSsaldo = request.JSON.liqVSsaldo
        }
        if(request.JSON.manejaCust != null) {
            instance6.manejaCust = request.JSON.manejaCust
        }
        if(request.JSON.cortoEfectivo != null) {
            instance6.cortoEfectivo = request.JSON.cortoEfectivo
        }
        instance6.save(flush: true, failOnError: true)

        //Generales
        Generales instance7 = new Generales()
        if(request.JSON.nacionalidadG != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadG as Long)
            instance7.nacionalidadG = nacionalidades
        }
        if(request.JSON.paisG != null) {
            Paises paises = Paises.findById(request.JSON.paisG as Long)
            instance7.paisG = paises
        }
        if(request.JSON.calleG != null) {
            instance7.calleG = request.JSON.calleG
        }
        if(request.JSON.noExteriorG != null) {
            instance7.noExteriorG = request.JSON.noExteriorG
        }
        if(request.JSON.noInteriorG != null) {
            instance7.noInteriorG = request.JSON.noInteriorG
        }
        if(request.JSON.coloniaG != null) {
            instance7.coloniaG = request.JSON.coloniaG
        }
        if(request.JSON.alcaldia != null) {
            Municipios municipios = Municipios.findById(request.JSON.alcaldia as Long)
            instance7.alcaldia = municipios
        }
        if(request.JSON.ciudadG != null) {
            Ciudades ciudades = Ciudades.findById(request.JSON.ciudadG as Long)
            instance7.ciudadG = ciudades
        }
        if(request.JSON.estadosG != null) {
            Estados estados = Estados.findById(request.JSON.estadosG as Long)
            instance7.estadosG = estados
        }
        if(request.JSON.cpG != null) {
            instance7.cpG = request.JSON.cpG
        }
        if(request.JSON.telefonoParticularG != null) {
            instance7.telefonoParticularG = request.JSON.telefonoParticularG
        }
        if(request.JSON.telefonoCelularG != null) {
            instance7.telefonoCelularG = request.JSON.telefonoCelularG
        }
        if(request.JSON.email != null) {
            instance7.email = request.JSON.email
        }
        if(request.JSON.rfcG != null) {
            instance7.rfcG = request.JSON.rfcG
        }
        if(request.JSON.curpG != null) {
            instance7.curpG = request.JSON.curpG
        }
        if(request.JSON.fiel != null) {
            instance7.fiel = request.JSON.fiel
        }
        instance7.save(flush: true, failOnError: true)


        Clientes instance = new Clientes()
        instance.titular = instance1
        instance.cotitular = instance2
        instance.procedenciaRecursos = instance3
        instance.proveedorRecursos = instance4
        instance.propietarioReal = instance5
        instance.usoCuenta = instance6
        instance.generales = instance7

        instance.save(flush: true, failOnError: true)

        respond(instance)
    }

    def index() {
        def clientes = Clientes.list().collect({
            [
                    id: it.id,
                    titularNombre: it.titular?.titularNombre,
                    apellidoPaterno: it.titular?.apellidoPaterno,
                    apellidoMaterno: it.titular?.apellidoMaterno,
                    promotor: it.titular?.promotor?.descLabel?it.titular.promotor.descLabel:'N/A',
                    grupoFamilia: it.titular?.grupoFamilia?.descLabel?it.titular.grupoFamilia.descLabel:'N/A'

            ]
        })

        respond(clientes)
    }

    def edit(Long id) {
        def clientes = Clientes.findById(id).collect({
            [
                    id: it.id,

                    idTitular: it.titular.id,
                    titularNombre: it.titular.titularNombre?it.titular.titularNombre:null,
                    apellidoPaterno: it.titular.apellidoPaterno?it.titular.apellidoPaterno:null,
                    apellidoMaterno: it.titular.apellidoMaterno?it.titular.apellidoMaterno:null,
                    grupoFamilia: it.titular.grupoFamilia?it.titular.grupoFamilia:null,
                    promotor: it.titular.promotor?it.titular.promotor:null,
                    tipoInversionista: it.titular.tipoInversionista?it.titular.tipoInversionista:null,
                    excentoIsr: it.titular.excentoIsr?it.titular.excentoIsr:null,
                    excentoIva: it.titular.excentoIva?it.titular.excentoIva:null,
                    fechaNacimiento: it.titular.fechaNacimiento?it.titular.fechaNacimiento:null,
                    entidadFederativaNacimiento: it.titular.entidadFederativaNacimiento?it.titular.entidadFederativaNacimiento:null,
                    fechaInicioOperaciones: it.titular.fechaInicioOperaciones?it.titular.fechaInicioOperaciones:null,
                    estadoCivil: it.titular.estadoCivil?it.titular.estadoCivil:null,
                    profesion: it.titular.profesion?it.titular.profesion:null,
                    nombreEmpresaPrestaServicios: it.titular.nombreEmpresaPrestaServicios?it.titular.nombreEmpresaPrestaServicios:null,
                    nombrePuesto: it.titular.nombrePuesto?it.titular.nombrePuesto:null,
                    funcionesGeneralesDirectivas: it.titular.funcionesGeneralesDirectivas?it.titular.funcionesGeneralesDirectivas:null,
                    nivelJerarquico: it.titular.nivelJerarquico?it.titular.nivelJerarquico:null,
                    antiguedadEmpleo: it.titular.antiguedadEmpleo?it.titular.antiguedadEmpleo:null,
                    sectorEmpresa: it.titular.sectorEmpresa?it.titular.sectorEmpresa:null,
                    giroEmpresa: it.titular.giroEmpresa?it.titular.giroEmpresa:null,
                    tipoIngreso: it.titular.tipoIngreso?it.titular.tipoIngreso:null,
                    ingresoAdicional: it.titular.ingresoAdicional?it.titular.ingresoAdicional:null,
                    sectorPrestaServicio: it.titular.sectorPrestaServicio?it.titular.sectorPrestaServicio:null,
                    giroEspecificoServicios: it.titular.giroEspecificoServicios?it.titular.giroEspecificoServicios:null,
                    sectorEmpresa2: it.titular.sectorEmpresa2?it.titular.sectorEmpresa2:null,
                    razonSocialEmpresa: it.titular.razonSocialEmpresa?it.titular.razonSocialEmpresa:null,
                    actividadEmpresa: it.titular.actividadEmpresa?it.titular.actividadEmpresa:null,
                    ingresoAdicional2: it.titular.ingresoAdicional2?it.titular.ingresoAdicional2:null,
                    ocupacionActual: it.titular.ocupacionActual?it.titular.ocupacionActual:null,
                    fuenteIngresos: it.titular.fuenteIngresos?it.titular.fuenteIngresos:null,
                    sociedadesAsociacionesRFCEmpresa: it.titular.sociedadesAsociacionesRFCEmpresa?it.titular.sociedadesAsociacionesRFCEmpresa:null,
                    nacionalidadEmpresa: it.titular.nacionalidadEmpresa?it.titular.nacionalidadEmpresa:null,
                    telefonoEmpresa: it.titular.telefonoEmpresa?it.titular.telefonoEmpresa:null,
                    sectorEmpresa3: it.titular.sectorEmpresa3?it.titular.sectorEmpresa3:null,
                    actividadGiroEspecificoEmpresa: it.titular.actividadGiroEspecificoEmpresa?it.titular.actividadGiroEspecificoEmpresa:null,
                    porcentajeCapitalSocial: it.titular.porcentajeCapitalSocial?it.titular.porcentajeCapitalSocial:null,
                    consejeroEmpresaRFCEmpresa: it.titular.consejeroEmpresaRFCEmpresa?it.titular.consejeroEmpresaRFCEmpresa:null,
                    nacionalidadEmpresa2: it.titular.nacionalidadEmpresa2?it.titular.nacionalidadEmpresa2:null,
                    telefonoEmpresa2: it.titular.telefonoEmpresa2?it.titular.telefonoEmpresa2:null,
                    sectorEmpresa4: it.titular.sectorEmpresa4?it.titular.sectorEmpresa4:null,
                    actividadGiroEmpresa3: it.titular.actividadGiroEmpresa3?it.titular.actividadGiroEmpresa3:null,
                    vinculoPatrimonial: it.titular.vinculoPatrimonial?it.titular.vinculoPatrimonial:null,
                    consejeroEmpresa: it.titular.consejeroEmpresa?it.titular.consejeroEmpresa:null,
                    cargoDesempeno: it.titular.cargoDesempeno?it.titular.cargoDesempeno:null,
                    nombreInstitucion: it.titular.nombreInstitucion?it.titular.nombreInstitucion:null,
                    institucionCargoExtranjero: it.titular.institucionCargoExtranjero?it.titular.institucionCargoExtranjero:null,
                    pais: it.titular.pais?it.titular.pais:null,
                    cargo: it.titular.cargo?it.titular.cargo:null,
                    relacionPersonaNacionalExtranjera: it.titular.relacionPersonaNacionalExtranjera?it.titular.relacionPersonaNacionalExtranjera:null,
                    cargo2: it.titular.cargo2?it.titular.cargo2:null,
                    institucionDesempenaCargo: it.titular.institucionDesempenaCargo?it.titular.institucionDesempenaCargo:null,

                    idCotitular: it.cotitular.id,
                    nombreCotitular: it.cotitular.nombreCotitular?it.cotitular.nombreCotitular:null,
                    apellidoPaternoC: it.cotitular.apellidoPaternoC?it.cotitular.apellidoPaternoC:null,
                    apellidoMaternoC: it.cotitular.apellidoMaternoC?it.cotitular.apellidoMaternoC:null,
                    estadoCivilC: it.cotitular.estadoCivilC?it.cotitular.estadoCivilC:null,
                    lugarPrestaServicios: it.cotitular.lugarPrestaServicios?it.cotitular.lugarPrestaServicios:null,
                    nombrePuestoC: it.cotitular.nombrePuestoC?it.cotitular.nombrePuestoC:null,
                    funcionesGeneralesDirectivasC: it.cotitular.funcionesGeneralesDirectivasC?it.cotitular.funcionesGeneralesDirectivasC:null,
                    nivelJerarquicoC: it.cotitular.nivelJerarquicoC?it.cotitular.nivelJerarquicoC:null,
                    antiguedadEmpleoC: it.cotitular.antiguedadEmpleoC?it.cotitular.antiguedadEmpleoC:null,
                    sectorEmpresaC: it.cotitular.sectorEmpresaC?it.cotitular.sectorEmpresaC:null,
                    tipoIngresoC: it.cotitular.tipoIngresoC?it.cotitular.tipoIngresoC:null,
                    ingresoAdicionalC: it.cotitular.ingresoAdicionalC?it.cotitular.ingresoAdicionalC:null,
                    formasProporcionaServicios: it.cotitular.formasProporcionaServicios?it.cotitular.formasProporcionaServicios:null,
                    sectorPrestaServicios: it.cotitular.sectorPrestaServicios?it.cotitular.sectorPrestaServicios:null,
                    actividadGiroEEmpresaC: it.cotitular.actividadGiroEEmpresaC?it.cotitular.actividadGiroEEmpresaC:null,
                    rfcEmpresa: it.cotitular.rfcEmpresa?it.cotitular.rfcEmpresa:null,
                    sectorDEmpresaC: it.cotitular.sectorDEmpresaC?it.cotitular.sectorDEmpresaC:null,
                    actividadGiroEmpresaC: it.cotitular.actividadGiroEmpresaC?it.cotitular.actividadGiroEmpresaC:null,
                    cingresoAdicionalC: it.cotitular.cingresoAdicionalC?it.cotitular.cingresoAdicionalC:null,
                    ocupacionActualC: it.cotitular.ocupacionActualC?it.cotitular.ocupacionActualC:null,
                    fuenteIngresoC: it.cotitular.fuenteIngresoC?it.cotitular.fuenteIngresoC:null,
                    razonSocialEmpresaC: it.cotitular.razonSocialEmpresaC?it.cotitular.razonSocialEmpresaC:null,
                    rfc: it.cotitular.rfc?it.cotitular.rfc:null,
                    nacionalidadEmpresaC: it.cotitular.nacionalidadEmpresaC?it.cotitular.nacionalidadEmpresaC:null,
                    telefonoEmpresaC: it.cotitular.telefonoEmpresaC?it.cotitular.telefonoEmpresaC:null,
                    sectorDeEmpresaC: it.cotitular.sectorDeEmpresaC?it.cotitular.sectorDeEmpresaC:null,
                    actividadEmpresaC1: it.cotitular.actividadEmpresaC1?it.cotitular.actividadEmpresaC1:null,
                    porcentajeEmpresaC: it.cotitular.porcentajeEmpresaC?it.cotitular.porcentajeEmpresaC:null,
                    esConsejero: it.cotitular.esConsejero?it.cotitular.esConsejero:null,
                    razonSocialC: it.cotitular.razonSocialC?it.cotitular.razonSocialC:null,
                    rfcC: it.cotitular.rfcC?it.cotitular.rfcC:null,
                    nacionalidadDEmpresaC: it.cotitular.nacionalidadDEmpresaC?it.cotitular.nacionalidadDEmpresaC:null,
                    telefonoDEmpresaC: it.cotitular.telefonoDEmpresaC?it.cotitular.telefonoDEmpresaC:null,
                    sectorDLEmpresaC: it.cotitular.sectorDLEmpresaC?it.cotitular.sectorDLEmpresaC:null,
                    actividadEmpresaC2: it.cotitular.actividadEmpresaC2?it.cotitular.actividadEmpresaC2:null,
                    porcentajeEmpresaPertenece: it.cotitular.porcentajeEmpresaPertenece?it.cotitular.porcentajeEmpresaPertenece:null,
                    consejeroEmpresaC: it.cotitular.consejeroEmpresaC?it.cotitular.consejeroEmpresaC:null,
                    institucionesCargosPublicosRelacion: it.cotitular.institucionesCargosPublicosRelacion?it.cotitular.institucionesCargosPublicosRelacion:null,
                    institucionDesempenaCargoC: it.cotitular.institucionDesempenaCargoC?it.cotitular.institucionDesempenaCargoC:null,
                    relacionPersonaNacionalExtranjeraC: it.cotitular.relacionPersonaNacionalExtranjeraC?it.cotitular.relacionPersonaNacionalExtranjeraC:null,

                    idProcedencia: it.procedenciaRecursos.id,
                    procedenciaRecurso: it.procedenciaRecursos.procedenciaRecurso?it.procedenciaRecursos.procedenciaRecurso:null,
                    detalleRecurso: it.procedenciaRecursos.detalleRecurso?it.procedenciaRecursos.detalleRecurso:null,

                    idProveedor: it.proveedorRecursos.id,
                    proveedorrecursoNombre: it.proveedorRecursos.proveedorrecursoNombre?it.proveedorRecursos.proveedorrecursoNombre:null,
                    apellidoPaternoP: it.proveedorRecursos.apellidoPaternoP?it.proveedorRecursos.apellidoPaternoP:null,
                    apellidoMaternoP: it.proveedorRecursos.apellidoMaternoP?it.proveedorRecursos.apellidoMaternoP:null,
                    nacionalidadP: it.proveedorRecursos.nacionalidadP?it.proveedorRecursos.nacionalidadP:null,
                    fechaNacimientoP: it.proveedorRecursos.fechaNacimientoP?it.proveedorRecursos.fechaNacimientoP:null,
                    curp: it.proveedorRecursos.curp?it.proveedorRecursos.curp:null,
                    rfcP: it.proveedorRecursos.rfcP?it.proveedorRecursos.rfcP:null,
                    firmaElectronica: it.proveedorRecursos.firmaElectronica?it.proveedorRecursos.firmaElectronica:null,
                    tipoVialidad: it.proveedorRecursos.tipoVialidad?it.proveedorRecursos.tipoVialidad:null,
                    nombreVialidad: it.proveedorRecursos.nombreVialidad?it.proveedorRecursos.nombreVialidad:null,
                    noExterior: it.proveedorRecursos.noExterior?it.proveedorRecursos.noExterior:null,
                    noInterior: it.proveedorRecursos.noInterior?it.proveedorRecursos.noInterior:null,
                    colonia: it.proveedorRecursos.colonia?it.proveedorRecursos.colonia:null,
                    municipio: it.proveedorRecursos.municipio?it.proveedorRecursos.municipio:null,
                    ciudad: it.proveedorRecursos.ciudad?it.proveedorRecursos.ciudad:null,
                    estado: it.proveedorRecursos.estado?it.proveedorRecursos.estado:null,
                    cp: it.proveedorRecursos.cp?it.proveedorRecursos.cp:null,
                    paisP: it.proveedorRecursos.paisP?it.proveedorRecursos.paisP:null,
                    personaMoralRazonSocial: it.proveedorRecursos.personaMoralRazonSocial?it.proveedorRecursos.personaMoralRazonSocial:null,
                    nacionalidad: it.proveedorRecursos.nacionalidad?it.proveedorRecursos.nacionalidad:null,
                    rfcPR: it.proveedorRecursos.rfcPR?it.proveedorRecursos.rfcPR:null,
                    firmaElectronicaP: it.proveedorRecursos.firmaElectronicaP?it.proveedorRecursos.firmaElectronicaP:null,
                    domicilio: it.proveedorRecursos.domicilio?it.proveedorRecursos.domicilio:null,
                    tipoVialidadP: it.proveedorRecursos.tipoVialidadP?it.proveedorRecursos.tipoVialidadP:null,
                    nombreVialidadP: it.proveedorRecursos.nombreVialidadP?it.proveedorRecursos.nombreVialidadP:null,
                    noExteriorP: it.proveedorRecursos.noExteriorP?it.proveedorRecursos.noExteriorP:null,
                    noInteriorP: it.proveedorRecursos.noInteriorP?it.proveedorRecursos.noInteriorP:null,
                    coloniaP: it.proveedorRecursos.coloniaP?it.proveedorRecursos.coloniaP:null,
                    delegacion: it.proveedorRecursos.delegacion?it.proveedorRecursos.delegacion:null,
                    ciudadP: it.proveedorRecursos.ciudadP?it.proveedorRecursos.ciudadP:null,
                    estadoP: it.proveedorRecursos.estadoP?it.proveedorRecursos.estadoP:null,
                    codigoPostal: it.proveedorRecursos.codigoPostal?it.proveedorRecursos.codigoPostal:null,
                    paisPR: it.proveedorRecursos.paisPR?it.proveedorRecursos.paisPR:null,

                    idPropietario: it.propietarioReal.id,
                    propietarioRealNombre: it.propietarioReal.propietarioRealNombre?it.propietarioReal.propietarioRealNombre:null,
                    apellidoPaternoPRE: it.propietarioReal.apellidoPaternoPRE?it.propietarioReal.apellidoPaternoPRE:null,
                    apellidoMaternoPRE: it.propietarioReal.apellidoMaternoPRE?it.propietarioReal.apellidoMaternoPRE:null,
                    genero: it.propietarioReal.genero?it.propietarioReal.genero:null,
                    fechaNacimientoPRE: it.propietarioReal.fechaNacimientoPRE?it.propietarioReal.fechaNacimientoPRE:null,
                    curpPRE: it.propietarioReal.curpPRE?it.propietarioReal.curpPRE:null,
                    paisNacimiento: it.propietarioReal.paisNacimiento?it.propietarioReal.paisNacimiento:null,
                    estadoNacimiento: it.propietarioReal.estadoNacimiento?it.propietarioReal.estadoNacimiento:null,
                    nacionalidadPRE: it.propietarioReal.nacionalidadPRE?it.propietarioReal.nacionalidadPRE:null,
                    calidadMigratoria: it.propietarioReal.calidadMigratoria?it.propietarioReal.calidadMigratoria:null,
                    paisResidencia: it.propietarioReal.paisResidencia?it.propietarioReal.paisResidencia:null,
                    regimenFiscal: it.propietarioReal.regimenFiscal?it.propietarioReal.regimenFiscal:null,
                    rfcPRE: it.propietarioReal.rfcPRE?it.propietarioReal.rfcPRE:null,
                    firmaElectronicaAvanzada: it.propietarioReal.firmaElectronicaAvanzada?it.propietarioReal.firmaElectronicaAvanzada:null,
                    telefonoParticular: it.propietarioReal.telefonoParticular?it.propietarioReal.telefonoParticular:null,
                    telefonoCelular: it.propietarioReal.telefonoCelular?it.propietarioReal.telefonoCelular:null,
                    correoElectronico: it.propietarioReal.correoElectronico?it.propietarioReal.correoElectronico:null,
                    domicilioPropietario: it.propietarioReal.domicilioPropietario?it.propietarioReal.domicilioPropietario:null,
                    tipoVialidadPRE: it.propietarioReal.tipoVialidadPRE?it.propietarioReal.tipoVialidadPRE:null,
                    nombreVialidadPRE: it.propietarioReal.nombreVialidadPRE?it.propietarioReal.nombreVialidadPRE:null,
                    noExteriorPRE: it.propietarioReal.noExteriorPRE?it.propietarioReal.noExteriorPRE:null,
                    noInteriorPRE: it.propietarioReal.noInteriorPRE?it.propietarioReal.noInteriorPRE:null,
                    coloniaPRE: it.propietarioReal.coloniaPRE?it.propietarioReal.coloniaPRE:null,
                    delegacionPRE: it.propietarioReal.delegacionPRE?it.propietarioReal.delegacionPRE:null,
                    ciudadPRE: it.propietarioReal.ciudadPRE?it.propietarioReal.ciudadPRE:null,
                    estadoPRE: it.propietarioReal.estadoPRE?it.propietarioReal.estadoPRE:null,
                    paisPRE: it.propietarioReal.paisPRE?it.propietarioReal.paisPRE:null,
                    codigo: it.propietarioReal.codigo?it.propietarioReal.codigo:null,

                    idUso: it.usoCuenta.id,
                    tipoCliente: it.usoCuenta.tipoCliente?it.usoCuenta.tipoCliente:null,
                    uso: it.usoCuenta.uso?it.usoCuenta.uso:null,
                    montoDepositoInicial: it.usoCuenta.montoDepositoInicial?it.usoCuenta.montoDepositoInicial:null,
                    numeroAproxDepoMensualesMin: it.usoCuenta.numeroAproxDepoMensualesMin?it.usoCuenta.numeroAproxDepoMensualesMin:null,
                    numeroAproxDepoMensualesMax: it.usoCuenta.numeroAproxDepoMensualesMax?it.usoCuenta.numeroAproxDepoMensualesMax:null,
                    porccentajePromedioMensualDepositosMin: it.usoCuenta.porccentajePromedioMensualDepositosMin?it.usoCuenta.porccentajePromedioMensualDepositosMin:null,
                    porccentajePromedioMensualDepositosMax: it.usoCuenta.porccentajePromedioMensualDepositosMax?it.usoCuenta.porccentajePromedioMensualDepositosMax:null,
                    numeroAproxRetirosMensualesMin: it.usoCuenta.numeroAproxRetirosMensualesMin?it.usoCuenta.numeroAproxRetirosMensualesMin:null,
                    numeroAproxRetirosMensualesMax: it.usoCuenta.numeroAproxRetirosMensualesMax?it.usoCuenta.numeroAproxRetirosMensualesMax:null,
                    montoAproxMensualRetirosMin: it.usoCuenta.montoAproxMensualRetirosMin?it.usoCuenta.montoAproxMensualRetirosMin:null,
                    montoAproxMensualRetirosMax: it.usoCuenta.montoAproxMensualRetirosMax?it.usoCuenta.montoAproxMensualRetirosMax:null,
                    fechaBaja: it.usoCuenta.fechaBaja?it.usoCuenta.fechaBaja:null,
                    liqVSsaldo: it.usoCuenta.liqVSsaldo?it.usoCuenta.liqVSsaldo:null,
                    manejaCust: it.usoCuenta.manejaCust?it.usoCuenta.manejaCust:null,
                    cortoEfectivo: it.usoCuenta.cortoEfectivo?it.usoCuenta.cortoEfectivo:null,

                    idGenerales: it.generales.id,
                    nacionalidadG: it.generales.nacionalidadG?it.generales.nacionalidadG:null,
                    paisG: it.generales.paisG?it.generales.paisG:null,
                    calleG: it.generales.calleG?it.generales.calleG:null,
                    noExteriorG: it.generales.noExteriorG?it.generales.noExteriorG:null,
                    noInteriorG: it.generales.noInteriorG?it.generales.noInteriorG:null,
                    coloniaG: it.generales.coloniaG?it.generales.coloniaG:null,
                    alcaldia: it.generales.alcaldia?it.generales.alcaldia:null,
                    ciudadG: it.generales.ciudadG?it.generales.ciudadG:null,
                    estadosG: it.generales.estadosG?it.generales.estadosG:null,
                    cpG: it.generales.cpG?it.generales.cpG:null,
                    telefonoParticularG: it.generales.telefonoParticularG?it.generales.telefonoParticularG:null,
                    telefonoCelularG: it.generales.telefonoCelularG?it.generales.telefonoCelularG:null,
                    email: it.generales.email?it.generales.email:null,
                    rfcG: it.generales.rfcG?it.generales.rfcG:null,
                    curpG: it.generales.curpG?it.generales.curpG:null,
                    fiel: it.generales.fiel?it.generales.fiel:null,
            ]
        })

        respond(clientes[0])
    }

    @Transactional
    def update(Long id) {
        request.JSON
        params

        def clientes = Clientes.findById(id)

        def titular = Titular.findById(clientes.titular.id)
        titular.titularNombre = request.JSON.titularNombre
        titular.apellidoPaterno = request.JSON.apellidoPaterno
        titular.apellidoMaterno = request.JSON.apellidoMaterno
        if(request.JSON.grupoFamilia != null) {
            GrupoFamilia grupo = GrupoFamilia.findByClave(request.JSON.grupoFamilia as String)
            titular.grupoFamilia = grupo
        }
        if(request.JSON.promotor != null) {
            Promotor promotor = Promotor.findById(request.JSON.promotor as Long)
            titular.promotor = promotor
        }
        if(request.JSON.tipoInversionista != null) {
            TipoInversionistas tipoInversionistas = TipoInversionistas.findByCveTipoInversionista(request.JSON.tipoInversionista as String)
            titular.tipoInversionista = tipoInversionistas
        }
        titular.excentoIsr = request.JSON.excentoIsr
        titular.excentoIva = request.JSON.excentoIva
        titular.fechaNacimiento = request.JSON.fechaNacimiento
        if(request.JSON.entidadFederativaNacimiento != null) {
            Estados estados = Estados.findById(request.JSON.entidadFederativaNacimiento as Long)
            titular.entidadFederativaNacimiento = estados
        }
        titular.fechaInicioOperaciones = request.JSON.fechaInicioOperaciones
        titular.estadoCivil = request.JSON.estadoCivil
        if(request.JSON.profesion != null) {
            Profesiones profesiones = Profesiones.findById(request.JSON.profesion as Long)
            titular.profesion = profesiones
        }
        titular.nombreEmpresaPrestaServicios = request.JSON.nombreEmpresaPrestaServicios
        titular.nombrePuesto = request.JSON.nombrePuesto
        titular.funcionesGeneralesDirectivas = request.JSON.funcionesGeneralesDirectivas
        titular.nivelJerarquico = request.JSON.nivelJerarquico
        titular.antiguedadEmpleo = request.JSON.antiguedadEmpleo
        titular.sectorEmpresa = request.JSON.sectorEmpresa
        titular.giroEmpresa = request.JSON.giroEmpresa
        titular.tipoIngreso = request.JSON.tipoIngreso
        titular.ingresoAdicional = request.JSON.ingresoAdicional
        titular.sectorPrestaServicio = request.JSON.sectorPrestaServicio
        if(request.JSON.giroEspecificoServicios != null) {
            ActVulnerable actVulnerable = ActVulnerable.findByCveActVulnerable(request.JSON.giroEspecificoServicios as String)
            titular.giroEspecificoServicios = actVulnerable
        }
        titular.sectorEmpresa2 = request.JSON.sectorEmpresa2
        titular.razonSocialEmpresa = request.JSON.razonSocialEmpresa
        titular.actividadEmpresa = request.JSON.actividadEmpresa
        titular.ingresoAdicional2 = request.JSON.ingresoAdicional2
        titular.ocupacionActual = request.JSON.ocupacionActual
        titular.fuenteIngresos = request.JSON.fuenteIngresos
        titular.sociedadesAsociacionesRFCEmpresa = request.JSON.sociedadesAsociacionesRFCEmpresa
        if(request.JSON.nacionalidadEmpresa != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadEmpresa as Long)
            titular.nacionalidadEmpresa = nacionalidades
        }
        titular.telefonoEmpresa = request.JSON.telefonoEmpresa
        titular.sectorEmpresa3 = request.JSON.sectorEmpresa3
        titular.actividadGiroEspecificoEmpresa = request.JSON.actividadGiroEspecificoEmpresa
        titular.porcentajeCapitalSocial = request.JSON.porcentajeCapitalSocial
        titular.consejeroEmpresaRFCEmpresa = request.JSON.consejeroEmpresaRFCEmpresa
        if(request.JSON.nacionalidadEmpresa2 != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadEmpresa2 as Long)
            titular.nacionalidadEmpresa2 = nacionalidades
        }
        titular.telefonoEmpresa2 = request.JSON.telefonoEmpresa2
        titular.sectorEmpresa4 = request.JSON.sectorEmpresa4
        titular.actividadGiroEmpresa3 = request.JSON.actividadGiroEmpresa3
        titular.vinculoPatrimonial = request.JSON.vinculoPatrimonial
        titular.consejeroEmpresa = request.JSON.consejeroEmpresa
        titular.cargoDesempeno = request.JSON.cargoDesempeno
        titular.nombreInstitucion = request.JSON.nombreInstitucion
        titular.institucionCargoExtranjero = request.JSON.institucionCargoExtranjero
        if(request.JSON.pais != null) {
            Paises paises = Paises.findById(request.JSON.pais as Long)
            titular.pais = paises
        }
        titular.cargo = request.JSON.cargo
        titular.relacionPersonaNacionalExtranjera = request.JSON.relacionPersonaNacionalExtranjera
        titular.cargo2 = request.JSON.cargo2
        titular.institucionDesempenaCargo = request.JSON.institucionDesempenaCargo
        titular.save(flush: true, failOnError: true)

        def cotitular = Cotitular.findById(clientes.cotitular.id)
        cotitular.nombreCotitular = request.JSON.nombreCotitular
        cotitular.apellidoPaternoC = request.JSON.apellidoPaternoC
        cotitular.apellidoMaternoC = request.JSON.apellidoMaternoC
        cotitular.estadoCivilC = request.JSON.estadoCivilC
        cotitular.lugarPrestaServicios = request.JSON.lugarPrestaServicios
        cotitular.nombrePuestoC = request.JSON.nombrePuestoC
        cotitular.funcionesGeneralesDirectivasC = request.JSON.funcionesGeneralesDirectivasC
        cotitular.nivelJerarquicoC = request.JSON.nivelJerarquicoC
        cotitular.antiguedadEmpleoC = request.JSON.antiguedadEmpleoC
        cotitular.sectorEmpresaC = request.JSON.sectorEmpresaC
        cotitular.tipoIngresoC = request.JSON.tipoIngresoC
        cotitular.ingresoAdicionalC = request.JSON.ingresoAdicionalC
        cotitular.formasProporcionaServicios = request.JSON.formasProporcionaServicios
        cotitular.sectorPrestaServicios = request.JSON.sectorPrestaServicios
        cotitular.actividadGiroEEmpresaC = request.JSON.actividadGiroEEmpresaC
        cotitular.rfcEmpresa = request.JSON.rfcEmpresa
        cotitular.sectorDEmpresaC = request.JSON.sectorDEmpresaC
        cotitular.actividadGiroEmpresaC = request.JSON.actividadGiroEmpresaC
        cotitular.cingresoAdicionalC = request.JSON.cingresoAdicionalC
        cotitular.ocupacionActualC = request.JSON.ocupacionActualC
        cotitular.fuenteIngresoC = request.JSON.fuenteIngresoC
        cotitular.razonSocialEmpresaC = request.JSON.razonSocialEmpresaC
        cotitular.rfc = request.JSON.rfc
        if(request.JSON.nacionalidadEmpresaC != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadEmpresaC as Long)
            cotitular.nacionalidadEmpresaC = nacionalidades
        }
        cotitular.telefonoEmpresaC = request.JSON.telefonoEmpresaC
        cotitular.sectorDeEmpresaC = request.JSON.sectorDeEmpresaC
        cotitular.actividadEmpresaC1 = request.JSON.actividadEmpresaC1
        cotitular.porcentajeEmpresaC = request.JSON.porcentajeEmpresaC
        cotitular.esConsejero = request.JSON.esConsejero
        cotitular.razonSocialC = request.JSON.razonSocialC
        cotitular.rfcC = request.JSON.rfcC
        if(request.JSON.nacionalidadDEmpresaC != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadDEmpresaC as Long)
            cotitular.nacionalidadDEmpresaC = nacionalidades
        }
        cotitular.telefonoDEmpresaC = request.JSON.telefonoDEmpresaC
        cotitular.sectorDLEmpresaC = request.JSON.sectorDLEmpresaC
        cotitular.actividadEmpresaC2 = request.JSON.actividadEmpresaC2
        cotitular.porcentajeEmpresaPertenece = request.JSON.porcentajeEmpresaPertenece
        cotitular.consejeroEmpresaC = request.JSON.consejeroEmpresaC
        cotitular.institucionesCargosPublicosRelacion = request.JSON.institucionesCargosPublicosRelacion
        cotitular.institucionDesempenaCargoC = request.JSON.institucionDesempenaCargoC
        cotitular.relacionPersonaNacionalExtranjeraC = request.JSON.relacionPersonaNacionalExtranjeraC
        cotitular.save(flush: true, failOnError: true)

        def procedenciaRecursos = ProcedenciaRecursos.findById(clientes.procedenciaRecursos.id)
        procedenciaRecursos.procedenciaRecurso = request.JSON.procedenciaRecurso
        procedenciaRecursos.detalleRecurso = request.JSON.detalleRecurso
        procedenciaRecursos.save(flush: true, failOnError: true)

        def proveedorRecursos = ProveedorRecursos.findById(clientes.proveedorRecursos.id)
        proveedorRecursos.proveedorrecursoNombre = request.JSON.proveedorrecursoNombre
        proveedorRecursos.apellidoPaternoP = request.JSON.apellidoPaternoP
        proveedorRecursos.apellidoMaternoP = request.JSON.apellidoMaternoP
        if(request.JSON.nacionalidadP != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadP as Long)
            proveedorRecursos.nacionalidadP = nacionalidades
        }
        proveedorRecursos.fechaNacimientoP = request.JSON.fechaNacimientoP
        proveedorRecursos.curp = request.JSON.curp
        proveedorRecursos.rfcP = request.JSON.rfcP
        proveedorRecursos.firmaElectronica = request.JSON.firmaElectronica
        proveedorRecursos.tipoVialidad = request.JSON.tipoVialidad
        proveedorRecursos.nombreVialidad = request.JSON.nombreVialidad
        proveedorRecursos.noExterior = request.JSON.noExterior
        proveedorRecursos.noInterior = request.JSON.noInterior
        proveedorRecursos.colonia = request.JSON.colonia
        if(request.JSON.municipio != null) {
            Municipios municipios = Municipios.findById(request.JSON.municipio as Long)
            proveedorRecursos.municipio = municipios
        }
        if(request.JSON.ciudad) {
            Ciudades ciudades = Ciudades.findById(request.JSON.ciudad as Long)
            proveedorRecursos.ciudad = ciudades
        }
        if(request.JSON.estado != null) {
            Estados estados = Estados.findById(request.JSON.estado as Long)
            proveedorRecursos.estado = estados
        }
        proveedorRecursos.cp = request.JSON.cp
        if(request.JSON.paisP != null) {
            Paises paises = Paises.findById(request.JSON.paisP as Long)
            proveedorRecursos.paisP = paises
        }
        proveedorRecursos.personaMoralRazonSocial = request.JSON.personaMoralRazonSocial
        if(request.JSON.nacionalidad != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidad as Long)
            proveedorRecursos.nacionalidad = nacionalidades
        }
        proveedorRecursos.rfcPR = request.JSON.rfcPR
        proveedorRecursos.firmaElectronicaP = request.JSON.firmaElectronicaP
        proveedorRecursos.domicilio = request.JSON.domicilio
        proveedorRecursos.tipoVialidadP = request.JSON.tipoVialidadP
        proveedorRecursos.nombreVialidadP = request.JSON.nombreVialidadP
        proveedorRecursos.noExteriorP = request.JSON.noExteriorP
        proveedorRecursos.noInteriorP = request.JSON.noInteriorP
        proveedorRecursos.coloniaP = request.JSON.coloniaP
        if(request.JSON.delegacion != null) {
            Municipios municipios = Municipios.findById(request.JSON.delegacion as Long)
            proveedorRecursos.delegacion = municipios
        }
        if(request.JSON.ciudadP != null) {
            Ciudades ciudades = Ciudades.findById(request.JSON.ciudadP as Long)
            proveedorRecursos.ciudadP = ciudades
        }
        if(request.JSON.estadoP != null) {
            Estados estados = Estados.findById(request.JSON.estadoP as Long)
            proveedorRecursos.estadoP = estados
        }
        proveedorRecursos.codigoPostal = request.JSON.codigoPostal
        if(request.JSON.paisPR != null) {
            Paises paises = Paises.findById(request.JSON.paisPR as Long)
            proveedorRecursos.paisPR = paises
        }
        proveedorRecursos.save(flush: true, failOnError: true)

        def propietarioReal = PropietarioReal.findById(clientes.propietarioReal.id)
        propietarioReal.propietarioRealNombre = request.JSON.propietarioRealNombre
        propietarioReal.apellidoPaternoPRE = request.JSON.apellidoPaternoPRE
        propietarioReal.apellidoMaternoPRE = request.JSON.apellidoMaternoPRE
        propietarioReal.genero = request.JSON.genero
        propietarioReal.fechaNacimientoPRE = request.JSON.fechaNacimientoPRE
        propietarioReal.curpPRE = request.JSON.curpPRE
        if(request.JSON.paisNacimiento != null) {
            Paises paises = Paises.findById(request.JSON.paisNacimiento as Long)
            propietarioReal.paisNacimiento = paises
        }
        if(request.JSON.estadoNacimiento != null) {
            Estados estados = Estados.findById(request.JSON.estadoNacimiento as Long)
            propietarioReal.estadoNacimiento = estados
        }
        if(request.JSON.nacionalidadPRE != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadPRE as Long)
            propietarioReal.nacionalidadPRE = nacionalidades
        }
        propietarioReal.calidadMigratoria = request.JSON.calidadMigratoria
        propietarioReal.paisResidencia = request.JSON.paisResidencia
        propietarioReal.regimenFiscal = request.JSON.regimenFiscal
        propietarioReal.rfcPRE = request.JSON.rfcPRE
        propietarioReal.firmaElectronicaAvanzada = request.JSON.firmaElectronicaAvanzada
        propietarioReal.telefonoParticular = request.JSON.telefonoParticular
        propietarioReal.telefonoCelular = request.JSON.telefonoCelular
        propietarioReal.correoElectronico = request.JSON.correoElectronico
        propietarioReal.domicilioPropietario = request.JSON.domicilioPropietario
        propietarioReal.tipoVialidadPRE = request.JSON.tipoVialidadPRE
        propietarioReal.nombreVialidadPRE = request.JSON.nombreVialidadPRE
        propietarioReal.noExteriorPRE = request.JSON.noExteriorPRE
        propietarioReal.noInteriorPRE = request.JSON.noInteriorPRE
        propietarioReal.coloniaPRE = request.JSON.coloniaPRE
        if(request.JSON.delegacionPRE != null) {
            Municipios municipios = Municipios.findById(request.JSON.delegacionPRE as Long)
            propietarioReal.delegacionPRE = municipios
        }
        if(request.JSON.ciudadPRE != null) {
            Ciudades ciudades = Ciudades.findById(request.JSON.ciudadPRE as Long)
            propietarioReal.ciudadPRE = ciudades
        }
        if(request.JSON.estadoPRE != null) {
            Estados estados = Estados.findById(request.JSON.estadoPRE as Long)
            propietarioReal.estadoPRE = estados
        }
        if(request.JSON.paisPRE != null) {
            Paises paises = Paises.findById(request.JSON.paisPRE as Long)
            propietarioReal.paisPRE = paises
        }
        propietarioReal.codigo = request.JSON.codigo
        propietarioReal.save(flush: true, failOnError: true)

        def usoCuenta = UsoCuenta.findById(clientes.usoCuenta.id)
        if(request.JSON.tipoCliente != null) {
            TipoCliente tipoCliente = TipoCliente.findById(request.JSON.tipoCliente as Long)
            usoCuenta.tipoCliente = tipoCliente
        }
        usoCuenta.uso = request.JSON.uso
        usoCuenta.montoDepositoInicial = request.JSON.montoDepositoInicial
        usoCuenta.numeroAproxDepoMensualesMin = request.JSON.numeroAproxDepoMensualesMin
        usoCuenta.numeroAproxDepoMensualesMax = request.JSON.numeroAproxDepoMensualesMax
        usoCuenta.porccentajePromedioMensualDepositosMin = request.JSON.porccentajePromedioMensualDepositosMin
        usoCuenta.porccentajePromedioMensualDepositosMax = request.JSON.porccentajePromedioMensualDepositosMax
        usoCuenta.numeroAproxRetirosMensualesMin = request.JSON.numeroAproxRetirosMensualesMin
        usoCuenta.numeroAproxRetirosMensualesMax = request.JSON.numeroAproxRetirosMensualesMax
        usoCuenta.montoAproxMensualRetirosMin = request.JSON.montoAproxMensualRetirosMin
        usoCuenta.montoAproxMensualRetirosMax = request.JSON.montoAproxMensualRetirosMax
        usoCuenta.fechaBaja = request.JSON.fechaBaja
        usoCuenta.liqVSsaldo = request.JSON.liqVSsaldo
        usoCuenta.manejaCust = request.JSON.manejaCust
        usoCuenta.cortoEfectivo = request.JSON.cortoEfectivo
        usoCuenta.save(flush: true, failOnError: true)

        def generales = Generales.findById(clientes.generales.id)
        if(request.JSON.nacionalidadG != null) {
            Nacionalidades nacionalidades = Nacionalidades.findById(request.JSON.nacionalidadG as Long)
            generales.nacionalidadG = nacionalidades
        }
        if(request.JSON.paisG != null) {
            Paises paises = Paises.findById(request.JSON.paisG as Long)
            generales.paisG = paises
        }
        generales.calleG = request.JSON.calleG
        generales.noExteriorG = request.JSON.noExteriorG
        generales.noInteriorG = request.JSON.noInteriorG
        generales.coloniaG = request.JSON.coloniaG
        if(request.JSON.alcaldia != null) {
            Municipios municipios = Municipios.findById(request.JSON.alcaldia as Long)
            generales.alcaldia = municipios
        }
        if(request.JSON.ciudadG != null) {
            Ciudades ciudades = Ciudades.findById(request.JSON.ciudadG as Long)
            generales.ciudadG = ciudades
        }
        if(request.JSON.estadosG) {
            Estados estados = Estados.findById(request.JSON.estadosG as Long)
            generales.estadosG = estados
        }
        generales.cpG = request.JSON.cpG
        generales.telefonoParticularG = request.JSON.telefonoParticularG
        generales.telefonoCelularG = request.JSON.telefonoCelularG
        generales.email = request.JSON.email
        generales.rfcG = request.JSON.rfcG
        generales.curpG = request.JSON.curpG
        generales.fiel = request.JSON.fiel
        generales.save(flush: true, failOnError: true)
    }
}
