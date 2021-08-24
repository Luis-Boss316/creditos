package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(CuentasBancariasNegocios)
interface CuentasBancariasNegociosService {

    CuentasBancariasNegocios get(Serializable id)

    List<CuentasBancariasNegocios> list(Map args)

    Long count()

    void delete(Serializable id)

    CuentasBancariasNegocios save(CuentasBancariasNegocios cuentasBancariasNegocios)

}