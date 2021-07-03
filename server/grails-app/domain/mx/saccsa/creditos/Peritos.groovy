package mx.saccsa.creditos

class Peritos {
    Integer numeroPerito
    String numeroRegistroPerito
    String apellidoPaternoPeritoTitular
    String apellidoMaternoPeritoTitular
    String primerNombrePeritoTitular
    String segundoNombrePeritoTitular

    static constraints = {
        numeroPerito nullable: false, blank: false
        numeroRegistroPerito nullable: false, blank: false
        apellidoPaternoPeritoTitular nullable: false, blank: false
        apellidoMaternoPeritoTitular nullable: false, blank: false
        primerNombrePeritoTitular nullable: false, blank: false
        segundoNombrePeritoTitular nullable: false, blank: false
    }

    static mapping = {
        table "PERITOS"
        version false
        id generator: "identity"
        numeroPerito name:"numeroPerito", column:"numeroPerito", size: 0..20
        numeroRegistroPerito name:"numeroRegistroPerito", column:"numeroRegistroPerito", size: 0..20
        apellidoPaternoPeritoTitular name:"apellidoPaternoPeritoTitular", column:"apellidoPaternoPeritoTitular", size: 0..60
        apellidoMaternoPeritoTitular name:"apellidoMaternoPeritoTitular", column:"apellidoMaternoPeritoTitular", size: 0..60
        primerNombrePeritoTitular name:"primerNombrePeritoTitular", column:"primerNombrePeritoTitular", size: 0..60
        segundoNombrePeritoTitular name:"segundoNombrePeritoTitular", column:"segundoNombrePeritoTitular", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ primerNombrePeritoTitular }
}
