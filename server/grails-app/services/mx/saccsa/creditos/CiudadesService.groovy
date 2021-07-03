package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Ciudades)
interface CiudadesService {

    Ciudades get(Serializable id)

    List<Ciudades> list(Map args)

    Long count()

    void delete(Serializable id)

    Ciudades save(Ciudades ciudades)

}