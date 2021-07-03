package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Paises)
interface PaisesService {

    Paises get(Serializable id)

    List<Paises> list(Map args)

    Long count()

    void delete(Serializable id)

    Paises save(Paises paises)

}