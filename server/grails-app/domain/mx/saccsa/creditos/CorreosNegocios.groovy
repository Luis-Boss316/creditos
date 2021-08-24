package mx.saccsa.creditos

class CorreosNegocios {
    Boolean activo1
    Boolean principal1
    String tipo1
    String correo

    static constraints = {
        activo1 nullable: true
        principal1 nullable: true
        tipo1 nullable: true
        correo nullable: true
    }

    static mapping = {
        table('CORREOSNEGOCIOS')
        version(false)
        id generator: "identity"
        activo1 name:"activo", column:"activo"
        principal1 name:"principal", column:"principal"
        tipo1 name:"tipo", column:"tipo"
        correo name:"correo", column:"correo"
    }

    static transients = ['descLabel']
    String getDescLabel(){ correo }
}
