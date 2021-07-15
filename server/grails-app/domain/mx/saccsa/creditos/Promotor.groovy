package mx.saccsa.creditos

class Promotor {
    static auditable =  true
    String	cvePromotor
    String	ciudad
    String	colonia
    String	direccion
    String	nombre

    static constraints = {
        cvePromotor nullable: false, blank: false
        ciudad nullable: false, blank: false
        colonia nullable: false, blank: false
        direccion nullable: false, blank: false
        nombre nullable: false, blank: false
    }

    static mapping = {
        table "PROMOTOR"
        version false
        id generator: "identity"
        cvePromotor name:"cvePromotor", column:"cvePromotor"
        ciudad name:"ciudad", column:"ciudad"
        colonia name:"colonia", column:"colonia"
        direccion name:"direccion", column:"direccion"
        nombre name:"nombre", column:"nombre"
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombre }
}
