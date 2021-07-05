package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ClientesController extends RestfulController<Clientes>{
    ClientesController() {super (Clientes)}

    def index() {
        respond Clientes.list().collect{
            [
                    id: it?.id,
                    titularNombre: it?.titularNombre,
                    apellidoPaterno: it?.apellidoPaterno,
                    apellidoMaterno: it?.apellidoMaterno,
                    promotor: it?.promotor,
                    grupoFamilia: it?.grupoFamilia.descLabel,
                    estatus: it?.estatus,
            ]
        }
    }
}
