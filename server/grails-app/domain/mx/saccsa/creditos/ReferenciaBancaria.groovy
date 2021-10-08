package mx.saccsa.creditos

class ReferenciaBancaria {
    String tipo
    String cuentaBancaria
    String referencia

    static constraints = {
        tipo nullable: false, blank: false
        cuentaBancaria nullable: false, blank: false
        referencia nullable: false, blank: false
    }

    static mapping = {
        table('REFERENCIASBANCARIAS')
        version(false)
        id generator: "identity"
        tipo name:"tipo", column:"tipo"
        cuentaBancaria name:"cuentaBancaria", column:"cuentaBancaria"
        referencia name:"referencia", column:"referencia"
    }
}
