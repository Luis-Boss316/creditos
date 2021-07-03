package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ActEcoB)
interface ActEcoBService {

    ActEcoB get(Serializable id)

    List<ActEcoB> list(Map args)

    Long count()

    void delete(Serializable id)

    ActEcoB save(ActEcoB actEcoB)

}