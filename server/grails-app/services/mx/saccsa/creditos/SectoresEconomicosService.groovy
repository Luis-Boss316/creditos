package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(SectoresEconomicos)
interface SectoresEconomicosService {

    SectoresEconomicos get(Serializable id)

    List<SectoresEconomicos> list(Map args)

    Long count()

    void delete(Serializable id)

    SectoresEconomicos save(SectoresEconomicos sectoresEconomicos)

}