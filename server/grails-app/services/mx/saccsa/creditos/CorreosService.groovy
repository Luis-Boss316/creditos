package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Correos)
interface CorreosService {

    Correos get(Serializable id)

    List<Correos> list(Map args)

    Long count()

    void delete(Serializable id)

    Correos save(Correos correos)

}