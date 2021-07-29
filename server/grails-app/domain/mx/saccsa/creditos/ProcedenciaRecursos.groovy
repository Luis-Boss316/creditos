package mx.saccsa.creditos

class ProcedenciaRecursos {
    //Procedencia de recursos
    String procedenciaRecurso
    String detalleRecurso

    static constraints = {
        //        Procedencia de resursos
        procedenciaRecurso nullable: true
        detalleRecurso nullable: true
    }

    static mapping = {
        //        Procedencia de recursos
        table "ProcedenciaRecursos"
        version false
        id generator: "identity"
        procedenciaRecurso name: "procedenciaRecurso", column:"procedenciaRecurso"
        detalleRecurso name: "detalleRecurso", column:"detalleRecurso"
    }

    static transients = ['descLabel']
    String getDescLabel(){ detalleRecurso }
}
