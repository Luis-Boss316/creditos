package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposDomiciliosController extends RestfulController<TiposDomicilios>{
    TiposDomiciliosController() {super (TiposDomicilios)}

    def index() {
        respond TiposDomicilios.list().collect{
            [
                    id: it?.id,
                    claveTipoDomicilio: it?.claveTipoDomicilio,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
