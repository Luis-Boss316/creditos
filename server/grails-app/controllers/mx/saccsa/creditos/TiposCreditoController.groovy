package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class TiposCreditoController extends RestfulController<TiposCredito>{
    TiposCreditoController() {super (TiposCredito)}

    def index() {
        respond TiposCredito.list().collect{
            [
                    id: it?.id,
                    claveTipoCredito: it?.claveTipoCredito,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
