package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(SectoresBanxico)
interface SectoresBanxicoService {

    SectoresBanxico get(Serializable id)

    List<SectoresBanxico> list(Map args)

    Long count()

    void delete(Serializable id)

    SectoresBanxico save(SectoresBanxico sectoresBanxico)

}