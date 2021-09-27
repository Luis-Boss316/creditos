package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Beneficiarios)
interface BeneficiariosService {

    Beneficiarios get(Serializable id)

    List<Beneficiarios> list(Map args)

    Long count()

    void delete(Serializable id)

    Beneficiarios save(Beneficiarios beneficiarios)

}