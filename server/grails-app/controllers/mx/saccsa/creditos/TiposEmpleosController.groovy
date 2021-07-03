package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposEmpleosController extends RestfulController<TiposEmpleos>{
    TiposEmpleosController() {super (TiposEmpleos)}

    def index() {
        respond TiposEmpleos.list().collect{
            [
                    id: it?.id,
                    claveTipoEmpleo: it?.claveTipoEmpleo,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
