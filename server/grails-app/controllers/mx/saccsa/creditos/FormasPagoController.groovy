package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class FormasPagoController extends RestfulController<FormasPago>{
    FormasPagoController() {super (FormasPago)}

    def index() {
        respond FormasPago.list().collect({
            [
                    id: it?.id,
                    valor: it?.valor,
                    descripcion: it?.descripcion,
                    operacion: it?.operacion,
            ]
        })
    }
}
