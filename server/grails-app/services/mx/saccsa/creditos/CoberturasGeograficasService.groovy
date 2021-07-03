package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(CoberturasGeograficas)
interface CoberturasGeograficasService {

    CoberturasGeograficas get(Serializable id)

    List<CoberturasGeograficas> list(Map args)

    Long count()

    void delete(Serializable id)

    CoberturasGeograficas save(CoberturasGeograficas coberturasGeograficas)

}