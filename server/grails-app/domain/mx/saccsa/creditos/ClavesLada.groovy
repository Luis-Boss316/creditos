package mx.saccsa.creditos

class ClavesLada {
    Integer numeroClaveLada
    Integer claveLadaActual
    String localidadTelmex
    Integer claveLocalidad

    static constraints = {
        numeroClaveLada nullable: false, blank: false
        claveLadaActual nullable: false, blank: false
        localidadTelmex nullable: false, blank: false
        claveLocalidad nullable: true, blank: true
    }

    static mapping = {
        table "CLAVESLADA"
        version false
        id generator: "identity"
        numeroClaveLada name:"numeroClaveLada", column:"numeroClaveLada", size: 0..5
        claveLadaActual name:"claveLadaActual", column:"claveLadaActual", size: 0..3
        localidadTelmex name:"localidadTelmex", column:"localidadTelmex", size: 0..60
        claveLocalidad name:"claveLocalidad", column:"claveLocalidad", size: 0..10
    }

    static transients = ['descLabel']
    String getDescLabel(){ localidadTelmex }
}
