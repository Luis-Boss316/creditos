package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class DatosBancariosController extends RestfulController<DatosBancarios>{
    DatosBancariosController() {super (DatosBancarios)}

    def index(){
        respond DatosBancarios.list().collect{
            [
                    id: it?.id,
                    nombre: it?.nombre.descLabel,
                    banco: it?.banco,
                    cuenta: it?.cuenta,
                    clabe: it?.clabe,
                    noTarjeta: it?.noTarjeta,
            ]
        }
    }
}
