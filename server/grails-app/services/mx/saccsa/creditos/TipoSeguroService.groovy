package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TipoSeguro)
interface TipoSeguroService {

    TipoSeguro get(Serializable id)

    List<TipoSeguro> list(Map args)

    Long count()

    void delete(Serializable id)

    TipoSeguro save(TipoSeguro tipoSeguro)

}