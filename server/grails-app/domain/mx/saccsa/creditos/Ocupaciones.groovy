package mx.saccsa.creditos

class Ocupaciones {
    Integer claveOcupacion
    String descripcion

    static constraints = {
        claveOcupacion nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "OCUPACIONES"
        version false
        id generator : "identity"
        claveOcupacion name:"claveOcupacion", column:"claveOcupacion", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
