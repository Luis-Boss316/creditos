package mx.saccsa.creditos

class GiroEmpresarial {
    Integer claveGiroEmpresarial
    String descripcionCorta
    String descripcion

    static constraints = {
        claveGiroEmpresarial nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "GIROEMPRESARIAL"
        version false
        id generator : "identity"
        claveGiroEmpresarial name:"claveGiroEmpresarial", column:"claveGiroEmpresarial", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
