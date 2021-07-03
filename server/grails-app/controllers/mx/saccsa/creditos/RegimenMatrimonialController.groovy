package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class RegimenMatrimonialController extends RestfulController<RegimenMatrimonial>{
    RegimenMatrimonialController() {super (RegimenMatrimonial)}

    def index() {
        respond RegimenMatrimonial.list().collect{
            [
                    id: it?.id,
                    claveRegimenMatrimonial: it?.claveRegimenMatrimonial,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
