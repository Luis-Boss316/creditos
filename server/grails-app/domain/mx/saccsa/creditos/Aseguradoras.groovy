package mx.saccsa.creditos

class Aseguradoras {
    Integer claveAseguradoraSeguro
    String descripcionCorta
    String descripcion

    static constraints = {
        claveAseguradoraSeguro nullable: false, blank:false
        descripcionCorta nullable: false, blank:false
        descripcion nullable: false, blank:false
    }

    static mapping = {
        table "ASEGURADORAS"
        version false
        id generator: "identity"
        claveAseguradoraSeguro name:"claveAseguradoraSeguro", column:"claveAseguradoraSeguro", size: 0..1
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..20
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
