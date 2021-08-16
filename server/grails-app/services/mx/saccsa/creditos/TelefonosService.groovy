package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Telefonos)
interface TelefonosService {

    Telefonos get(Serializable id)

    List<Telefonos> list(Map args)

    Long count()

    void delete(Serializable id)

    Telefonos save(Telefonos telefonos)

}