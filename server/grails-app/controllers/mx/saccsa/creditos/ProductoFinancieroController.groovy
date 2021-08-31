package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ProductoFinancieroController extends RestfulController<ProductoFinanciero>{
    ProductoFinancieroController() {super (ProductoFinanciero)}

    def index() {
        respond ProductoFinanciero.list().collect({
            [
                    id: it?.id,
                    producto: it?.producto,
                    montoMinimo: it?.montoMinimo,
                    montoMaximo: it?.montoMaximo,
                    tipo: it?.tipo,
                    clasificacionBancaria: it?.clasificacionBancaria,
                    moneda: it?.moneda.descLabel,
                    activo: it?.activo?'Si':'No',
            ]
        })
    }
}
