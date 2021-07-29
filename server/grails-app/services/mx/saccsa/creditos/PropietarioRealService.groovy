package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(PropietarioReal)
interface PropietarioRealService {

    PropietarioReal get(Serializable id)

    List<PropietarioReal> list(Map args)

    Long count()

    void delete(Serializable id)

    PropietarioReal save(PropietarioReal propietarioReal)

}