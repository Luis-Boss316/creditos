package mx.saccsa.creditos

class ActEcoCNBV {
    Integer claveActividad
    String descripcion

    static constraints = {
        claveActividad nullable: false, blank:false
        descripcion nullable: false, blank:false
    }

    static mapping = {
        table "ACTIVIDADESECONOMICASCNBV"
        version false
        id generator: "identity"
        claveActividad name:"claveActividad", column:"claveActividad", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..150
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
