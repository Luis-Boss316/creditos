package mx.saccsa.creditos

class TipoPersona {
    Integer claveTipoPersona
    String descripcionCorta
    String descripcion

    static constraints = {
        claveTipoPersona nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TIPOPERSONA"
        version false
        id generator: "identity"
        claveTipoPersona name:"claveTipoPersona", column:"claveTipoPersona", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
