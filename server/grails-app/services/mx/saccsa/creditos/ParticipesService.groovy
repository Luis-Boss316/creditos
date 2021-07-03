package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Participes)
interface ParticipesService {

    Participes get(Serializable id)

    List<Participes> list(Map args)

    Long count()

    void delete(Serializable id)

    Participes save(Participes participes)

}