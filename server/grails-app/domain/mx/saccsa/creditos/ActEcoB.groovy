package mx.saccsa.creditos

class ActEcoB {
    SectoresBanxico numeroSector
    Boolean indicadorActRiesgo

    static constraints = {
        numeroSector nullable: false, blank: false
        indicadorActRiesgo nullable: false, blank: false
    }

    static mapping = {
        table "ACTIVIDADESECONOMICASBANXICO"
        version false
        id generator: "identity"
        numeroSector name:"numeroSector", column:"numeroSector", size: 0..10
        indicadorActRiesgo name:"indicadorActRiesgo", column:"indicadorActRiesgo"
    }

    static transients = ['descLabel']
    String getDescLabel(){ numeroSector }
}
