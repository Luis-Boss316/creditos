package mx.saccsa.creditos

class OrigenIngresos {
    Integer claveOrigenIngresos
    String descripcion

    static constraints = {
        claveOrigenIngresos nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "ORIGENINGRESOS"
        version false
        id generator: "identity"
        claveOrigenIngresos name:"claveOrigenIngresos", column:"claveOrigenIngresos", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
