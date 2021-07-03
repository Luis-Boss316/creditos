package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposCredito)
interface TiposCreditoService {

    TiposCredito get(Serializable id)

    List<TiposCredito> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposCredito save(TiposCredito tiposCredito)

}