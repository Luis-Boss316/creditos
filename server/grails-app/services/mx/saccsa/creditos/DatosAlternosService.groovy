package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(DatosAlternos)
interface DatosAlternosService {

    DatosAlternos get(Serializable id)

    List<DatosAlternos> list(Map args)

    Long count()

    void delete(Serializable id)

    DatosAlternos save(DatosAlternos datosAlternos)

}