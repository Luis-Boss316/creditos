package mx.saccsa.creditos

class CuentasBancariasNegocios {
    String banco
    String cuenta
    String clabe
    String noTarjeta

    static constraints = {
        banco nullable: true
        cuenta nullable: true
        clabe nullable: true
        noTarjeta nullable: true
    }

    static mapping = {
        table('CUENTASBANCARIASNEGOCIOS')
        version(false)
        id generator: "identity"
        banco name:"banco", column:"banco"
        cuenta name:"cuenta", column:"cuenta"
        clabe name:"clabe", column:"clabe"
        noTarjeta name:"noTarjeta", column:"noTarjeta"
    }

    static transients = ['descLabel']
    String getDescLabel(){ banco + noTarjeta}
}
