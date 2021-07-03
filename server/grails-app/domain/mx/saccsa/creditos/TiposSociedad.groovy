package mx.saccsa.creditos

class TiposSociedad {
    Integer claveTipoSociedad
    String descripcion
    String descripcionLarga

    static constraints = {
        claveTipoSociedad nullable:false, blank:false
        descripcion nullable:false, blank:false
        descripcionLarga nullable:false, blank:false
    }

    static mapping = {
        table "TIPOSSOCIEDAD"
        version false
        id generator: "identity"
        claveTipoSociedad name:"claveTipoSociedad", column:"claveTipoSociedad", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
        descripcionLarga name:"descripcionLarga", column:"descripcionLarga", size: 0..100
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
