package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class PromotorController extends RestfulController<Promotor>{
    PromotorController() {super (Promotor)}

    def index() {
        respond Promotor.list().collect{
            [
                    id: it?.id,
                    cvePromotor: it?.cvePromotor,
                    ciudad: it?.ciudad,
                    colonia: it?.colonia,
                    direccion: it?.direccion,
                    nombre: it?.nombre,
            ]
        }
    }
}
