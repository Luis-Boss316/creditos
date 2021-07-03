package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class OcupacionesController extends RestfulController<Ocupaciones>{
    OcupacionesController() {super (Ocupaciones)}

    def index() {
        respond Ocupaciones.list().collect{
            [
                    id: it?.id,
                    claveOcupacion: it?.claveOcupacion,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
