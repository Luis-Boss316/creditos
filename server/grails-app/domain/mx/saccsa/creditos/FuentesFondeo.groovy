package mx.saccsa.creditos

class FuentesFondeo {
    Integer claveInstitucionFondeadora
    String nombreInstitucionFondeadora

    static constraints = {
        claveInstitucionFondeadora nullable: false, blank: false
        nombreInstitucionFondeadora nullable: false, blank: false
    }

    static mapping = {
        table "FUENTESFONDEO"
        version false
        id generator: "identity"
        claveInstitucionFondeadora name:"claveInstitucionFondeadora", column:"claveInstitucionFondeadora", size: 0..3
        nombreInstitucionFondeadora name:"nombreInstitucionFondeadora", column:"nombreInstitucionFondeadora", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombreInstitucionFondeadora }
}
