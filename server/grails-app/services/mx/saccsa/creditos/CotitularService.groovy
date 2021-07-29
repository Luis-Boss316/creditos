package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Cotitular)
interface CotitularService {

    Cotitular get(Serializable id)

    List<Cotitular> list(Map args)

    Long count()

    void delete(Serializable id)

    Cotitular save(Cotitular cotitular)

}