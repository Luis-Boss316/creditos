package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly
@ReadOnly
class TiposGarantiaController extends RestfulController<TiposGarantia>{
    TiposGarantiaController() {super (TiposGarantia)}

    def index() {
        respond TiposGarantia.list().collect{
            [
                    id: it?.id,
                    claveTipoGarantia: it?.claveTipoGarantia,
                    descripcion: it?.descripcion,
                    contabiliza: it?.contabiliza?'Si':'No',
                    fega: it?.fega,
                    fonaga: it?.fonaga?'Si':'No',
                    deudor: it?.deudor,
            ]
        }
    }
}
