package mx.saccsa.creditos

class Negocios {
    DatosGeneralesNegocios negocios
    TelefonosNegocios telefonosNegocios
    CorreosNegocios correosNegocios
    Participantes participantes
    ContactosNegocios contactosNegocios
    CuentasBancariasNegocios cuentasBancarias

    static constraints = {
        negocios nullable: true
        telefonosNegocios nullable: true
        correosNegocios nullable: true
        participantes nullable: true
        contactosNegocios nullable: true
        cuentasBancarias nullable: true
    }

    static mapping = {
        table('NEGOCIOS')
        version(false)
        id generator:"identity"
        negocios name:"negocios", column:"negocios"
        telefonosNegocios name:"telefonosNegocios", column:"telefonosNegocios"
        correosNegocios name:"correosNegocios", column:"correosNegocios"
        participantes name:"participantes", column:"participantes"
        contactosNegocios name:"contactosNegocios", column:"contactosNegocios"
        cuentasBancarias name:"cuentasBancarias", column:"cuentasBancarias"
    }

    static transients = ['descLabel']
    String getDescLabel(){ negocios }
}
