package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class BeneficiariosController extends RestfulController<Beneficiarios>{
    BeneficiariosController() {super(Beneficiarios)}

    def index() {
        respond Beneficiarios.list().collect({
            [
                    id: it?.id,
                    tipo: it?.tipo,
                    nombre: it?.nombre,
                    relacion: it?.relacion.descLabel,
            ]
        })
    }
}
