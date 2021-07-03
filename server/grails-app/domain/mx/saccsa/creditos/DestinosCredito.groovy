package mx.saccsa.creditos

class DestinosCredito {
    Integer claveDestino
    String descripcion

    static constraints = {
        claveDestino nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "DESTINOSCREDITO"
        version false
        id generator: "identity"
        claveDestino name: "claveDestino", column: "claveDestino", size: 0..3
        descripcion name: "descripcion", column: "descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
