package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TipoPersona)
interface TipoPersonaService {

    TipoPersona get(Serializable id)

    List<TipoPersona> list(Map args)

    Long count()

    void delete(Serializable id)

    TipoPersona save(TipoPersona tipoPersona)

}