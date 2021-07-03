package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(FuentesFondeo)
interface FuentesFondeoService {

    FuentesFondeo get(Serializable id)

    List<FuentesFondeo> list(Map args)

    Long count()

    void delete(Serializable id)

    FuentesFondeo save(FuentesFondeo fuentesFondeo)

}