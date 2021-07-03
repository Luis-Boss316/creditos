package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class ParticipesController extends RestfulController<Participes>{
    ParticipesController() {super (Participes)}

    def index() {
        respond Participes.list().collect{
            [
                    id: it?.id,
                    claveParticipe: it?.claveParticipe,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
