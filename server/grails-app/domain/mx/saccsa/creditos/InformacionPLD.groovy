package mx.saccsa.creditos

class InformacionPLD {
    BigDecimal montoMaximoPago
    BigDecimal montoMaximoAnticipo
    BigDecimal ingresosMensuales
    Monedas moneda
    String centroTrabajo
    String proveedorRecursos
    String canalPago
    FormasPago formaPago

    static constraints = {
        montoMaximoPago nullable: false, blank: false
        montoMaximoAnticipo nullable: false, blank: false
        ingresosMensuales nullable: false, blank: false
        moneda nullable: false, blank: false
        centroTrabajo nullable: false, blank: false
        proveedorRecursos nullable: false, blank: false
        canalPago nullable: false, blank: false
        formaPago nullable: false, blank: false
    }

    static mapping = {
        table('INFORMACIONPLD')
        version(false)
        id generator: "identity"
        montoMaximoPago name:"montoMaximoPago", column:"montoMaximoPago"
        montoMaximoAnticipo name:"montoMaximoAnticipo", column:"montoMaximoAnticipo"
        ingresosMensuales name:"ingresosMensuales", column:"ingresosMensuales"
        moneda name:"moneda", column:"moneda"
        centroTrabajo name:"centroTrabajo", column:"centroTrabajo"
        proveedorRecursos name:"proveedorRecursos", column:"proveedorRecursos"
        canalPago name:"canalPago", column:"canalPago"
        formaPago name:"formaPago", column:"formaPago"
    }

    static transients = ['descLabel']
    String getDescLabel(){ montoMaximoPago + montoMaximoAnticipo }
}
