package mx.saccsa.creditos

class TiposAsentamientos {
    Integer claveTipoAsentamiento
    String descripcion

    static constraints = {
        claveTipoAsentamiento nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TIPOSASENTAMIENTOS"
        version false
        id generator : "identity"
        claveTipoAsentamiento name:"claveTipoAsentamiento", column:"claveTipoAsentamiento", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
