package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposGarantia)
interface TiposGarantiaService {

    TiposGarantia get(Serializable id)

    List<TiposGarantia> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposGarantia save(TiposGarantia tiposGarantia)

}