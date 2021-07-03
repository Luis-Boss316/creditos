package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Profesiones)
interface ProfesionesService {

    Profesiones get(Serializable id)

    List<Profesiones> list(Map args)

    Long count()

    void delete(Serializable id)

    Profesiones save(Profesiones profesiones)

}