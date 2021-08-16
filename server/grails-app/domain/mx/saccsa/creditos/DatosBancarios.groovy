package mx.saccsa.creditos

class DatosBancarios {
    Personas nombre
    String banco
    String cuenta
    String clabe
    String noTarjeta

    static constraints = {
        nombre nullable: false, blank: true
        banco nullable: false, blank: true
        cuenta nullable: false, blank: true
        clabe nullable: false, blank: true
        noTarjeta nullable: false, blank: true
    }

    static mapping = {
        table('DATOSBANCARIOS')
        version(false)
        id generator: "identity"
        nombre name:"nombre", column:"nombre"
        banco name:"banco", column:"banco"
        cuenta name:"cuenta", column:"cuenta"
        clabe name:"clabe", column:"clabe"
        noTarjeta name:"noTarjeta", column:"noTarjeta"
    }

    static transients = ['descLabel']
    String getDescLabel(){ banco + noTarjeta}
}
