package mx.saccsa.creditos

class Contactos {
    Personas nombre
    TiposRelaciones relacion
    String persona

    static constraints = {
        nombre nullable:true, blank: false
        relacion nullable:true, blank: false
        persona nullable:true, blank: false
    }

    static mapping = {
        table('CONTACTOS')
        version(false)
        id generator: "identity"
        nombre name:"nombre", column:"nombre"
        relacion name:"relacion", column:"relacion"
        persona name:"persona", column:"persona"
    }

    static transients = ['descLabel']
    String getDescLabel(){ persona }
}
