package mx.saccsa.creditos

class SectoresBanxico {
    Integer claveSector
    String descripcionCorta
    String descripcion

    static constraints = {
        claveSector nullable:false, blank:false
        descripcionCorta nullable:false, blank:false
        descripcion nullable:false, blank:false
    }

    static mapping = {
        table "SECTORESBANXICO"
        version false
        id generator: "identity"
        claveSector name:"claveSector", column:"claveSector", size: 0..10
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
