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
                    modoDeContacto: it?.modoDeContacto,
                    comoSeEntero: it?.comoSeEntero,
                    sucursal: it?.sucursal,
                    ejecutivo: it?.ejecutivo,
                    promotor: it?.promotor,
                    producto: it?.producto,
                    monto: it?.monto,
            ]
        })
    }
}
