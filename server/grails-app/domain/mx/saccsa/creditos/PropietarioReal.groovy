package mx.saccsa.creditos

class PropietarioReal {
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

    static constraints = {
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
    }

    static mapping = {
        //        Propietario real
        table "PropietarioReal"
        version false
        id generator: "identity"
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
    }

    static transients = ['descLabel']
    String getDescLabel(){ propietarioRealNombre }
}
