package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Avales)
interface AvalesService {

    Avales get(Serializable id)

    List<Avales> list(Map args)

    Long count()

    void delete(Serializable id)

    Avales save(Avales avales)

}