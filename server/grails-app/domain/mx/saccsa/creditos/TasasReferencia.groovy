package mx.saccsa.creditos

class TasasReferencia {
    Integer claveTasa
    String descripcionCorta
    String descripcion

    static constraints = {
        claveTasa nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TASASREFERENCIA"
        version false
        id generator: "identity"
        claveTasa name:"claveTasa", column:"claveTasa", size: 0..4
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
