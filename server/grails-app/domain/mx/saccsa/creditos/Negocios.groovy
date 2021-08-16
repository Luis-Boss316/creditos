package mx.saccsa.creditos

class Negocios {
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
        nombre nullable: false, blank: false
        tipoPersona nullable: true, blank: true
        tipoSociedad nullable: true, blank: true
        tipoOperacion nullable: true, blank: true
        fechaInicioOperaciones nullable: false, blank: false
        fechaInicioRegistro nullable: false, blank: false
        actividad nullable: true, blank: true
        giro nullable: true, blank: true
        establecimiento nullable: false, blank: false
        nacionalidad nullable: false, blank: false
        paginaWeb nullable: true, blank: true
    }
    static mapping = {
        table('NEGOCIOS')
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
    String getDescLabel(){ nombre + tipoSociedad }
}
