package mx.saccsa.creditos

class InstitucionesYContrapartes {
    Integer claveInstitucionFinanciera
    String descripcionCorta
    String descripcion

    static constraints = {
        claveInstitucionFinanciera nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "INSTITUCIONESYCONTRAPARTES"
        version false
        id generator: "identity"
        claveInstitucionFinanciera name:"claveInstitucionFinanciera", column:"claveInstitucionFinanciera", size: 0..6
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..100
        descripcion name:"descripcion", column:"descripcion", size: 0..150
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
