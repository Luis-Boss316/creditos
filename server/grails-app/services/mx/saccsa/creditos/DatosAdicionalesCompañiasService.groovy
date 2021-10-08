package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(DatosAdicionalesCompañias)
interface DatosAdicionalesCompañiasService {

    DatosAdicionalesCompañias get(Serializable id)

    List<DatosAdicionalesCompañias> list(Map args)

    Long count()

    void delete(Serializable id)

    DatosAdicionalesCompañias save(DatosAdicionalesCompañias datosAdicionalesCompañias)

}