package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class InformacionPLDController extends RestfulController<InformacionPLD>{
    InformacionPLDController() {super (InformacionPLD)}

    def index() {
        respond InformacionPLD.list().collect({
            [
                    id: it?.id,
                    montoMaximoPago: it?.montoMaximoPago,
                    montoMaximoAnticipo: it?.montoMaximoAnticipo,
                    ingresosMensuales: it?.ingresosMensuales,
                    moneda: it?.moneda.descLabel,
                    centroTrabajo: it?.centroTrabajo,
                    proveedorRecursos: it?.proveedorRecursos,
                    canalPago: it?.canalPago,
                    formaPago: it?.formaPago.descLabel,
            ]
        })
    }
}
