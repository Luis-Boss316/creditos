package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class CorreosNegociosController extends RestfulController<CorreosNegocios>{
    CorreosNegociosController() {super (CorreosNegocios)}

    def index(){
        respond CorreosNegocios.list().collect{
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
