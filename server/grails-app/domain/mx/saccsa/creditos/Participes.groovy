package mx.saccsa.creditos

class Participes {
    Integer claveParticipe
    String descripcion

    static constraints = {
        claveParticipe nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "PARTICIPES"
        version false
        id generator: "identity"
        claveParticipe name:"claveParticipe", column:"claveParticipe", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
