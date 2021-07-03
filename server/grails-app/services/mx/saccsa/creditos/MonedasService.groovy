package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Monedas)
interface MonedasService {

    Monedas get(Serializable id)

    List<Monedas> list(Map args)

    Long count()

    void delete(Serializable id)

    Monedas save(Monedas monedas)

}