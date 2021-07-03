package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposPropiedad)
interface TiposPropiedadService {

    TiposPropiedad get(Serializable id)

    List<TiposPropiedad> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposPropiedad save(TiposPropiedad tiposPropiedad)

}