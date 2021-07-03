package mx.saccsa.creditos

import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class PuestosEmpleosController extends RestfulController<PuestosEmpleos>{
    PuestosEmpleosController() {super (PuestosEmpleos)}

    def index() {
        respond PuestosEmpleos.list().collect{
            [
                    id: it?.id,
                    clavePuestoEmpleo: it?.clavePuestoEmpleo,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
