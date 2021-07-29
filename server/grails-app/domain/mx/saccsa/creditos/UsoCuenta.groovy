package mx.saccsa.creditos

class UsoCuenta {
    //Uso y movimientos de la cuenta
    TipoCliente tipoCliente
    String uso
    BigDecimal montoDepositoInicial = 0
    Integer numeroAproxDepoMensualesMin = 0
    Integer numeroAproxDepoMensualesMax = 0
    Integer porccentajePromedioMensualDepositosMin = 0
    Integer porccentajePromedioMensualDepositosMax = 0
    Integer numeroAproxRetirosMensualesMin = 0
    Integer numeroAproxRetirosMensualesMax = 0
    Integer montoAproxMensualRetirosMin = 0
    Integer montoAproxMensualRetirosMax = 0
    Date fechaBaja
    Boolean liqVSsaldo  = false
    Boolean manejaCust  = false
    Boolean cortoEfectivo  = false

    static constraints = {
        //        Usos y movimientos de la cuenta
        tipoCliente nullable: true
        uso nullable: true
        montoDepositoInicial nullable: true
        numeroAproxDepoMensualesMin nullable: true
        numeroAproxDepoMensualesMax nullable: true
        porccentajePromedioMensualDepositosMin nullable: true
        porccentajePromedioMensualDepositosMax nullable: true
        numeroAproxRetirosMensualesMin nullable: true
        numeroAproxRetirosMensualesMax nullable: true
        montoAproxMensualRetirosMin nullable: true
        montoAproxMensualRetirosMax nullable: true
        fechaBaja nullable: true
        liqVSsaldo nullable: true
        manejaCust nullable: true
        cortoEfectivo nullable: true
    }

    static mapping = {
        //        Uso y movimiento de la cuenta
        table "UsoCuenta"
        version false
        id generator:"identity"
        tipoCliente name:"tipoCliente", column:"tipoCliente"
        uso name:"uso", column:"uso"
        montoDepositoInicial name:"montoDepositoInicial", column:"montoDepositoInicial"
        numeroAproxDepoMensualesMin name:"numeroAproxDepoMensualesMin", column:"numeroAproxDepoMensualesMin"
        numeroAproxDepoMensualesMax name:"numeroAproxDepoMensualesMax", column:"numeroAproxDepoMensualesMax"
        porccentajePromedioMensualDepositosMin name:"porccentajePromedioMensualDepositosMin", column:"porccentajePromedioMensualDepositosMin"
        porccentajePromedioMensualDepositosMax name:"porccentajePromedioMensualDepositosMax", column:"porccentajePromedioMensualDepositosMax"
        numeroAproxRetirosMensualesMin name:"numeroAproxRetirosMensualesMin", column:"numeroAproxRetirosMensualesMin"
        numeroAproxRetirosMensualesMax name:"numeroAproxRetirosMensualesMax", column:"numeroAproxRetirosMensualesMax"
        montoAproxMensualRetirosMin name:"montoAproxMensualRetirosMin", column:"montoAproxMensualRetirosMin"
        montoAproxMensualRetirosMax name:"montoAproxMensualRetirosMax", column:"montoAproxMensualRetirosMax"
        fechaBaja name:"fechaBaja", column:"fechaBaja"
        liqVSsaldo name:"liqVSsaldo", column:"liqVSsaldo"
        manejaCust name:"manejaCust", column:"manejaCust"
        cortoEfectivo name:"cortoEfectivo", column:"cortoEfectivo"
    }

    static transients = ['descLabel']
    String getDescLabel(){ tipoCliente }
}
