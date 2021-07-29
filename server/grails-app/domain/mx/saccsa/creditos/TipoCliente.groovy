package mx.saccsa.creditos

class TipoCliente {
    Long cveTipoDeCliente
    String descripcion

    static constraints = {
        descripcion nullable:false
    }

    static mapping = {
        table "TIPOCLIENTE"
        id generator: "assigned", name:'cveTipoDeCliente',column:'cveTipoDeCliente'
        cveTipoDeCliente name:'cveTipoDeCliente', column:'cveTipoDeCliente'
        descripcion name:'descripcion', column:'descripcion'
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }

    Long getId(){
        cveTipoDeCliente
    }
}
