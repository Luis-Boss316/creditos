package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(InstitucionesYContrapartes)
interface InstitucionesYContrapartesService {

    InstitucionesYContrapartes get(Serializable id)

    List<InstitucionesYContrapartes> list(Map args)

    Long count()

    void delete(Serializable id)

    InstitucionesYContrapartes save(InstitucionesYContrapartes institucionesYContrapartes)

}