package mx.saccsa.creditos

class Estados {
    Integer claveEstado
    Integer numeroPais
    String descripcionCorta
    String descripcion

    static constraints = {
        claveEstado nullable: false, blank: false
        numeroPais nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "ESTADOS"
        version false
        id generator : "identity"
        claveEstado name:"claveEstado", column:"claveEstado", size: 0..5
        numeroPais name:"numeroPais", column:"numeroPais", size: 0..5
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
