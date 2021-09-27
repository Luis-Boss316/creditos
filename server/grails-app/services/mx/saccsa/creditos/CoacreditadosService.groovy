package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Coacreditados)
interface CoacreditadosService {

    Coacreditados get(Serializable id)

    List<Coacreditados> list(Map args)

    Long count()

    void delete(Serializable id)

    Coacreditados save(Coacreditados coacreditados)

}