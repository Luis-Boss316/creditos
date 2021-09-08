package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(FrecuenciaPago)
interface FrecuenciaPagoService {

    FrecuenciaPago get(Serializable id)

    List<FrecuenciaPago> list(Map args)

    Long count()

    void delete(Serializable id)

    FrecuenciaPago save(FrecuenciaPago frecuenciaPago)

}