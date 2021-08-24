package mx.saccsa.creditos

class DatosGeneralesPersonas {
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
        primerNombre nullable: true
        segundoNombre nullable: true
        apellidoPaterno nullable: true
        apellidoMaterno nullable: true
        genero nullable: true
        estadoCivil nullable: true
        nacionalidad nullable: true
        fechaNacimiento nullable: true
        actividad nullable: true
        giro nullable: true
        paisNacimiento nullable: true
        estadoNacimiento nullable: true
    }
    static mapping = {
        table('DATOSGENERALESPERSONAS')
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
