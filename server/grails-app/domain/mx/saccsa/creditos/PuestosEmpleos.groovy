package mx.saccsa.creditos

class PuestosEmpleos {
    Integer clavePuestoEmpleo
    String descripcion

    static constraints = {
        clavePuestoEmpleo nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "PUESTOSEMPLEOS"
        version false
        id generator : "identity"
        clavePuestoEmpleo name:"clavePuestoEmpleo", column:"clavePuestoEmpleo", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..50
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
