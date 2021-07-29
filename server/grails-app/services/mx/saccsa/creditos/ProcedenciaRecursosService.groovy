package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ProcedenciaRecursos)
interface ProcedenciaRecursosService {

    ProcedenciaRecursos get(Serializable id)

    List<ProcedenciaRecursos> list(Map args)

    Long count()

    void delete(Serializable id)

    ProcedenciaRecursos save(ProcedenciaRecursos procedenciaRecursos)

}