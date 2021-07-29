package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class TipoClienteController extends RestfulController<TipoCliente>{
TipoClienteController() {super (TipoCliente)}

    def combo(){
        def listaTipoDeCliente = TipoCliente.list()
        respond data:listaTipoDeCliente.collect{ [class:it.class.name, id: it.id,descLabel: it.descLabel]}
    }
}
