package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(DatosGeneralesPersonas)
interface PersonasService {

    DatosGeneralesPersonas get(Serializable id)

    List<DatosGeneralesPersonas> list(Map args)

    Long count()

    void delete(Serializable id)

    DatosGeneralesPersonas save(DatosGeneralesPersonas personas)

}
