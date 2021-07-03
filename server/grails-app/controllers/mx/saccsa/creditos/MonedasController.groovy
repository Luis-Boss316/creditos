package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class MonedasController extends RestfulController<Monedas> {
    MonedasController() {super (Monedas)}

    def index() {
        respond Monedas.list().collect{
            [
                    id: it?.id,
                    claveMoneda: it?.claveMoneda,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
                    numeroPais: it.numeroPais.descLabel,
            ]
        }
    }
}
