package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ValoresTasasReferenciaController extends RestfulController<ValoresTasasReferencia>{
    ValoresTasasReferenciaController() {super (ValoresTasasReferencia)}

    def index() {
        respond ValoresTasasReferencia.list().collect{
            [
                    id: it?.id,
                    claveTasa: it?.claveTasa.descLabel,
                    fechaInicioVigencia: it?.fechaInicioVigencia,
                    valor: it?.valor,
            ]
        }
    }
}
