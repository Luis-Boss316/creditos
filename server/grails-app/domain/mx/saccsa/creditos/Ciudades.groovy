package mx.saccsa.creditos

class Ciudades {
    Integer numeroCiudad
    Integer numeroEstado
    Integer numeroPais
    String descripcion

    static constraints = {
        numeroCiudad nullable: false,  blank: false
        numeroEstado nullable: false,  blank: false
        numeroPais nullable: false,  blank: false
        descripcion nullable: false,  blank: false
    }

    static mapping = {
        table "CIUDADES"
        version false
        id generator : "identity"
        numeroCiudad name:"numeroCiudad", column:"numeroCiudad", size: 0..5
        numeroEstado name:"numeroEstado", column:"numeroEstado", size: 0..5
        numeroPais name:"numeroPais", column:"numeroPais", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
