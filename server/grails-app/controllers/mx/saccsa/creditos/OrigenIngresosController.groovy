package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class OrigenIngresosController extends RestfulController<OrigenIngresos>{
    OrigenIngresosController() {super (OrigenIngresos)}

    def index() {
        respond OrigenIngresos.list().collect{
            [
                    id: it?.id,
                    claveOrigenIngresos: it?.claveOrigenIngresos,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
