package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Kyc)
interface KycService {

    Kyc get(Serializable id)

    List<Kyc> list(Map args)

    Long count()

    void delete(Serializable id)

    Kyc save(Kyc kyc)

}