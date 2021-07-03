package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ActEcoCNBV)
interface ActEcoCNBVService {

    ActEcoCNBV get(Serializable id)

    List<ActEcoCNBV> list(Map args)

    Long count()

    void delete(Serializable id)

    ActEcoCNBV save(ActEcoCNBV actEcoCNBV)

}