package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Solicitudes)
interface SolicitudesService {

    Solicitudes get(Serializable id)

    List<Solicitudes> list(Map args)

    Long count()

    void delete(Serializable id)

    Solicitudes save(Solicitudes solicitudes)

}