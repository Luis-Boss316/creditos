package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(DestinosCredito)
interface DestinosCreditoService {

    DestinosCredito get(Serializable id)

    List<DestinosCredito> list(Map args)

    Long count()

    void delete(Serializable id)

    DestinosCredito save(DestinosCredito destinosCredito)

}