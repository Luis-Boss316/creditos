package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Peritos)
interface PeritosService {

    Peritos get(Serializable id)

    List<Peritos> list(Map args)

    Long count()

    void delete(Serializable id)

    Peritos save(Peritos peritos)

}