package mx.saccsa.creditos

class DatosAlternos {
    String primerNombreA
    String segundoNombreA
    String apellidoPaternoA
    String apellidoMaternoA

    static constraints = {
        primerNombreA nullable: true
        segundoNombreA nullable: true
        apellidoPaternoA nullable: true
        apellidoMaternoA nullable: true
    }

    static mapping = {
        table('DATOSALTERNOS')
        version(false)
        id generator: "identity"
        primerNombreA name:"primerNombre", column:"primerNombre"
        segundoNombreA name:"segundoNombre", column:"segundoNombre"
        apellidoPaternoA name:"apellidoPaterno", column:"apellidoPaterno"
        apellidoMaternoA name:"apellidoMaterno", column:"apellidoMaterno"
    }

    static transients = ['descLabel']
    String getDescLabel(){ primerNombreA + apellidoPaternoA }
}
