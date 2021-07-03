package mx.saccsa.creditos

class BuroCredito {
    Integer numeroInstitucion
    String claveOtorgante
    String nombreOtorgante
    Integer claveVersion
    String domicilioDevolucion
    Boolean generaLunes
    Boolean generaMartes
    Boolean generaMiercoles
    Boolean generaJueves
    Boolean generaViernes
    Boolean generaSabado
    Boolean generaDomingo
    Date fechaUltimoReporteSemanal
    Date fechaProximoReporteSemanal
    Date fechaUltimoReporteMensual
    String tipoInstitucion


    static constraints = {
        numeroInstitucion nullable: false, blank: false
        claveOtorgante nullable: false, blank: false
        nombreOtorgante nullable: false, blank: false
        claveVersion nullable: false, blank: false
        domicilioDevolucion nullable: false, blank: false
        generaLunes nullable: false, blank: false
        generaMartes nullable: false, blank: false
        generaMiercoles nullable: false, blank: false
        generaJueves nullable: false, blank: false
        generaViernes nullable: false, blank: false
        generaSabado nullable: false, blank: false
        generaDomingo nullable: false, blank: false
        fechaUltimoReporteSemanal nullable: false, blank: false
        fechaProximoReporteSemanal nullable: true, blank: true
        fechaUltimoReporteMensual nullable: true, blank: true
        tipoInstitucion nullable: true, blank: true
    }

    static mapping = {
        table "BUROCREDITO"
        version false
        id generator: "identity"
        numeroInstitucion name:"numeroInstitucion", column:"numeroInstitucion", size: 0..3
        claveOtorgante name:"claveOtorgante", column:"claveOtorgante", size: 0..10
        nombreOtorgante name:"nombreOtorgante", column:"nombreOtorgante", size: 0..16
        claveVersion name:"claveVersion", column:"claveVersion", size: 0..2
        domicilioDevolucion name:"domicilioDevolucion", column:"domicilioDevolucion", size: 0..160
        generaLunes name:"generaLunes", column:"generaLunes"
        generaMartes name:"generaMartes", column:"generaMartes"
        generaMiercoles name:"generaMiercoles", column:"generaMiercoles"
        generaJueves name:"generaJueves", column:"generaJueves"
        generaViernes name:"generaViernes", column:"generaViernes"
        generaSabado name:"generaSabado", column:"generaSabado"
        generaDomingo name:"generaDomingo", column:"generaDomingo"
        fechaUltimoReporteSemanal name:"fechaUltimoReporteSemanal", column:"fechaUltimoReporteSemanal"
        fechaProximoReporteSemanal name:"fechaProximoReporteSemanal", column:"fechaProximoReporteSemanal"
        fechaUltimoReporteMensual name:"fechaUltimoReporteMensual", column:"fechaUltimoReporteMensual"
        tipoInstitucion name:"tipoInstitucion", column:"tipoInstitucion", size: 0..3
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombreOtorgante }
}
