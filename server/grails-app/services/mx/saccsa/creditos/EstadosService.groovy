package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Estados)
interface EstadosService {

    Estados get(Serializable id)

    List<Estados> list(Map args)

    Long count()

    void delete(Serializable id)

    Estados save(Estados estados)

}