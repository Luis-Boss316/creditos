package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Participantes)
interface ParticipantesService {

    Participantes get(Serializable id)

    List<Participantes> list(Map args)

    Long count()

    void delete(Serializable id)

    Participantes save(Participantes participantes)

}