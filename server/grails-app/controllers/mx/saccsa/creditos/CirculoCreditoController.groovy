package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class CirculoCreditoController extends RestfulController<CirculoCredito>{
    CirculoCreditoController() {super (CirculoCredito)}

    def index() {
        respond CirculoCredito.list().collect{
            [
                    id: it?.id,
                    numeroInstitucion: it?.numeroInstitucion,
                    claveOtorgante: it?.claveOtorgante,
                    nombreOtorgante: it?.nombreOtorgante,
                    identificadorMedio: it?.identificadorMedio,
                    domicilioDevolucion: it?.domicilioDevolucion,
            ]
        }
    }
}
