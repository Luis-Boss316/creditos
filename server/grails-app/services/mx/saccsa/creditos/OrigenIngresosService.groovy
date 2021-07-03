package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(OrigenIngresos)
interface OrigenIngresosService {

    OrigenIngresos get(Serializable id)

    List<OrigenIngresos> list(Map args)

    Long count()

    void delete(Serializable id)

    OrigenIngresos save(OrigenIngresos origenIngresos)

}