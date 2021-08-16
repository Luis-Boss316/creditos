package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class CorreosController extends RestfulController<Correos>{
    CorreosController() {super (Correos)}

    def index(){
        respond Correos.list().collect{
            [
                    id: it?.id,
                    nombre: it?.nombre.id,
                    activo: it?.activo,
                    principal: it?.principal,
                    tipo: it?.tipo,
                    correo: it?.correo,
            ]
        }
    }
}
