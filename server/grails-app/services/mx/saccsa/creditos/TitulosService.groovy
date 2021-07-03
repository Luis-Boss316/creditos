package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Titulos)
interface TitulosService {

    Titulos get(Serializable id)

    List<Titulos> list(Map args)

    Long count()

    void delete(Serializable id)

    Titulos save(Titulos titulos)

}