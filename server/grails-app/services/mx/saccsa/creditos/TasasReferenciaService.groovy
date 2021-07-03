package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TasasReferencia)
interface TasasReferenciaService {

    TasasReferencia get(Serializable id)

    List<TasasReferencia> list(Map args)

    Long count()

    void delete(Serializable id)

    TasasReferencia save(TasasReferencia tasasReferencia)

}