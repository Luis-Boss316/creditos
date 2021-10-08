package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class CreditoSimpleController extends RestfulController<CreditoSimple>{
    CreditoSimpleController() {super (CreditoSimple)}

    def index() {
        respond CreditoSimple.list().collect({
            [
                    id: it?.id,
                    tipo: it?.tipo,
                    nombre: it?.nombre,
                    ocupacion: it?.ocupacion,
                    sucursal: it?.sucursal,
                    producto: it?.producto,
                    conceptoInversion: it?.conceptoInversion,
                    fechaContrato: it?.fechaContrato,
                    numeroContrato: it?.numeroContrato,
                    ejecutivo: it?.ejecutivo,
                    promotor: it?.promotor,
                    frecuenciaPago: it?.frecuenciaPago,
                    numeroAmortizacion: it?.numeroAmortizacion,
                    cat: it?.cat,
                    montoNeto: it?.montoNeto,
                    estatus: it?.estatus,
                    etiquetas: it?.etiquetas,
            ]
        })
    }
}
