package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TipoCliente)
interface TipoClienteService {

    TipoCliente get(Serializable id)

    List<TipoCliente> list(Map args)

    Long count()

    void delete(Serializable id)

    TipoCliente save(TipoCliente tipoCliente)

}