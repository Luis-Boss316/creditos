package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ParametrosProductos)
interface ParametrosProductosService {

    ParametrosProductos get(Serializable id)

    List<ParametrosProductos> list(Map args)

    Long count()

    void delete(Serializable id)

    ParametrosProductos save(ParametrosProductos parametrosProductos)

}