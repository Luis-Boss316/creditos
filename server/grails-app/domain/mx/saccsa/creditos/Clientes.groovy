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
    String sector1EmpresaC
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
    String institucionesCargosPublicosRelacion
    String institucionDesempenaCargoC
    String relacionPersonaNacionalExtranjeraC

//Procedencia de recursos
    String procedenciaRecurso
    String detalleRecurso

//Proveedor de recursos
    String proveedorrecursoNombre
    String apellidoPaternoP
    String apellidoMaternoP
    Nacionalidades nacionalidadP
    Date fechaNacimientoP
    String curp
    String rfcP
    String firmaElectronica
    String tipoVialidad
    String nombreVialidad
    String noExterior
    String noInterior
    String colonia
    Municipios municipio
    Ciudades ciudad
    Estados estado
    String cp
    Paises paisP
    String personaMoralRazonSocial
    Nacionalidades nacionalidad
    String rfcPR
    String firmaElectronicaP
    String domicilio
    String tipoVialidadP
    String nombreVialidadP
    String noExteriorP
    String noInteriorP
    String coloniaP
    Municipios delegacion
    Ciudades ciudadP
    Estados estadoP
    String codigoPostal
    Paises paisPR

//Propietario Real
    String propietarioRealNombre
    String apellidoPaternoPRE
    String apellidoMaternoPRE
    String genero
    Date fechaNacimientoPRE
    String curpPRE
    Paises paisNacimiento
    Estados estadoNacimiento
    Nacionalidades nacionalidadPRE
    String calidadMigratoria
    Paises paisResidencia
    String regimenFiscal
    String rfcPRE
    String firmaElectronicaAvanzada
    String telefonoParticular
    String telefonoCelular
    String correoElectronico
    String domicilioPropietario
    String tipoVialidadPRE
    String nombreVialidadPRE
    String noExteriorPRE
    String noInteriorPRE
    String coloniaPRE
    Municipios delegacionPRE
    Ciudades ciudadPRE
    Estados estadoPRE
    Paises paisPRE
    String codigo

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
        sector1EmpresaC nullable: true
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

        institucionesCargosPublicosRelacion nullable: true
        institucionDesempenaCargoC nullable: true
        relacionPersonaNacionalExtranjeraC nullable: true

//        Procedencia de resursos
        procedenciaRecurso nullable: true
        detalleRecurso nullable: true

//        Proveedor de recursos
        proveedorrecursoNombre nullable: true
        apellidoPaternoP nullable: true
        apellidoMaternoP nullable: true
        nacionalidadP nullable: true
        fechaNacimientoP nullable: true
        curp nullable: true
        rfcP nullable: true
        firmaElectronica nullable: true
        tipoVialidad nullable: true
        nombreVialidad nullable: true
        noExterior nullable: true
        noInterior nullable: true
        colonia nullable: true
        municipio nullable: true
        ciudad nullable: true
        estado nullable: true
        cp nullable: true
        paisP nullable: true
        personaMoralRazonSocial nullable: true
        nacionalidad nullable: true
        rfcPR nullable: true
        firmaElectronicaP nullable: true
        domicilio nullable: true
        tipoVialidadP nullable: true
        nombreVialidadP nullable: true
        noExteriorP nullable: true
        noInteriorP nullable: true
        coloniaP nullable: true
        delegacion nullable: true
        ciudadP nullable: true
        estadoP nullable: true
        codigoPostal nullable: true
        paisPR nullable: true

//        Propietario real
        propietarioRealNombre nullable: true
        apellidoPaternoPRE nullable: true
        apellidoMaternoPRE nullable: true
        genero nullable: true
        fechaNacimientoPRE nullable: true
        curpPRE nullable: true
        paisNacimiento nullable: true
        estadoNacimiento nullable: true
        nacionalidadPRE nullable: true
        calidadMigratoria nullable: true
        paisResidencia nullable: true
        regimenFiscal nullable: true
        rfcPRE nullable: true
        firmaElectronicaAvanzada nullable: true
        telefonoParticular nullable: true
        telefonoCelular nullable: true
        correoElectronico nullable: true
        domicilioPropietario nullable: true
        tipoVialidadPRE nullable: true
        nombreVialidadPRE nullable: true
        noExteriorPRE nullable: true
        noInteriorPRE nullable: true
        coloniaPRE nullable: true
        delegacionPRE nullable: true
        ciudadPRE nullable: true
        estadoPRE nullable: true
        paisPRE nullable: true
        codigo nullable: true

//        Usos y movimientos de la cuenta
//        tipoCliente nullable: true
//        uso nullable: true
//        montoDepositoInicial nullable: true
//        numeroAproxDepoMensuales nullable: true
//        porccentajePromedioMensualDepositos nullable: true
//        numeroAproxRetirosMensuales nullable: true
//        montoAproxMensualRetiros nullable: true
//        fechaBaja nullable: true
//        liqVSsaldo nullable: true
//        manejaCust nullable: true
//        cortoEfectivo nullable: true

//        Generales
//        nacionalidadG nullable: true
//        paisG nullable: true
//        calleG nullable: true
//        noExteriorG nullable: true
//        noInteriorG nullable: true
//        coloniaG nullable: true
//        alcaldia nullable: true
//        ciudadG nullable: true
//        estadosG nullable: true
//        cpG nullable: true
//        telefonoParticularG nullable: true
//        telefonoCelularG nullable: true
//        email nullable: true
//        rfcG nullable: true
//        curpG nullable: true
//        fiel nullable: true

//        Chequeras
//        institucion nullable: true
//        cuenta nullable: true
//        titular nullable: true
//        clabe nullable: true
//        broker nullable: true

//        PPE
//        personaPoliticamenteExpuesta nullable: true
//        ambito nullable: true
    }

    static mapping = {
        table("Cliente")
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
        sector1EmpresaC name:"sector1EmpresaC", column:"sector1EmpresaC"
        actividadDeEmpresaC name:"actividadDeEmpresaC", column:"actividadDeEmpresaC"
        porcentajeEmpresaC name:"porcentajeEmpresaC", column:"porcentajeEmpresaC"
        razonSocialC name:"razonSocialC", column:"razonSocialC"
        rfcC name:"rfcC", column:"rfcC"
        nacionalidadDEmpresaC name:"nacionalidadDEmpresaC", column:"nacionalidadDEmpresaC"
        telefonoDEmpresaC name:"telefonoDEmpresaC", column:"telefonoDEmpresaC"
        sectorDLEmpresaC name:"sectorDLEmpresaC", column:"sectorDLEmpresaC"
        actividadDEEmpresaC name:"actividadDEEmpresaC", column:"actividadDEEmpresaC"
        porcentajeEmpresaPertenece name:"porcentajeEmpresaPertenece", column:"porcentajeEmpresaPertenece"
        consejeroEmpresaC name:"consejeroEmpresaC", column:"consejeroEmpresaC"
        institucionesCargosPublicosRelacion name:"institucionesCargosPublicosRelacion", column:"institucionesCargosPublicosRelacion"
        institucionDesempenaCargoC name:"institucionDesempeñaCargoC", column:"institucionDesempeñaCargoC"
        relacionPersonaNacionalExtranjeraC name:"relacionPersonaNacionalExtranjeraC", column:"relacionPersonaNacionalExtranjeraC"

//        Procedencia de recursos
        procedenciaRecurso name: "procedenciaRecurso", column:"procedenciaRecurso"
        detalleRecurso name: "detalleRecurso", column:"detalleRecurso"

//        Proveedor de recursos
        proveedorrecursoNombre name:"proveedorrecursoNombre", column:"proveedorrecursoNombre"
        apellidoPaternoP name:"apellidoPaternoP", column:"apellidoPaternoP"
        apellidoMaternoP name:"apellidoMaternoP", column:"apellidoMaternoP"
        nacionalidadP name:"nacionalidadP", column:"nacionalidadP"
        fechaNacimientoP name:"fechaNacimientoP", column:"fechaNacimientoP"
        curp name:"curp", column:"curp"
        rfcP name:"rfcP", column:"rfcP"
        firmaElectronica name:"firmaElectronica", column:"firmaElectronica"
        tipoVialidad name:"tipoVialidad", column:"tipoVialidad"
        nombreVialidad name:"nombreVialidad", column:"nombreVialidad"
        noExterior name:"noExterior", column:"noExterior"
        noInterior name:"noInterior", column:"noInterior"
        colonia name:"colonia", column:"colonia"
        municipio name:"municipio", column:"municipio"
        ciudad name:"ciudad", column:"ciudad"
        estado name:"estado", column:"estado"
        cp name:"cp", column:"cp"
        paisP name:"paisP", column:"paisP"
        personaMoralRazonSocial name:"personaMoralRazonSocial", column:"personaMoralRazonSocial"
        nacionalidad name:"nacionalidad", column:"nacionalidad"
        rfcPR name:"rfcPR", column:"rfcPR"
        firmaElectronicaP name:"firmaElectronicaP", column:"firmaElectronicaP"
        domicilio name:"domicilio", column:"domicilio"
        tipoVialidadP name:"tipoVialidadP", column:"tipoVialidadP"
        nombreVialidadP name:"nombreVialidadP", column:"nombreVialidadP"
        noExteriorP name:"noExteriorP", column:"noExteriorP"
        noInteriorP name:"noInteriorP", column:"noInteriorP"
        coloniaP name:"coloniaP", column:"coloniaP"
        delegacion name:"delegacion", column:"delegacion"
        ciudadP name:"ciudadP", column:"ciudadP"
        estadoP name:"estadoP", column:"estadoP"
        codigoPostal name:"codigoPostal", column:"codigoPostal"
        paisPR name:"paisPR", column:"paisPR"

//        Propietario real
        propietarioRealNombre name:"propietarioRealNombre", column:"propietarioRealNombre"
        apellidoPaternoPRE name:"apellidoPaternoPRE", column:"apellidoPaternoPRE"
        apellidoMaternoPRE name:"apellidoMaternoPRE", column:"apellidoMaternoPRE"
        genero name:"genero", column:"genero"
        fechaNacimientoPRE name:"fechaNacimientoPRE", column:"fechaNacimientoPRE"
        curpPRE name:"curpPRE", column:"curpPRE"
        paisNacimiento name:"paisNacimiento", column:"paisNacimiento"
        estadoNacimiento name:"estadoNacimiento", column:"estadoNacimiento"
        nacionalidadPRE name:"nacionalidadPRE", column:"nacionalidadPRE"
        calidadMigratoria name:"calidadMigratoria", column:"calidadMigratoria"
        paisResidencia name:"paisResidencia", column:"paisResidencia"
        regimenFiscal name:"regimenFiscal", column:"regimenFiscal"
        rfcPRE name:"rfcPRE", column:"rfcPRE"
        firmaElectronicaAvanzada name:"firmaElectronicaAvanzada", column:"firmaElectronicaAvanzada"
        telefonoParticular name:"telefonoParticular", column:"telefonoParticular"
        telefonoCelular name:"telefonoCelular", column:"telefonoCelular"
        correoElectronico name:"correoElectronico", column:"correoElectronico"
        domicilioPropietario name:"domicilioPropietario", column:"domicilioPropietario"
        tipoVialidadPRE name:"tipoVialidadPRE", column:"tipoVialidadPRE"
        nombreVialidadPRE name:"nombreVialidadPRE", column:"nombreVialidadPRE"
        noExteriorPRE name:"noExteriorPRE", column:"noExteriorPRE"
        noInteriorPRE name:"noInteriorPRE", column:"noInteriorPRE"
        coloniaPRE name:"coloniaPRE", column:"coloniaPRE"
        delegacionPRE name:"delegacionPRE", column:"delegacionPRE"
        ciudadPRE name:"ciudadPRE", column:"ciudadPRE"
        estadoPRE name:"estadoPRE", column:"estadoPRE"
        paisPRE name:"paisPRE", column:"paisPRE"
        codigo name:"codigo", column:"codigo"

//        Uso y movimiento de la cuenta
//        tipoCliente name:"tipoCliente", column:"tipoCliente"
//        uso name:"uso", column:"uso"
//        montoDepositoInicial name:"montoDepositoInicial", column:"montoDepositoInicial"
//        numeroAproxDepoMensuales name:"numeroAproxDepoMensuales", column:"numeroAproxDepoMensuales"
//        porccentajePromedioMensualDepositos name:"porccentajePromedioMensualDepositos", column:"porccentajePromedioMensualDepositos"
//        numeroAproxRetirosMensuales name:"numeroAproxRetirosMensuales", column:"numeroAproxRetirosMensuales"
//        montoAproxMensualRetiros name:"montoAproxMensualRetiros", column:"montoAproxMensualRetiros"
//        fechaBaja name:"fechaBaja", column:"fechaBaja"
//        liqVSsaldo name:"liqVSsaldo", column:"liqVSsaldo"
//        manejaCust name:"manejaCust", column:"manejaCust"
//        cortoEfectivo name:"cortoEfectivo", column:"cortoEfectivo"

//        Generales
//        nacionalidadG name:"nacionalidadG", column:"nacionalidadG"
//        paisG name:"paisG", column:"paisG"
//        calleG name:"calleG", column:"calleG"
//        noExteriorG name:"noExteriorG", column:"noExteriorG"
//        noInteriorG name:"noInteriorG", column:"noInteriorG"
//        coloniaG name:"coloniaG", column:"coloniaG"
//        alcaldia name:"alcaldia", column:"alcaldia"
//        ciudadG name:"ciudadG", column:"ciudadG"
//        estadosG name:"estadosG", column:"estadosG"
//        cpG name:"cpG", column:"cpG"
//        telefonoParticularG name:"telefonoParticularG", column:"telefonoParticularG"
//        telefonoCelularG name:"telefonoCelularG", column:"telefonoCelularG"
//        email name:"email", column:"email"
//        rfcG name:"rfcG", column:"rfcG"
//        curpG name:"curpG", column:"curpG"
//        fiel name:"fiel", column:"fiel"

//        Chequeas
//        institucion name:"institucion", column:"institucion"
//        cuenta name:"cuenta", column:"cuenta"
//        titular name:"titular", column:"titular"
//        clabe name:"clabe", column:"clabe"
//        broker name:"broker", column:"broker"

//        PPE
//        personaPoliticamenteExpuesta name:"personaPoliticamenteExpuesta", column:"personaPoliticamenteExpuesta"
//        ambito name:"ambito", column:"ambito"
    }

    static transients = ['descLabel']
    String getDescLabel(){ titularNombre }
}
