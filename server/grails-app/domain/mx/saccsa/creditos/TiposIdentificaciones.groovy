package mx.saccsa.creditos

class TiposIdentificaciones {
    Integer claveTipoIdentificacion
    String descripcionCorta
    String descripcion

    static constraints = {
        claveTipoIdentificacion nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TIPOSIDENTIFICACIONES"
        version false
        id generator: "identity"
        claveTipoIdentificacion name:"claveTipoIdentificacion", column:"claveTipoIdentificacion", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
