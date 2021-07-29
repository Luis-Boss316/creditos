package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Generales)
interface GeneralesService {

    Generales get(Serializable id)

    List<Generales> list(Map args)

    Long count()

    void delete(Serializable id)

    Generales save(Generales generales)

}