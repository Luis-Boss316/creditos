package mx.saccsa.creditos

class TipoImpuestos {
    Integer claveImpuesto
    String descripcionCorta
    String descripcion
    String base
    BigDecimal tasa

    static constraints = {
        claveImpuesto nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
        base nullable: true, blank: true
        tasa nullable: true, blank: true
    }

    static mapping = {
        table "TIPOIMPUESTOS"
        version false
        id generator: "identity"
        claveImpuesto name:"claveImpuesto", column:"claveImpuesto", size: 0..4
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
        base name:"base", column:"base"
        tasa name:"tasa", column:"tasa"
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
