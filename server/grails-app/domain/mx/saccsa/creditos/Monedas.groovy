package mx.saccsa.creditos

class Monedas {
    Integer claveMoneda
    String descripcionCorta
    String descripcion
    Paises numeroPais

    static constraints = {
        claveMoneda nullable: false, blank: false
        descripcionCorta nullable: false, blank: false
        descripcion nullable: false, blank: false
        numeroPais nullable: false, blank: false
    }

    static mapping = {
        table "MONEDAS"
        version false
        id generator: "identity"
        claveMoneda name:"claveMoneda", column:"claveMoneda", size: 0..10
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
        numeroPais name:"numeroPais", column:"numeroPais"
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
