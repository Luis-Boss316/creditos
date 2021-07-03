package mx.saccsa.creditos

class TipoSeguro {
    Integer tipoSeguro
    String descripcion

    static constraints = {
        tipoSeguro nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TIPOSEGURO"
        version false
        id generator: "identity"
        tipoSeguro name:"tipoSeguro", column:"tipoSeguro", size: 0..1
        descripcion name:"descripcion", column:"descripcion", size: 0..20
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
