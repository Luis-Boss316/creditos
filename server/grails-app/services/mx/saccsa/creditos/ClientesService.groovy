package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Clientes)
interface ClientesService {

    Clientes get(Serializable id)

    List<Clientes> list(Map args)

    Long count()

    void delete(Serializable id)

    Clientes save(Clientes clientes)

}