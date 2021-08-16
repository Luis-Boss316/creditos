package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(DatosBancarios)
interface DatosBancariosService {

    DatosBancarios get(Serializable id)

    List<DatosBancarios> list(Map args)

    Long count()

    void delete(Serializable id)

    DatosBancarios save(DatosBancarios datosBancarios)

}