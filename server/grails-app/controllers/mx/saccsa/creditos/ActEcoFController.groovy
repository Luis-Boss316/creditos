package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ActEcoFController extends RestfulController<ActEcoF>{
    ActEcoFController() {super (ActEcoF)}

    def index() {
        respond ActEcoF.list().collect{
            [
                    id: it?.id,
                    claveActividad: it?.claveActividad,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
