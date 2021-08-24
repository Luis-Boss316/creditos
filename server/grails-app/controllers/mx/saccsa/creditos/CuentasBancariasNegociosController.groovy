package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class CuentasBancariasNegociosController extends RestfulController<CuentasBancariasNegocios>{
    CuentasBancariasNegociosController() {super (CuentasBancariasNegocios)}

    def index(){
        respond CuentasBancariasNegocios.list().collect{
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
