package mx.saccsa.creditos

class TiposRelaciones {
    Integer claveTipoRelacion
    String descripcion

    static constraints = {
        claveTipoRelacion nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TIPORELACIONES"
        version false
        id generator : "identity"
        claveTipoRelacion name:"claveTipoRelacion", column:"claveTipoRelacion", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
