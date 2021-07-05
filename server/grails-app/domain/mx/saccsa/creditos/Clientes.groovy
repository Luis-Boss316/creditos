package mx.saccsa.creditos

class Clientes {
    String titularNombre
    String apellidoPaterno
    String apellidoMaterno
    String promotor
    GrupoFamilia grupoFamilia
    String estatus

    static constraints = {
        titularNombre nullable: false, blank: false
        apellidoPaterno nullable: false, blank: false
        apellidoMaterno nullable: false, blank: false
        promotor nullable: false, blank: false
        grupoFamilia nullable: true, blank: true
        estatus nullable: false, blank: false
    }

    static mapping = {
        table "CLIENTES"
        version false
        id generator: "identity"
        titularNombre name:"titularNombre", column:"titularNombre"
        apellidoPaterno name:"apellidoPaterno", column:"apellidoPaterno"
        apellidoMaterno name:"apellidoMaterno", column:"apellidoMaterno"
        promotor name:"promotor", column:"promotor"
        grupoFamilia name:"grupoFamilia", column:"grupoFamilia"
        estatus name:"estatus", column:"estatus"
    }

    static transients = ['descLabel']
    String getDescLabel(){ titularNombre }
}
