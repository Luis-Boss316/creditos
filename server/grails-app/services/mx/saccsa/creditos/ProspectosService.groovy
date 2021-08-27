package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(Prospectos)
interface ProspectosService {

    Prospectos get(Serializable id)

    List<Prospectos> list(Map args)

    Long count()

    void delete(Serializable id)

    Prospectos save(Prospectos prospectos)

}