package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposDomicilios)
interface TiposDomiciliosService {

    TiposDomicilios get(Serializable id)

    List<TiposDomicilios> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposDomicilios save(TiposDomicilios tiposDomicilios)

}