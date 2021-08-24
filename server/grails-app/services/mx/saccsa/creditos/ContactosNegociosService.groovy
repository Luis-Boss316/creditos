package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ContactosNegocios)
interface ContactosNegociosService {

    ContactosNegocios get(Serializable id)

    List<ContactosNegocios> list(Map args)

    Long count()

    void delete(Serializable id)

    ContactosNegocios save(ContactosNegocios contactosNegocios)

}