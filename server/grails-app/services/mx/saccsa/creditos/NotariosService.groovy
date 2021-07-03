package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Notarios)
interface NotariosService {

    Notarios get(Serializable id)

    List<Notarios> list(Map args)

    Long count()

    void delete(Serializable id)

    Notarios save(Notarios notarios)

}