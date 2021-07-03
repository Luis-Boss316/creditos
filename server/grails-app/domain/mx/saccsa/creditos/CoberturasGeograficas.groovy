package mx.saccsa.creditos

class CoberturasGeograficas {
    Integer claveCobertura
    String descripcion

    static constraints = {
        claveCobertura nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "COBERTURASGEOGRAFICAS"
        version false
        id generator : "identity"
        claveCobertura name:"claveCobertura", column:"claveCobertura", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
