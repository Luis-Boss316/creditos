package mx.saccsa.creditos

class TiposCredito {
    Integer claveTipoCredito
    String descripcionCorta
    String descripcion

    static constraints = {
        claveTipoCredito nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TIPOSCREDITO"
        version false
        id generator: "identity"
        claveTipoCredito name: "claveTipoCredito", column: "claveTipoCredito", size: 0..3
        descripcionCorta name: "descripcionCorta", column: "descripcionCorta", size: 0..30
        descripcion name: "descripcion", column: "descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
