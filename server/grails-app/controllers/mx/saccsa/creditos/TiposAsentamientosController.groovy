package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposAsentamientosController extends RestfulController<TiposAsentamientos>{
    TiposAsentamientosController() {super (TiposAsentamientos)}

    def index() {
        respond TiposAsentamientos.list().collect{
            [
                    id: it?.id,
                    claveTipoAsentamiento: it?.claveTipoAsentamiento,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
