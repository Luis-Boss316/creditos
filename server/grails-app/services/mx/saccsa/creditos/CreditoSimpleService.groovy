package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(CreditoSimple)
interface CreditoSimpleService {

    CreditoSimple get(Serializable id)

    List<CreditoSimple> list(Map args)

    Long count()

    void delete(Serializable id)

    CreditoSimple save(CreditoSimple creditoSimple)

}