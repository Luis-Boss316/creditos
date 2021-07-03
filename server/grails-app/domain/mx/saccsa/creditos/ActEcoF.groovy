package mx.saccsa.creditos

class ActEcoF {
    Integer claveActividad
    String descripcion

    static constraints = {
        claveActividad nullable: false, bank: false
        descripcion nullable: false, bank: false
    }

    static mapping = {
        table "ACTIVIDADESECONOMICASFIRA"
        version false
        id generator: "identity"
        claveActividad name:"claveActividad", column:"claveActividad", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
