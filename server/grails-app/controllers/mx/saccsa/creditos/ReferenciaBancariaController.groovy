package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ReferenciaBancariaController extends RestfulController<ReferenciaBancaria>{
    ReferenciaBancariaController() {super (ReferenciaBancaria)}

    def index() {
        respond ReferenciaBancaria.list().collect({
            [
                    id: it?.id,
                    tipo: it?.tipo,
                    cuentaBancaria: it?.cuentaBancaria,
                    referencia: it?.referencia,
            ]
        })
    }
}
