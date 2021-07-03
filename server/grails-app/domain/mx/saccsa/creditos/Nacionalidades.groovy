package mx.saccsa.creditos

class Nacionalidades {
    Integer claveNacionalidad
    String descripcionCorta
    String descripcion

    static constraints = {
        claveNacionalidad nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "NACIONALIDADES"
        version false
        id generator: "identity"
        claveNacionalidad name:"claveNacionalidad", column:"claveNacionalidad", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
