package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class DestinosCreditoController extends RestfulController<DestinosCredito>{
    DestinosCreditoController() {super (DestinosCredito)}

    def index() {
        respond DestinosCredito.list().collect{
            [
                    id: it?.id,
                    claveDestino: it?.claveDestino,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
