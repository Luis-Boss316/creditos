package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ContactosNegociosController extends RestfulController<ContactosNegocios> {
    ContactosNegociosController() {super (ContactosNegocios)}

    def index(){
        respond ContactosNegocios.list().collect{
            [
                    id: it?.id,
                    nombre: it?.nombre.descLabel,
                    relacion: it?.relacion,
                    persona: it?.persona,
            ]
        }
    }
}
