package mx.saccsa.creditos

class TiposEmpleos {
    Integer claveTipoEmpleo
    String descripcion

    static constraints = {
        claveTipoEmpleo nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TIPOSEMPLEOS"
        version false
        id generator : "identity"
        claveTipoEmpleo name:"claveTipoEmpleo", column:"claveTipoEmpleo", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
