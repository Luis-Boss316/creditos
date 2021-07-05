package mx.saccsa.creditos

class GrupoFamilia {
    String grupoFamilia

    static constraints = {
        grupoFamilia nullable: false, blank: false
    }

    static mapping = {
        table "GRUPOFAMILIA"
        version false
        id generator: "identity"
        grupoFamilia name:"grupoFamilia", column: "grupoFamilia"
    }

    static transients = ['descLabel']
    String getDescLabel(){ grupoFamilia }
}
