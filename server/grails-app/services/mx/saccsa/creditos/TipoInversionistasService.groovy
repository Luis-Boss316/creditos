package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TipoInversionistas)
interface TipoInversionistasService {

    TipoInversionistas get(Serializable id)

    List<TipoInversionistas> list(Map args)

    Long count()

    void delete(Serializable id)

    TipoInversionistas save(TipoInversionistas tipoInversionistas)

}