package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ModoContacto)
interface ModoContactoService {

    ModoContacto get(Serializable id)

    List<ModoContacto> list(Map args)

    Long count()

    void delete(Serializable id)

    ModoContacto save(ModoContacto modoContacto)

}