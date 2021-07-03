package mx.saccsa.creditos

class TiposDomicilios {
    Integer claveTipoDomicilio
    String descripcion

    static constraints = {
        claveTipoDomicilio nullable: false,  blank: false
        descripcion nullable: false,  blank: false
    }

    static mapping = {
        table "TIPOSDOMOCILIOS"
        version false
        id generator : "identity"
        claveTipoDomicilio name:"claveTipoDomicilio", column:"claveTipoDomicilio", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
