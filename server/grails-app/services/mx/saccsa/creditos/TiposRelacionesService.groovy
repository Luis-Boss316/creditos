package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposRelaciones)
interface TiposRelacionesService {

    TiposRelaciones get(Serializable id)

    List<TiposRelaciones> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposRelaciones save(TiposRelaciones tiposRelaciones)

}