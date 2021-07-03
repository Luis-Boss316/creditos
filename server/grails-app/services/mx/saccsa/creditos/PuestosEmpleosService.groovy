package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(PuestosEmpleos)
interface PuestosEmpleosService {

    PuestosEmpleos get(Serializable id)

    List<PuestosEmpleos> list(Map args)

    Long count()

    void delete(Serializable id)

    PuestosEmpleos save(PuestosEmpleos puestosEmpleos)

}