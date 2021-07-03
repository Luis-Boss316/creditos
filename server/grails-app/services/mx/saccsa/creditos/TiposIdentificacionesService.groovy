package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposIdentificaciones)
interface TiposIdentificacionesService {

    TiposIdentificaciones get(Serializable id)

    List<TiposIdentificaciones> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposIdentificaciones save(TiposIdentificaciones tiposIdentificaciones)

}