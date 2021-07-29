package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Titular)
interface TitularService {

    Titular get(Serializable id)

    List<Titular> list(Map args)

    Long count()

    void delete(Serializable id)

    Titular save(Titular titular)

}