package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposReferencias)
interface TiposReferenciasService {

    TiposReferencias get(Serializable id)

    List<TiposReferencias> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposReferencias save(TiposReferencias tiposReferencias)

}