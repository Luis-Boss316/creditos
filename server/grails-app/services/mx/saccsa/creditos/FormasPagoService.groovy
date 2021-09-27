package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(FormasPago)
interface FormasPagoService {

    FormasPago get(Serializable id)

    List<FormasPago> list(Map args)

    Long count()

    void delete(Serializable id)

    FormasPago save(FormasPago formasPago)

}