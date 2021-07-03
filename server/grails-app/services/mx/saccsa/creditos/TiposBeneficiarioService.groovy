package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(TiposBeneficiario)
interface TiposBeneficiarioService {

    TiposBeneficiario get(Serializable id)

    List<TiposBeneficiario> list(Map args)

    Long count()

    void delete(Serializable id)

    TiposBeneficiario save(TiposBeneficiario tiposBeneficiario)

}