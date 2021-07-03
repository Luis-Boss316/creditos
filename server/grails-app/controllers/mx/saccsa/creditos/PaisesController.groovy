package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class PaisesController extends RestfulController<Paises> {
    PaisesController() {super (Paises)}

    def index() {
        respond Paises.list().collect{
            [
                    id: it?.id,
                    clavePais: it?.clavePais,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
