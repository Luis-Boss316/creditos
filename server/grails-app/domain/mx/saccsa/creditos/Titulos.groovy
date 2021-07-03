package mx.saccsa.creditos

class Titulos {
    Integer claveTipoPropiedad
    String descripcionCorta
    String descripcion

    static constraints = {
        claveTipoPropiedad nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TITULOS"
        version false
        id generator: "identity"
        claveTipoPropiedad name:"claveTipoPropiedad", column:"claveTipoPropiedad", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
