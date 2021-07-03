package mx.saccsa.creditos

class Paises {
    Integer clavePais
    String descripcionCorta
    String descripcion

    static constraints = {
        clavePais nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "PAISES"
        version false
        id generator : "identity"
        clavePais name:"clavePais", column:"clavePais", size: 0..5
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
