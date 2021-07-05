package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(GrupoFamilia)
interface GrupoFamiliaService {

    GrupoFamilia get(Serializable id)

    List<GrupoFamilia> list(Map args)

    Long count()

    void delete(Serializable id)

    GrupoFamilia save(GrupoFamilia grupoFamilia)

}