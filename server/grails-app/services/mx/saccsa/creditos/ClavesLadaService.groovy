package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ClavesLada)
interface ClavesLadaService {

    ClavesLada get(Serializable id)

    List<ClavesLada> list(Map args)

    Long count()

    void delete(Serializable id)

    ClavesLada save(ClavesLada clavesLada)

}