package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposEmpleos)
interface TiposEmpleosService {

    TiposEmpleos get(Serializable id)

    List<TiposEmpleos> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposEmpleos save(TiposEmpleos tiposEmpleos)

}