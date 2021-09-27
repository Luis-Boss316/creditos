package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(InformacionPLD)
interface InformacionPLDService {

    InformacionPLD get(Serializable id)

    List<InformacionPLD> list(Map args)

    Long count()

    void delete(Serializable id)

    InformacionPLD save(InformacionPLD informacionPLD)

}