package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class SectoresBanxicoController extends RestfulController<SectoresBanxico>{
    SectoresBanxicoController() {super (SectoresBanxico)}

    def index() {
        respond SectoresBanxico.list().collect{
            [
                    id: it?.id,
                    claveSector: it?.claveSector,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
