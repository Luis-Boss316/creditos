package mx.saccsa.creditos

class DatosGeneralesNegocios {
    String nombre
    String tipoPersona
    TiposSociedad tipoSociedad
    String tipoOperacion
    Date fechaInicioOperaciones
    Date fechaInicioRegistro
    Ocupaciones actividad
    GiroEmpresarial giro
    String establecimiento
    Nacionalidades nacionalidad
    String paginaWeb
    static constraints = {
        nombre nullable: true
        tipoPersona nullable: true
        tipoSociedad nullable: true
        tipoOperacion nullable: true
        fechaInicioOperaciones nullable: true
        fechaInicioRegistro nullable: true
        actividad nullable: true
        giro nullable: true
        establecimiento nullable: true
        nacionalidad nullable: true
        paginaWeb nullable: true
    }
    static mapping = {
        table('DATOSGENERALESNEGOCIOS')
        version(false)
        id generator: "identity"
        nombre name:"nombre", column:"nombre"
        tipoPersona name:"tipoPersona", column:"tipoPersona"
        tipoSociedad name:"tipoSociedad", column:"tipoSociedad"
        tipoOperacion name:"tipoOperacion", column:"tipoOperacion"
        fechaInicioOperaciones name:"fechaInicioOperaciones", column:"fechaInicioOperaciones"
        fechaInicioRegistro name:"fechaInicioRegistro", column:"fechaInicioRegistro"
        actividad name:"actividad", column:"actividad"
        giro name:"giro", column:"giro"
        establecimiento name:"establecimiento", column:"establecimiento"
        nacionalidad name:"nacionalidad", column:"nacionalidad"
        paginaWeb name:"paginaWeb", column:"paginaWeb"
    }
    static transients = ['descLabel']
    String getDescLabel(){ nombre }
}
