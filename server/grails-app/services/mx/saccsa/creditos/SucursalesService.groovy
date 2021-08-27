package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Sucursales)
interface SucursalesService {

    Sucursales get(Serializable id)

    List<Sucursales> list(Map args)

    Long count()

    void delete(Serializable id)

    Sucursales save(Sucursales sucursales)

}