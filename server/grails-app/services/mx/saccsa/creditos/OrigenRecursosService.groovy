package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(OrigenRecursos)
interface OrigenRecursosService {

    OrigenRecursos get(Serializable id)

    List<OrigenRecursos> list(Map args)

    Long count()

    void delete(Serializable id)

    OrigenRecursos save(OrigenRecursos origenRecursos)

}