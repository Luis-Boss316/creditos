package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Municipios)
interface MunicipiosService {

    Municipios get(Serializable id)

    List<Municipios> list(Map args)

    Long count()

    void delete(Serializable id)

    Municipios save(Municipios municipios)

}