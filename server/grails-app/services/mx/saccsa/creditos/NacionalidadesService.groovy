package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Nacionalidades)
interface NacionalidadesService {

    Nacionalidades get(Serializable id)

    List<Nacionalidades> list(Map args)

    Long count()

    void delete(Serializable id)

    Nacionalidades save(Nacionalidades nacionalidades)

}