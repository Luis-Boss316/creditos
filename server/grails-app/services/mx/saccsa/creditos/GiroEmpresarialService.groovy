package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(GiroEmpresarial)
interface GiroEmpresarialService {

    GiroEmpresarial get(Serializable id)

    List<GiroEmpresarial> list(Map args)

    Long count()

    void delete(Serializable id)

    GiroEmpresarial save(GiroEmpresarial giroEmpresarial)

}