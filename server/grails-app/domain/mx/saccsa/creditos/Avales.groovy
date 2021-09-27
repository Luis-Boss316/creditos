package mx.saccsa.creditos

class Avales {
    String tipo
    String nombre
    String relacion

    static constraints = {
        tipo nullable: false, blank: false
        nombre nullable: false, blank: false
        relacion nullable: false, blank: false
    }

    static mapping = {
        table('AVALES')
        version(false)
        id generator: "identity"
        tipo name:"tipo", column:"tipo"
        nombre name:"nombre", column:"nombre"
        relacion name:"relacion", column:"relacion"
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombre }
}
