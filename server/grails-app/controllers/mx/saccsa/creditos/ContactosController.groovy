package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ContactosController extends RestfulController<Contactos>{
    ContactosController() {super (Contactos)}

    def index(){
        respond Contactos.list().collect{
            [
                    id: it?.id,
                    nombre: it?.nombre.descLabel,
                    relacion: it?.relacion.descLabel,
                    persona: it?.persona,
            ]
        }
    }
}
