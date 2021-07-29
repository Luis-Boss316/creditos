package mx.saccsa.creditos

class Cotitular {
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
    String actividadEmpresaC1
    String porcentajeEmpresaC
    String esConsejero
    String razonSocialC
    String rfcC
    Nacionalidades nacionalidadDEmpresaC
    String telefonoDEmpresaC
    String sectorDLEmpresaC
    String actividadEmpresaC2
    String porcentajeEmpresaPertenece
    String consejeroEmpresaC

//    Instituciones o cargos publicos con los que tiene relacion o vinculos:
    String institucionesCargosPublicosRelacion
    String institucionDesempenaCargoC
    String relacionPersonaNacionalExtranjeraC

    static constraints = {
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
        actividadEmpresaC1 nullable: true
        porcentajeEmpresaC nullable: true
        esConsejero nullable: true
        razonSocialC nullable: true
        rfcC nullable: true
        nacionalidadDEmpresaC nullable: true
        telefonoDEmpresaC nullable: true
        sectorDLEmpresaC nullable: true
        actividadEmpresaC2 nullable: true
        porcentajeEmpresaPertenece nullable: true
        consejeroEmpresaC nullable: true

        institucionesCargosPublicosRelacion nullable: true
        institucionDesempenaCargoC nullable: true
        relacionPersonaNacionalExtranjeraC nullable: true
    }

    static mapping = {
        //        cotitular
        table "Cotitular"
        version false
        id generator: "identity"
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
        actividadEmpresaC1 name:"actividadEmpresaC1", column:"actividadEmpresaC1"
        porcentajeEmpresaC name:"porcentajeEmpresaC", column:"porcentajeEmpresaC"
        razonSocialC name:"razonSocialC", column:"razonSocialC"
        rfcC name:"rfcC", column:"rfcC"
        nacionalidadDEmpresaC name:"nacionalidadDEmpresaC", column:"nacionalidadDEmpresaC"
        telefonoDEmpresaC name:"telefonoDEmpresaC", column:"telefonoDEmpresaC"
        sectorDLEmpresaC name:"sectorDLEmpresaC", column:"sectorDLEmpresaC"
        actividadEmpresaC2 name:"actividadEmpresaC2", column:"actividadEmpresaC2"
        porcentajeEmpresaPertenece name:"porcentajeEmpresaPertenece", column:"porcentajeEmpresaPertenece"
        consejeroEmpresaC name:"consejeroEmpresaC", column:"consejeroEmpresaC"
        institucionesCargosPublicosRelacion name:"institucionesCargosPublicosRelacion", column:"institucionesCargosPublicosRelacion"
        institucionDesempenaCargoC name:"institucionDesempeñaCargoC", column:"institucionDesempeñaCargoC"
        relacionPersonaNacionalExtranjeraC name:"relacionPersonaNacionalExtranjeraC", column:"relacionPersonaNacionalExtranjeraC"
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombreCotitular }
}
