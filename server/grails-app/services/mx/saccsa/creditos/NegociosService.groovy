package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Negocios)
interface NegociosService {

    Negocios get(Serializable id)

    List<Negocios> list(Map args)

    Long count()

    void delete(Serializable id)

    Negocios save(Negocios negocios)

}