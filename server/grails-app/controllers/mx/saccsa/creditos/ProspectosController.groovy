package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class ProspectosController extends RestfulController<Prospectos>{
    ProspectosController() {super (Prospectos)}

    def index() {
        respond Prospectos.list().collect({
            [
                    id: it?.id,
                    tipo: it?.tipo,
                    nombre: it?.nombre,
                    modoDeContacto: it?.modoDeContacto.descLabel,
                    comoSeEntero: it?.comoSeEntero.descLabel,
                    sucursal: it?.sucursal.descLabel,
                    ejecutivo: it?.ejecutivo.descLabel,
                    promotor: it?.promotor.descLabel,
                    producto: it?.producto.descLabel,
                    monto: it?.monto,
            ]
        })
    }
}
