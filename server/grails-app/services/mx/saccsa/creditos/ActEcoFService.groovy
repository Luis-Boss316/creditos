package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ActEcoF)
interface ActEcoFService {

    ActEcoF get(Serializable id)

    List<ActEcoF> list(Map args)

    Long count()

    void delete(Serializable id)

    ActEcoF save(ActEcoF actEcoF)

}