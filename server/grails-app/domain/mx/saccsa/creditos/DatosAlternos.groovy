package mx.saccsa.creditos

class DatosAlternos {
    Personas nombre
    String primerNombre
    String segundoNombre
    String apellidoPaterno
    String apellidoMaterno

    static constraints = {
        nombre nullable: false, blank: false
        primerNombre nullable: false, blank: false
        segundoNombre nullable: true, blank: true
        apellidoPaterno nullable: false, blank: false
        apellidoMaterno nullable: false, blank: false
    }

    static mapping = {
        table('DATOSALTERNOS')
        version(false)
        id generator: "identity"
        nombre name:"nombre", column:"nombre"
        primerNombre name:"primerNombre", column:"primerNombre"
        segundoNombre name:"segundoNombre", column:"segundoNombre"
        apellidoPaterno name:"apellidoPaterno", column:"apellidoPaterno"
        apellidoMaterno name:"apellidoMaterno", column:"apellidoMaterno"
    }

    static transients = ['descLabel']
    String getDescLabel(){ primerNombre + apellidoPaterno }
}
