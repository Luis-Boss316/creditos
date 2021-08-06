package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Personas)
interface PersonasService {

    Personas get(Serializable id)

    List<Personas> list(Map args)

    Long count()

    void delete(Serializable id)

    Personas save(Personas personas)

}