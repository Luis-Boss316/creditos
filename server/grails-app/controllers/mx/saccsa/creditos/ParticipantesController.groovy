package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ParticipantesController extends RestfulController<Participantes>{
    ParticipantesController() {super (Participantes)}

    def index(){
        respond Participantes.list().collect{
            [
                    id: it?.id,
                    nombre: it?.nombre.descLabel,
                    participante: it?.participante,
                    puesto: it?.puesto,
                    porcentajeParticipacion: it?.porcentajeParticipacion,
                    apoderado: it?.apoderado,
                    poder: it?.poder,
                    firma: it?.firma,
            ]
        }
    }
}
