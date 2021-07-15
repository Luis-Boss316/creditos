package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ActVulnerableController extends RestfulController<ActVulnerable>{
    ActVulnerableController() {super (ActVulnerable)}

    def index() {
        respond ActVulnerable.list().collect{
            [
                    id: it?.cveActVulnerable,
                    cveActVulnerable: it?.cveActVulnerable,
                    descripcion: it?.descripcion,
                    vulnerable: it?.vulnerable,
                    class:it.class.name,
                    descLabel:it.descLabel,
            ]
        }
    }
}
