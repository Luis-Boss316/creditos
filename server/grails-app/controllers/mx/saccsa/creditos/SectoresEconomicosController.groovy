package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class SectoresEconomicosController extends RestfulController<SectoresEconomicos>{
    SectoresEconomicosController() {super (SectoresEconomicos)}

    def index() {
        respond SectoresEconomicos.list().collect{
            [
                    id: it?.id,
                    claveSectorEconomico: it?.claveSectorEconomico,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
