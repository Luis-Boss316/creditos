package mx.saccsa.creditos

class ModoContacto {
    Long valor
    String descripcion
    String financieraNacional

    static constraints = {
        valor nullable: false, blank: false
        descripcion nullable: false, blank: false
        financieraNacional nullable: true, blank: true
    }

    static mapping = {
        table('MODOCONTACTO')
        version(false)
        id generator:"identity"
        valor name:"valor", column:"valor"
        descripcion name:"descripcion", column:"descripcion"
        financieraNacional name:"financieraNacional", column:"financieraNacional"
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
