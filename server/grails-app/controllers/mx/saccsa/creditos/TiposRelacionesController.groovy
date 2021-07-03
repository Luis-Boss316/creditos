package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposRelacionesController extends RestfulController<TiposRelaciones>{
    TiposRelacionesController() {super (TiposRelaciones)}

    def index() {
        respond TiposRelaciones.list().collect{
            [
                    id: it?.id,
                    claveTipoRelacion: it?.claveTipoRelacion,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
