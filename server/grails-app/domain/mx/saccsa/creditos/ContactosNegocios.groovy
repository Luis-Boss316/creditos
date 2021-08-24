package mx.saccsa.creditos

class ContactosNegocios {
    String relacion
    String persona

    static constraints = {
        relacion nullable:true
        persona nullable:true
    }

    static mapping = {
        table('CONTACTOSNEGOCIOS')
        version(false)
        id generator: "identity"
        relacion name:"relacion", column:"relacion"
        persona name:"persona", column:"persona"
    }

    static transients = ['descLabel']
    String getDescLabel(){ persona }
}
