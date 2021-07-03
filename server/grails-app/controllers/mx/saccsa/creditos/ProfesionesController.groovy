package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class ProfesionesController extends RestfulController<Profesiones>{
    ProfesionesController() {super (Profesiones)}

    def index() {
        respond Profesiones.list().collect{
            [
                    id: it?.id,
                    claveProfesion: it?.claveProfesion,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
