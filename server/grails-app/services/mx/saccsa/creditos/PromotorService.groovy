package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Promotor)
interface PromotorService {

    Promotor get(Serializable id)

    List<Promotor> list(Map args)

    Long count()

    void delete(Serializable id)

    Promotor save(Promotor promotor)

}