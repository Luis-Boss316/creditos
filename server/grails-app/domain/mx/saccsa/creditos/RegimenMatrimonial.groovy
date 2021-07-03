package mx.saccsa.creditos

class RegimenMatrimonial {
    Integer claveRegimenMatrimonial
    String descripcionCorta
    String descripcion

    static constraints = {
        claveRegimenMatrimonial nullable:false, blank:false
        descripcionCorta nullable:false, blank:false
        descripcion nullable:false, blank:false
    }

    static mapping = {
        table "REGIMENMATRIMONIAL"
        version false
        id generator : "identity"
        claveRegimenMatrimonial name:"claveRegimenMatrimonial", column:"claveRegimenMatrimonial", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
