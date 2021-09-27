package mx.saccsa.creditos

class Denominaciones {
    String tipo
    String valor

    static constraints = {
        tipo nullable: false, blank: false
        valor nullable: false, blank: false
    }

    static mapping = {
        table('DENOMINACIONES')
        version(false)
        id generator: "identity"
        tipo name:"tipo", column:"tipo"
        valor name:"valor", column:"valor"
    }

    static transients = ['descLabel']
    String getDescLabel(){ tipo }
}
