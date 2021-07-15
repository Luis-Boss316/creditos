package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ActVulnerable)
interface ActVulnerableService {

    ActVulnerable get(Serializable id)

    List<ActVulnerable> list(Map args)

    Long count()

    void delete(Serializable id)

    ActVulnerable save(ActVulnerable actVulnerable)

}