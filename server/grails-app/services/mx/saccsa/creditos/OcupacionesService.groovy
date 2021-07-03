package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Ocupaciones)
interface OcupacionesService {

    Ocupaciones get(Serializable id)

    List<Ocupaciones> list(Map args)

    Long count()

    void delete(Serializable id)

    Ocupaciones save(Ocupaciones ocupaciones)

}