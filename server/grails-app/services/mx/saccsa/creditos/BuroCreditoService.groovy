package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(BuroCredito)
interface BuroCreditoService {

    BuroCredito get(Serializable id)

    List<BuroCredito> list(Map args)

    Long count()

    void delete(Serializable id)

    BuroCredito save(BuroCredito buroCredito)

}