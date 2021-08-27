package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Empleados)
interface EmpleadosService {

    Empleados get(Serializable id)

    List<Empleados> list(Map args)

    Long count()

    void delete(Serializable id)

    Empleados save(Empleados empleados)

}