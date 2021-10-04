package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class SolicitudesController extends RestfulController<Solicitudes>{
    SolicitudesController() {super(Solicitudes)}

    def index() {
        respond Solicitudes.list().collect({
            [
                    id: it?.id,
                    tipo: it?.tipo,
                    nombre: it?.nombre,
                    fechaSolicitud: it?.fechaSolicitud,
                    sucursal: it?.sucursal.descLabel,
                    producto: it?.producto.descLabel,
                    ejecutivo: it?.ejecutivo.descLabel,
                    promotor: it?.promotor.descLabel,
                    concetoInversion: it?.concetoInversion,
                    numeroAmortizaciones: it?.numeroAmortizaciones,
                    fechaEntrega: it?.fechaEntrega,
                    fechaPrimerAmortizacion: it?.fechaPrimerAmortizacion,
                    tasa: it?.tasa,
                    estatus: it?.estatus,
            ]
        })
    }
}
