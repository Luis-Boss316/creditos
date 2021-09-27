package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class CoacreditadosController extends RestfulController<Coacreditados>{
    CoacreditadosController() {super(Coacreditados)}

    def index() {
        respond Coacreditados.list().collect({
            [
                    id: it?.id,
                    tipo: it?.tipo,
                    nombre: it?.nombre,
                    relacion: it?.relacion,
            ]
        })
    }
}
