package mx.saccsa.creditos

class Correos {
    Boolean activo
    Boolean principal
    String tipo
    String correo

    static constraints = {
        activo nullable: true
        principal nullable: true
        tipo nullable: true
        correo nullable: true
    }

    static mapping = {
        table('CORREOS')
        version(false)
        id generator: "identity"
        activo name:"activo", column:"activo"
        principal name:"principal", column:"principal"
        tipo name:"tipo", column:"tipo"
        correo name:"correo", column:"correo"
    }

    static transients = ['descLabel']
    String getDescLabel(){ correo }
}
