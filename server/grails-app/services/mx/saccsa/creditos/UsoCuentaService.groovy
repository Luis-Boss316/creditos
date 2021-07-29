package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(UsoCuenta)
interface UsoCuentaService {

    UsoCuenta get(Serializable id)

    List<UsoCuenta> list(Map args)

    Long count()

    void delete(Serializable id)

    UsoCuenta save(UsoCuenta usoCuenta)

}