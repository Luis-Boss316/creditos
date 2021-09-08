package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class FrecuenciaPagoController extends RestfulController<FrecuenciaPago>{
    FrecuenciaPagoController() {super (FrecuenciaPago)}

    def index() {
        respond FrecuenciaPago.list().collect({
            [
                    id: it?.id,
                    dias: it?.dias,
                    frecuenciaPago: it?.frecuenciaPago,
                    cnbv: it?.cnbv,
                    bc: it?.bc,
                    cc: it?.cc,
            ]
        })
    }
}
