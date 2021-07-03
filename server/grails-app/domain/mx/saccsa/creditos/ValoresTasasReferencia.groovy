package mx.saccsa.creditos

class ValoresTasasReferencia {
    TasasReferencia claveTasa
    Date fechaInicioVigencia
    String valor

    static constraints = {
        claveTasa nullable: false, blank: false
        fechaInicioVigencia nullable: false, blank: false
        valor nullable: false, blank: false
    }

    static mapping = {
        table "VALORESTASAREFERENCIA"
        version false
        id generator: "identity"
        claveTasa name:"claveTasa", column:"claveTasa", size: 0..4
        fechaInicioVigencia name:"fechaInicioVigencia", column:"fechaInicioVigencia"
        valor name:"valor", column:"valor"
    }

    static transients = ['descLabel']
    String getDescLabel(){ valor }
}
