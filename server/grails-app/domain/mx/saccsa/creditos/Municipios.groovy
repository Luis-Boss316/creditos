package mx.saccsa.creditos

class Municipios {
    Integer numeroMunicipio
    Integer numeroEstado
    Integer numeroPais
    String descripcionCorta
    String descripcionEstado

    static constraints = {
        numeroMunicipio nullable:false, blank:false
        numeroEstado nullable:false, blank:false
        numeroPais nullable:false, blank:false
        descripcionCorta nullable:false, blank:false
        descripcionEstado nullable:false, blank:false
    }

    static mapping = {
        table "MUNICIPIOS"
        version false
        id generator : "identity"
        numeroMunicipio name:"numeroMunicipio", column:"numeroMunicipio", size: 0..5
        numeroEstado name:"numeroEstado", column:"numeroEstado", size: 0..5
        numeroPais name:"numeroPais", column:"numeroPais", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcionEstado name:"descripcionEstado", column:"descripcionEstado", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcionEstado }
}
