package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(EstadoCivil)
interface EstadoCivilService {

    EstadoCivil get(Serializable id)

    List<EstadoCivil> list(Map args)

    Long count()

    void delete(Serializable id)

    EstadoCivil save(EstadoCivil estadoCivil)

}