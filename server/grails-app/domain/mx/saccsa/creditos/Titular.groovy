package mx.saccsa.creditos

class Titular {
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
    }

    static mapping = {
        table("Titular")
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
    }

    static transients = ['descLabel']
    String getDescLabel(){ titularNombre }
}
