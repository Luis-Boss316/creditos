package mx.saccsa.creditos

class TiposReferencias {
    Integer claveTipoReferencia
    String descripcion

    static constraints = {
        claveTipoReferencia nullable:false, blank:false
        descripcion nullable:false, blank:false
    }

    static mapping = {
        table "TIPOSREFERENCIAS"
        version false
        id generator: "identity"
        claveTipoReferencia name:"claveTipoReferencia", column:"claveTipoReferencia", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
