package mx.saccsa.creditos

class TiposPropiedad {
    Integer claveTipoPropiedad
    String descripcion

    static constraints = {
        claveTipoPropiedad nullable:false, blank:false
        descripcion nullable:false, blank:false
    }

    static mapping = {
        table "TIPOSPROPIEDADES"
        version false
        id generator: "identity"
        claveTipoPropiedad name:"claveTipoPropiedad", column:"claveTipoPropiedad", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
