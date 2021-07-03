package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class CoberturasGeograficasController extends RestfulController<CoberturasGeograficas>{
    CoberturasGeograficasController() {super (CoberturasGeograficas)}

    def index() {
        respond CoberturasGeograficas.list().collect{
            [
                    id: it?.id,
                    claveCobertura: it?.claveCobertura,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
