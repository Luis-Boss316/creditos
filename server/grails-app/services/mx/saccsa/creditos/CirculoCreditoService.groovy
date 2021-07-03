package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(CirculoCredito)
interface CirculoCreditoService {

    CirculoCredito get(Serializable id)

    List<CirculoCredito> list(Map args)

    Long count()

    void delete(Serializable id)

    CirculoCredito save(CirculoCredito circuloCredito)

}