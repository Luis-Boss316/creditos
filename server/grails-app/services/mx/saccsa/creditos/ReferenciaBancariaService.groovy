package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ReferenciaBancaria)
interface ReferenciaBancariaService {

    ReferenciaBancaria get(Serializable id)

    List<ReferenciaBancaria> list(Map args)

    Long count()

    void delete(Serializable id)

    ReferenciaBancaria save(ReferenciaBancaria referenciaBancaria)

}