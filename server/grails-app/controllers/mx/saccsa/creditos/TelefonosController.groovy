package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class TelefonosController extends RestfulController<Telefonos>{
TelefonosController() {super (Telefonos)}

    def index(){
        respond Telefonos.list().collect{
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
