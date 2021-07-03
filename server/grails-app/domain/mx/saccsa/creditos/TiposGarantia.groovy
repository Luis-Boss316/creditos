package mx.saccsa.creditos

class TiposGarantia {
    Integer claveTipoGarantia
    String descripcion
    Boolean contabiliza
    String fega
    Boolean fonaga
    String deudor

    static constraints = {
        claveTipoGarantia nullable: false, blank: false
        descripcion nullable: false, blank: false
        contabiliza nullable: false, blank: false
        fega nullable: true, blank: true
        fonaga nullable: true, blank: true
        deudor nullable: true, blank: true
    }

    static mapping = {
        table "TIPOSGARANTIA"
        version false
        id generator: "identity"
        claveTipoGarantia name: "claveTipoGarantia", column: "claveTipoGarantia", size: 0..3
        descripcion name: "descripcion", column: "descripcion", size: 0..60
        contabiliza name: "contabiliza", column: "contabiliza"
        fega name: "fega", column: "fega"
        fonaga name: "fonaga", column: "fonaga"
        deudor name: "deudor", column: "deudor"
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
