package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Periodicidades)
interface PeriodicidadesService {

    Periodicidades get(Serializable id)

    List<Periodicidades> list(Map args)

    Long count()

    void delete(Serializable id)

    Periodicidades save(Periodicidades periodicidades)

}