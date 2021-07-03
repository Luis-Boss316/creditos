package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ActEcoBController extends RestfulController<ActEcoB>{
    ActEcoBController() {super (ActEcoB)}

    def index() {
        respond ActEcoB.list().collect{
            [
                    id: it?.id,
                    numeroSector: it?.numeroSector.descLabel,
                    indicadorActRiesgo: it?.indicadorActRiesgo?'Si':'No',
            ]
        }
    }
}
