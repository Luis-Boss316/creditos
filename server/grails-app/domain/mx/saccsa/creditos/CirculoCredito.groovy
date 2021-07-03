package mx.saccsa.creditos

class CirculoCredito {
    Integer numeroInstitucion
    String claveOtorgante
    String nombreOtorgante
    String identificadorMedio
    String domicilioDevolucion

    static constraints = {
        numeroInstitucion nullable: false, blank: false
        claveOtorgante nullable: false, blank: false
        nombreOtorgante nullable: false, blank: false
        identificadorMedio nullable: false, blank: false
        domicilioDevolucion nullable: false, blank: false
    }

    static mapping = {
        table "CIRCULOCREDITO"
        version false
        id generator: "identity"
        numeroInstitucion name:"numeroInstitucion", column:"numeroInstitucion", size: 0..3
        claveOtorgante name:"claveOtorgante", column:"claveOtorgante", size: 0..10
        nombreOtorgante name:"nombreOtorgante", column:"nombreOtorgante", size: 0..40
        identificadorMedio name:"identificadorMedio", column:"identificadorMedio", size: 0..10
        domicilioDevolucion name:"domicilioDevolucion", column:"domicilioDevolucion", size: 0..160
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombreOtorgante }
}
