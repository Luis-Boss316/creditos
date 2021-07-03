package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TipoImpuestos)
interface TipoImpuestosService {

    TipoImpuestos get(Serializable id)

    List<TipoImpuestos> list(Map args)

    Long count()

    void delete(Serializable id)

    TipoImpuestos save(TipoImpuestos tipoImpuestos)

}