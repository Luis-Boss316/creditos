package mx.saccsa.creditos

class Clientes {
    //Titular
    String titularNombre
    String apellidoPaterno
    String apellidoMaterno
    GrupoFamilia grupoFamilia
    Promotor promotor
    TipoInversionistas tipoInversionista
    Boolean excentoIsr
    Boolean excentoIva
    Date fechaNacimiento
    Estados entidadFederativaNacimiento
    Date fechaInicioOperaciones
    String estadoCivil
    Profesiones profesion
    String nombreEmpresaPrestaServicios
    String nombrePuesto
    String funcionesGeneralesDirectivas
    String nivelJerarquico
    String antiguedadEmpleo
    String sectorEmpresa
    String giroEmpresa
    String tipoIngreso
    String ingresoAdicional

//    Si es prestador de servicios independiente, responda la forma en que proporciona sus servicios es:
    String sectorPrestaServicio
    ActVulnerable giroEspecificoServicios
    String sectorEmpresa2
    String razonSocialEmpresa
    String actividadEmpresa
    String ingresoAdicional2

//    En caso de NO ser empleado NI prestador de servicios, favor de responder lo siguiente:
    String ocupacionActual
    String fuenteIngresos

//    En caso de existir Sociedades y Asociaciones con las que tiene relacion o vinculos patrimoniales u ocupe algun cargo de consejero:
    String sociedadesAsociacionesRFCEmpresa
    Nacionalidades nacionalidadEmpresa
    String telefonoEmpresa
    String sectorEmpresa3
    String actividadGiroEspecificoEmpresa
    String porcentajeCapitalSocial
    String consejeroEmpresaRFCEmpresa
    Nacionalidades nacionalidadEmpresa2
    String telefonoEmpresa2
    String sectorEmpresa4
    String actividadGiroEmpresa3
    String vinculoPatrimonial
    String consejeroEmpresa

//    Instituciones o cargos publicos con los que tiene relacion o vinculos:
    String cargoDesempeno
    String nombreInstitucion
    String institucionCargoExtranjero
    Paises pais
    String cargo
    String relacionPersonaNacionalExtranjera
    String cargo2
    String institucionDesempenaCargo

//Cotitular
    String nombreCotitular
    String apellidoPaternoC
    String apellidoMaternoC
    String estadoCivilC
    String lugarPrestaServicios
    String nombrePuestoC
    String funcionesGeneralesDirectivasC
    String nivelJerarquicoC
    String antiguedadEmpleoC
    String sectorEmpresaC
    String tipoIngresoC
    String ingresoAdicionalC

//    En caso de ser prestador de servicios independiente, favor de responder lo siguiente:
    String formasProporcionaServicios
    String sectorPrestaServicios
    String actividadGiroEEmpresaC
    String rfcEmpresa
    String sectorDEmpresaC
    String actividadGiroEmpresaC
    String cingresoAdicionalC
    String ocupacionActualC
    String fuenteIngresoC

//    En caso de existir sociedades y asociaciones con las que tiene relacion o vinculos patrimoniales u ocupe algun cargo de consejero:
    String razonSocialEmpresaC
    String rfc
    Nacionalidades nacionalidadEmpresaC
    String telefonoEmpresaC
    String sectorDeEmpresaC
    String actividadDeEmpresaC
    String porcentajeEmpresaC
    String esConsejero
    String razonSocialC
    String rfcC
    Nacionalidades nacionalidadDEmpresaC
    String telefonoDEmpresaC
    String sectorDLEmpresaC
    String actividadDEEmpresaC
    String porcentajeEmpresaPertenece
    String consejeroEmpresaC

//    Instituciones o cargos publicos con los que tiene relacion o vinculos:
//    String institucionesCargosPublicosRelacion
//    String institucionDesempeñaCargoC
//    String relacionPersonaNacionalExtranjeraC

//Procedencia de recursos
//    String procedenciaRecurso
//    String detalleRecurso

//Proveedor de recursos
//    String proveedorrecursoNombre
//    String apellidoPaternoP
//    String apellidoMaternoP
//    String nacionalidadP
//    Date fechaNacimientoP
//    String curp
//    String rfcP
//    String firmaElectronica
//    String tipoVialidad
//    String nombreVialidad
//    String noExterior
//    String noInterior
//    String colonia
//    String municipio
//    String ciudad
//    String estado
//    String cp
//    String paisP
//    String personaMoralRazonSocial
//    String nacionalidad
//    String rfcPR
//    String firmaElectronicaP
//    String domicilio
//    String tipoVialidadP
//    String nombreVialidadP
//    String noExteriorP
//    String noInteriorP
//    String coloniaP
//    String delegacion
//    String ciudadP
//    String estadoP
//    String codigoPostal
//    String paisPR

//Propietario Real
//    String propietarioRealNombre
//    String apellidoPaternoPRE
//    String apellidoMaternoPRE
//    Boolean genero
//    Date fechaNacimientoPRE
//    String curpPRE
//    String paisNacimiento
//    String estadoNacimiento
//    String nacionalidadPRE
//    String calidadMigratoria
//    String paisResidencia
//    String regimenFiscal
//    String rfcPRE
//    String firmaElectronicaAvanzada
//    String telefonoParticular
//    String telefonoCelular
//    String correoElectronico
//    String domicilioPropietario
//    String tipoVialidadPRE
//    String nombreVialidadPRE
//    String noExteriorPRE
//    String noInteriorPRE
//    String coloniaPRE
//    String delegacionPRE
//    String ciudadPRE
//    String estadoPRE
//    String paisPRE
//    String codigo

//Uso y movimientos de la cuenta
//    String tipoCliente
//    Boolean uso
//    BigDecimal montoDepositoInicial
//    BigDecimal numeroAproxDepoMensuales
//    BigDecimal porccentajePromedioMensualDepositos
//    BigDecimal numeroAproxRetirosMensuales
//    BigDecimal montoAproxMensualRetiros
//    Date fechaBaja
//    String liqVSsaldo
//    Boolean manejaCust
//    Boolean cortoEfectivo

//Generales
//    String nacionalidadG
//    String paisG
//    String calleG
//    String noExteriorG
//    String noInteriorG
//    String coloniaG
//    String alcaldia
//    String ciudadG
//    String estadosG
//    String cpG
//    String telefonoParticularG
//    String telefonoCelularG
//    String email
//    String rfcG
//    String curpG
//    String fiel

//Chequeras
//    String institucion
//    String cuenta
//    String titular
//    String clabe
//    String broker

//PPE
//    Boolean personaPoliticamenteExpuesta
//    String ambito


    static constraints = {
//        titular
        titularNombre nullable: true
        apellidoPaterno nullable: true
        apellidoMaterno nullable: true
        grupoFamilia nullable: true
        promotor nullable: true
        tipoInversionista nullable: true
        excentoIsr nullable: true
        excentoIva nullable: true
        fechaNacimiento nullable: true
        entidadFederativaNacimiento nullable: true
        fechaInicioOperaciones nullable: true
        estadoCivil nullable: true
        profesion nullable: true
        nombreEmpresaPrestaServicios nullable: true
        nombrePuesto nullable: true
        funcionesGeneralesDirectivas nullable: true
        nivelJerarquico nullable: true
        antiguedadEmpleo nullable: true
        sectorEmpresa nullable: true
        giroEmpresa nullable: true
        tipoIngreso nullable: true
        ingresoAdicional nullable: true

        sectorPrestaServicio nullable: true
        giroEspecificoServicios nullable: true
        sectorEmpresa2 nullable: true
        razonSocialEmpresa nullable: true
        actividadEmpresa nullable: true
        ingresoAdicional2 nullable: true

        ocupacionActual nullable: true
        fuenteIngresos nullable: true

        sociedadesAsociacionesRFCEmpresa nullable: true
        nacionalidadEmpresa nullable: true
        telefonoEmpresa nullable: true
        sectorEmpresa3 nullable: true
        actividadGiroEspecificoEmpresa nullable: true
        porcentajeCapitalSocial nullable: true
        consejeroEmpresaRFCEmpresa nullable: true
        nacionalidadEmpresa2 nullable: true
        telefonoEmpresa2 nullable: true
        sectorEmpresa4 nullable: true
        actividadGiroEmpresa3 nullable: true
        vinculoPatrimonial nullable: true
        consejeroEmpresa nullable: true

        cargoDesempeno nullable: true
        nombreInstitucion nullable: true
        institucionCargoExtranjero nullable: true
        pais nullable: true
        cargo nullable: true
        relacionPersonaNacionalExtranjera nullable: true
        cargo2 nullable: true
        institucionDesempenaCargo nullable: true

//        cotitular
        nombreCotitular nullable: true
        apellidoPaternoC nullable: true
        apellidoMaternoC nullable: true
        estadoCivilC nullable: true
        lugarPrestaServicios nullable: true
        nombrePuestoC nullable: true
        funcionesGeneralesDirectivasC nullable: true
        nivelJerarquicoC nullable: true
        antiguedadEmpleoC nullable: true
        sectorEmpresaC nullable: true
        tipoIngresoC nullable: true
        ingresoAdicionalC nullable: true

        formasProporcionaServicios nullable: true
        sectorPrestaServicios nullable: true
        actividadGiroEEmpresaC nullable: true
        rfcEmpresa nullable: true
        sectorDEmpresaC nullable: true
        actividadGiroEmpresaC nullable: true
        cingresoAdicionalC nullable: true
        ocupacionActualC nullable: true
        fuenteIngresoC nullable: true

        razonSocialEmpresaC nullable: true
        rfc nullable: true
        nacionalidadEmpresaC nullable: true
        telefonoEmpresaC nullable: true
        sectorDeEmpresaC nullable: true
        actividadDeEmpresaC nullable: true
        porcentajeEmpresaC nullable: true
        esConsejero nullable: true
        razonSocialC nullable: true
        rfcC nullable: true
        nacionalidadDEmpresaC nullable: true
        telefonoDEmpresaC nullable: true
        sectorDLEmpresaC nullable: true
        actividadDEEmpresaC nullable: true
        porcentajeEmpresaPertenece nullable: true
        consejeroEmpresaC nullable: true
    }

    static mapping = {
        table "CLIENTES"
        version false
        id generator: "identity"
        titularNombre name:"titularNombre", column:"titularNombre"
        apellidoPaterno name:"apellidoPaterno", column:"apellidoPaterno"
        apellidoMaterno name:"apellidoMaterno", column:"apellidoMaterno"
        grupoFamilia name:"grupoFamilia", column:"grupoFamilia"
        promotor name:"promotor", column:"promotor"
        tipoInversionista name:"tipoInversionista", column:"tipoInversionista"
        excentoIsr name:"excentoIsr", column:"excentoIsr"
        excentoIva name:"excentoIva", column:"excentoIva"
        fechaNacimiento name:"fechaNacimiento", column:"fechaNacimiento"
        entidadFederativaNacimiento name:"entidadFederativaNacimiento", column:"entidadFederativaNacimiento"
        fechaInicioOperaciones name:"fechaInicioOperaciones", column:"fechaInicioOperaciones"
        estadoCivil name:"estadoCivil", column:"estadoCivil"
        profesion name:"profesion", column:"profesion"
        nombreEmpresaPrestaServicios name:"nombreEmpresaPrestaServicios", column:"nombreEmpresaPrestaServicios"
        nombrePuesto name:"nombrePuesto", column:"nombrePuesto"
        funcionesGeneralesDirectivas name:"funcionesGeneralesDirectivas", column:"funcionesGeneralesDirectivas"
        nivelJerarquico name:"nivelJerarquico", column:"nivelJerarquico"
        antiguedadEmpleo name:"antiguedadEmpleo", column:"antiguedadEmpleo"
        sectorEmpresa name:"sectorEmpresa", column:"sectorEmpresa"
        giroEmpresa name:"giroEmpresa", column:"giroEmpresa"
        tipoIngreso name:"tipoIngreso", column:"tipoIngreso"
        ingresoAdicional name:"ingresoAdicional", column:"ingresoAdicional"
        sectorPrestaServicio name:"sectorPrestaServicio", column:"sectorPrestaServicio"
        giroEspecificoServicios name:"giroEspecificoServicios", column:"giroEspecificoServicios"
        sectorEmpresa2 name:"sectorEmpresa2", column:"sectorEmpresa2"
        razonSocialEmpresa name:"razonSocialEmpresa", column:"razonSocialEmpresa"
        actividadEmpresa name:"actividadEmpresa", column:"actividadEmpresa"
        ingresoAdicional2 name:"ingresoAdicional2", column:"ingresoAdicional2"
        ocupacionActual name:"ocupacionActual", column:"ocupacionActual"
        fuenteIngresos name:"fuenteIngresos", column:"fuenteIngresos"
        sociedadesAsociacionesRFCEmpresa name:"sociedadesAsociacionesRFCEmpresa", column:"sociedadesAsociacionesRFCEmpresa"
        nacionalidadEmpresa name:"nacionalidadEmpresa", column:"nacionalidadEmpresa"
        telefonoEmpresa name:"telefonoEmpresa", column:"telefonoEmpresa"
        sectorEmpresa3 name:"sectorEmpresa3", column:"sectorEmpresa3"
        actividadGiroEspecificoEmpresa name:"actividadGiroEspecificoEmpresa", column:"actividadGiroEspecificoEmpresa"
        porcentajeCapitalSocial name:"porcentajeCapitalSocial", column:"porcentajeCapitalSocial"
        consejeroEmpresaRFCEmpresa name:"consejeroEmpresaRFCEmpresa", column:"consejeroEmpresaRFCEmpresa"
        nacionalidadEmpresa2 name:"nacionalidadEmpresa2", column:"nacionalidadEmpresa2"
        telefonoEmpresa2 name:"telefonoEmpresa2", column:"telefonoEmpresa2"
        sectorEmpresa4 name:"sectorEmpresa4", column:"sectorEmpresa4"
        actividadGiroEmpresa3 name:"actividadGiroEmpresa3", column:"actividadGiroEmpresa3"
        vinculoPatrimonial name:"vinculoPatrimonial", column:"vinculoPatrimonial"
        consejeroEmpresa name:"consejeroEmpresa", column:"consejeroEmpresa"
        cargoDesempeno name:"cargoDesempeno", column:"cargoDesempeno"
        nombreInstitucion name:"nombreInstitucion", column:"nombreInstitucion"
        institucionCargoExtranjero name:"institucionCargoExtranjero", column:"institucionCargoExtranjero"
        pais name:"pais", column:"pais"
        cargo name:"cargo", column:"cargo"
        relacionPersonaNacionalExtranjera name:"relacionPersonaNacionalExtranjera", column:"relacionPersonaNacionalExtranjera"
        cargo2 name:"cargo2", column:"cargo2"
        institucionDesempenaCargo name:"institucionDesempenaCargo", column:"institucionDesempenaCargo"

//        cotitular
        nombreCotitular name: "nombreCotitular", column: "nombreCotitular"
        apellidoPaternoC name: "apellidoPaternoC", column: "apellidoPaternoC"
        apellidoMaternoC name: "apellidoMaternoC", column: "apellidoMaternoC"
        estadoCivilC name: "estadoCivilC", column: "estadoCivilC"
        lugarPrestaServicios name: "lugarPrestaServicios", column: "lugarPrestaServicios"
        nombrePuestoC name: "nombrePuestoC", column: "nombrePuestoC"
        funcionesGeneralesDirectivasC name: "funcionesGeneralesDirectivasC", column: "funcionesGeneralesDirectivasC"
        nivelJerarquicoC name: "nivelJerarquicoC", column: "nivelJerarquicoC"
        antiguedadEmpleoC name: "antiguedadEmpleoC", column: "antiguedadEmpleoC"
        sectorEmpresaC name: "sectorEmpresaC", column: "sectorEmpresaC"
        tipoIngresoC name: "tipoIngresoC", column: "tipoIngresoC"
        ingresoAdicionalC name: "ingresoAdicionalC", column: "ingresoAdicionalC"
        formasProporcionaServicios name:"formasProporcionaServicios", column:"formasProporcionaServicios"
        sectorPrestaServicios name:"sectorPrestaServicios", column:"sectorPrestaServicios"
        actividadGiroEEmpresaC name:"actividadGiroEEmpresaC", column:"actividadGiroEEmpresaC"
        rfcEmpresa name:"rfcEmpresa", column:"rfcEmpresa"
        sectorDEmpresaC name:"sectorDEmpresaC", column:"sectorDEmpresaC"
        actividadGiroEmpresaC name:"actividadGiroEmpresaC", column:"actividadGiroEmpresaC"
        cingresoAdicionalC name:"cingresoAdicionalC", column:"cingresoAdicionalC"
        ocupacionActualC name:"ocupacionActualC", column:"ocupacionActualC"
        fuenteIngresoC name:"fuenteIngresoC", column:"fuenteIngresoC"
        razonSocialEmpresaC name:"razonSocialEmpresaC", column:"razonSocialEmpresaC"
        rfc name:"rfc", column:"rfc"
        nacionalidadEmpresaC name:"nacionalidadEmpresaC", column:"nacionalidadEmpresaC"
        telefonoEmpresaC name:"telefonoEmpresaC", column:"telefonoEmpresaC"
        sectorDeEmpresaC name:"sectorDeEmpresaC", column:"sectorDeEmpresaC"
        actividadDeEmpresaC name:"actividadDeEmpresaC", column:"actividadDeEmpresaC"
        porcentajeEmpresaC name:"porcentajeEmpresaC", column:"porcentajeEmpresaC"
        esConsejero name:"esConsejero", column:"esConsejero"
        razonSocialC name:"razonSocialC", column:"razonSocialC"
        rfcC name:"rfcC", column:"rfcC"
        nacionalidadDEmpresaC name:"nacionalidadDEmpresaC", column:"nacionalidadDEmpresaC"
        telefonoDEmpresaC name:"telefonoDEmpresaC", column:"telefonoDEmpresaC"
        sectorDLEmpresaC name:"sectorDLEmpresaC", column:"sectorDLEmpresaC"
        actividadDEEmpresaC name:"actividadDEEmpresaC", column:"actividadDEEmpresaC"
        porcentajeEmpresaPertenece name:"porcentajeEmpresaPertenece", column:"porcentajeEmpresaPertenece"
        consejeroEmpresaC name:"consejeroEmpresaC", column:"consejeroEmpresaC"
    }

    static transients = ['descLabel']
    String getDescLabel(){ titularNombre }
}
