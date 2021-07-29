package mx.saccsa.creditos

class ProveedorRecursos {
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

    static constraints = {
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
    }

    static mapping = {
        //        Proveedor de recursos
        table "ProveedorRecursos"
        version false
        id generator: "identity"
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
    }

    static transients = ['descLabel']
    String getDescLabel(){ proveedorrecursoNombre }
}
