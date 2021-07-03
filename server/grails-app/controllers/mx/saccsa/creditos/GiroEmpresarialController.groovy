package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class GiroEmpresarialController extends RestfulController<GiroEmpresarial> {
    GiroEmpresarialController() { super(GiroEmpresarial)}

    def index() {
        respond GiroEmpresarial.list().collect{
            [
                    id: it?.id,
                    claveGiroEmpresarial: it?.claveGiroEmpresarial,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
