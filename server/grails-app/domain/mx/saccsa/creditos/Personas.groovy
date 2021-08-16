package mx.saccsa.creditos

class Personas {
    String primerNombre
    String segundoNombre
    String apellidoPaterno
    String apellidoMaterno
    String genero
    EstadoCivil estadoCivil
    Nacionalidades nacionalidad
    Date fechaNacimiento
    String actividad
    GiroEmpresarial giro
    Paises paisNacimiento
    Estados estadoNacimiento
    static constraints = {
        primerNombre nullable: false, blank: false
        segundoNombre nullable: true, blank: true
        apellidoPaterno nullable: false, blank: false
        apellidoMaterno nullable: false, blank: false
        genero nullable: true, blank: true
        estadoCivil nullable: false, blank: false
        nacionalidad nullable: false, blank: false
        fechaNacimiento nullable: false, blank: false
        actividad nullable: true, blank: true
        giro nullable: true, blank: true
        paisNacimiento nullable: false, blank: false
        estadoNacimiento nullable: true, blank: true
    }
    static mapping = {
        table('PERSONAS')
        version(false)
        id generator: "identity"
        primerNombre name:"primerNombre", column:"primerNombre"
        segundoNombre name:"segundoNombre", column:"segundoNombre"
        apellidoPaterno name:"apellidoPaterno", column:"apellidoPaterno"
        apellidoMaterno name:"apellidoMaterno", column:"apellidoMaterno"
        genero name:"genero", column:"genero"
        estadoCivil name:"estadoCivil", column:"estadoCivil"
        nacionalidad name:"nacionalidad", column:"nacionalidad"
        fechaNacimiento name:"fechaNacimiento", column:"fechaNacimiento"
        actividad name:"actividad", column:"actividad"
        giro name:"giro", column:"giro"
        paisNacimiento name:"paisNacimiento", column:"paisNacimiento"
        estadoNacimiento name:"estadoNacimiento", column:"estadoNacimiento"
    }
    static transients = ['descLabel']
    String getDescLabel(){ primerNombre + apellidoPaterno }
}
