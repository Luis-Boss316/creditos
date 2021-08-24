package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(CorreosNegocios)
interface CorreosNegociosService {

    CorreosNegocios get(Serializable id)

    List<CorreosNegocios> list(Map args)

    Long count()

    void delete(Serializable id)

    CorreosNegocios save(CorreosNegocios correosNegocios)

}