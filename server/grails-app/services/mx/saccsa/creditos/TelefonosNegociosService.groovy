package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TelefonosNegocios)
interface TelefonosNegociosService {

    TelefonosNegocios get(Serializable id)

    List<TelefonosNegocios> list(Map args)

    Long count()

    void delete(Serializable id)

    TelefonosNegocios save(TelefonosNegocios telefonosNegocios)

}