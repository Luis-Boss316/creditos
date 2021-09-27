package mx.saccsa.creditos

class FormasPago {
    String valor
    String descripcion
    String operacion

    static constraints = {
        valor nullable: false, blank: false
        descripcion nullable: false, blank: false
        operacion nullable: true, blank: true
    }

    static mapping = {
        table('FORMASDEPAGO')
        version(false)
        id generator: "identity"
        valor name:"valor", column:"valor"
        descripcion name:"descripcion", column:"descripcion"
        operacion name:"operacion", column:"operacion"
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
