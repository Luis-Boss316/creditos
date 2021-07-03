package mx.saccsa.creditos

class Periodicidades {
    Integer clavePeriodicidad
    String sistema
    String descripcion
    String periodo
    Integer frecuencia
    Integer dias

    static constraints = {
        clavePeriodicidad nullable: false, blank: false
        sistema nullable: false, blank: false
        descripcion nullable: false, blank: false
        periodo nullable: false, blank: false
        frecuencia nullable: false, blank: false
        dias nullable: false, blank: false
    }

    static mapping = {
        table "PERIODICIDADES"
        version false
        id generator: "identity"
        clavePeriodicidad name:"clavePeriodicidad", column:"clavePeriodicidad", size: 0..3
        sistema name:"sistema", column:"sistema", size: 0..20
        descripcion name:"descripcion", column:"descripcion", size: 0..60
        periodo name:"periodo", column:"periodo"
        frecuencia name:"frecuencia", column:"frecuencia"
        dias name:"dias", column:"dias"
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
