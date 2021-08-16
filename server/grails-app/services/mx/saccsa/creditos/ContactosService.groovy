package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Contactos)
interface ContactosService {

    Contactos get(Serializable id)

    List<Contactos> list(Map args)

    Long count()

    void delete(Serializable id)

    Contactos save(Contactos contactos)

}