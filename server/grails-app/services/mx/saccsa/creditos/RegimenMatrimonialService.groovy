package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(RegimenMatrimonial)
interface RegimenMatrimonialService {

    RegimenMatrimonial get(Serializable id)

    List<RegimenMatrimonial> list(Map args)

    Long count()

    void delete(Serializable id)

    RegimenMatrimonial save(RegimenMatrimonial regimenMatrimonial)

}