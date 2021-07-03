package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(LocalidadesBANXICO)
interface LocalidadesBANXICOService {

    LocalidadesBANXICO get(Serializable id)

    List<LocalidadesBANXICO> list(Map args)

    Long count()

    void delete(Serializable id)

    LocalidadesBANXICO save(LocalidadesBANXICO localidadesBANXICO)

}