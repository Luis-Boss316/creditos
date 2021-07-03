package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TipoSeguroController extends RestfulController<TipoSeguro>{
    TipoSeguroController() {super (TipoSeguro)}

    def index() {
        respond TipoSeguro.list().collect{
            [
                    id: it?.id,
                    tipoSeguro: it?.tipoSeguro,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
