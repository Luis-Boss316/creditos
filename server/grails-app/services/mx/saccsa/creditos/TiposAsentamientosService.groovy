package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposAsentamientos)
interface TiposAsentamientosService {

    TiposAsentamientos get(Serializable id)

    List<TiposAsentamientos> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposAsentamientos save(TiposAsentamientos tiposAsentamientos)

}