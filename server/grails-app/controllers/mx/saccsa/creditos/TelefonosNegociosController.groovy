package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class TelefonosNegociosController extends RestfulController<TelefonosNegocios>{
    TelefonosNegociosController() {super (TelefonosNegocios)}

    def index(){
        respond TelefonosNegocios.list().collect{
            [
                    id: it?.id,
                    nombre: it?.nombre.id,
                    activo: it?.activo,
                    principal: it?.principal,
                    tipo: it?.tipo,
                    compania: it?.compania,
                    lada: it?.lada,
                    telefono: it?.telefono,
                    extencion: it?.extencion,
                    observaciones: it?.observaciones,
            ]
        }
    }
}
