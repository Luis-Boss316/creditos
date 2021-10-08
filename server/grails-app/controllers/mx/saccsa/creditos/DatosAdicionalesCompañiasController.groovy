package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class DatosAdicionalesCompañiasController extends RestfulController<DatosAdicionalesCompañias>{
    DatosAdicionalesCompañiasController() {super (DatosAdicionalesCompañias)}

    def index() {
        respond DatosAdicionalesCompañias.list().collect({
            [
                    id: it?.id,
                    compañiaRetenedora: it?.compañiaRetenedora,
            ]
        })
    }
}
