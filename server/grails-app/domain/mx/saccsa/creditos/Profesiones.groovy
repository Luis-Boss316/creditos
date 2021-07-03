package mx.saccsa.creditos

class Profesiones {
    Integer claveProfesion
    String descripcionCorta
    String descripcion

    static constraints = {
        claveProfesion nullable:false, blank:false
        descripcionCorta nullable:false, blank:false
        descripcion nullable:false, blank:false
    }

    static mapping = {
        table "PROFESIONALES"
        version false
        id generator : "identity"
        claveProfesion name:"claveProfesion", column:"claveProfesion", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
