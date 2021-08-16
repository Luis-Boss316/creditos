package mx.saccsa.creditos

class Correos {
    Personas nombre
    Boolean activo
    Boolean principal
    String tipo
    String correo

    static constraints = {
        nombre nullable: false, blank: false
        activo nullable: true, blank: true
        principal nullable: true, blank: true
        tipo nullable: false, blank: false
        correo nullable: false, blank: false
    }

    static mapping = {
        table('CORREOS')
        version(false)
        id generator: "identity"
        nombre name:"nombre", column:"nombre"
        activo name:"activo", column:"activo"
        principal name:"principal", column:"principal"
        tipo name:"tipo", column:"tipo"
        correo name:"correo", column:"correo"
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombre + correo }
}
