package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(DatosGeneralesNegocios)
interface NegociosService {

    DatosGeneralesNegocios get(Serializable id)

    List<DatosGeneralesNegocios> list(Map args)

    Long count()

    void delete(Serializable id)

    DatosGeneralesNegocios save(DatosGeneralesNegocios negocios)

}
