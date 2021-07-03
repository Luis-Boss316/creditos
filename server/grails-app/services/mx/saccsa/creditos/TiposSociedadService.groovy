package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposSociedad)
interface TiposSociedadService {

    TiposSociedad get(Serializable id)

    List<TiposSociedad> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposSociedad save(TiposSociedad tiposSociedad)

}