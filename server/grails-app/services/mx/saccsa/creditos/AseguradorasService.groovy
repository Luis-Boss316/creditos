package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Aseguradoras)
interface AseguradorasService {

    Aseguradoras get(Serializable id)

    List<Aseguradoras> list(Map args)

    Long count()

    void delete(Serializable id)

    Aseguradoras save(Aseguradoras aseguradoras)

}