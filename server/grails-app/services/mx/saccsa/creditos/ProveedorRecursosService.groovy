package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ProveedorRecursos)
interface ProveedorRecursosService {

    ProveedorRecursos get(Serializable id)

    List<ProveedorRecursos> list(Map args)

    Long count()

    void delete(Serializable id)

    ProveedorRecursos save(ProveedorRecursos proveedorRecursos)

}