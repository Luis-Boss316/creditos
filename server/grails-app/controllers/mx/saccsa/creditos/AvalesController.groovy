package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class AvalesController extends RestfulController<Avales>{
    AvalesController() {super (Avales)}

    def index() {
        respond Avales.list().collect({
            [
                    id: it?.id,
                    tipo: it?.tipo,
                    nombre: it?.nombre,
                    relacion: it?.relacion,
            ]
        })
    }
}
