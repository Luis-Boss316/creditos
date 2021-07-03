package mx.saccsa.creditos

class OrigenRecursos {
    Integer claveOrigenRecursosCuenta
    String descripcion

    static constraints = {
        claveOrigenRecursosCuenta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "ORIGENRECURSOS"
        version false
        id generator: "identity"
        claveOrigenRecursosCuenta name:"claveOrigenRecursosCuenta", column:"claveOrigenRecursosCuenta", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
