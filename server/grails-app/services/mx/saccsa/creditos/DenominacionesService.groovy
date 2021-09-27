package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Denominaciones)
interface DenominacionesService {

    Denominaciones get(Serializable id)

    List<Denominaciones> list(Map args)

    Long count()

    void delete(Serializable id)

    Denominaciones save(Denominaciones denominaciones)

}