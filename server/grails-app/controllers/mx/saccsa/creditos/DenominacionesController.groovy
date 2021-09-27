package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class DenominacionesController extends RestfulController<Denominaciones>{
    DenominacionesController() {super (Denominaciones)}

    def index(){
        respond Denominaciones.list().collect({
            [
                    id: it?.id,
                    tipo: it?.tipo,
                    valor: it?.valor,
            ]
        })
    }
}
