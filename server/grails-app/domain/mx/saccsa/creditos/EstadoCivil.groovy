package mx.saccsa.creditos

class EstadoCivil {
    Integer claveEstadoCivil
    String descripcionCorta
    String descripcion
    Boolean casado

    static constraints = {
        claveEstadoCivil nullable:false, blank:false
        descripcionCorta nullable:false, blank:false
        descripcion nullable:false, blank:false
        casado nullable:false, blank:false
    }

    static mapping = {
        table "ESTADOCIVIL"
        version false
        id generator : "identity"
        claveEstadoCivil name:"claveEstadoCivil", column:"claveEstadoCivil", size: 0..3
        descripcionCorta name:"descripcionCorta", column:"descripcionCorta", size: 0..10
        descripcion name:"descripcion", column:"descripcion", size: 0..60
        casado name:"casado", column:"casado"
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
