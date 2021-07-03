package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ValoresTasasReferencia)
interface ValoresTasasReferenciaService {

    ValoresTasasReferencia get(Serializable id)

    List<ValoresTasasReferencia> list(Map args)

    Long count()

    void delete(Serializable id)

    ValoresTasasReferencia save(ValoresTasasReferencia valoresTasasReferencia)

}