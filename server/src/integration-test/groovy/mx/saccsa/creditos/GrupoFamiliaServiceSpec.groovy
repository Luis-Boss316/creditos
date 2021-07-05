package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class GrupoFamiliaServiceSpec extends Specification {

    GrupoFamiliaService grupoFamiliaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new GrupoFamilia(...).save(flush: true, failOnError: true)
        //new GrupoFamilia(...).save(flush: true, failOnError: true)
        //GrupoFamilia grupoFamilia = new GrupoFamilia(...).save(flush: true, failOnError: true)
        //new GrupoFamilia(...).save(flush: true, failOnError: true)
        //new GrupoFamilia(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //grupoFamilia.id
    }

    void "test get"() {
        setupData()

        expect:
        grupoFamiliaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<GrupoFamilia> grupoFamiliaList = grupoFamiliaService.list(max: 2, offset: 2)

        then:
        grupoFamiliaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        grupoFamiliaService.count() == 5
    }

    void "test delete"() {
        Long grupoFamiliaId = setupData()

        expect:
        grupoFamiliaService.count() == 5

        when:
        grupoFamiliaService.delete(grupoFamiliaId)
        sessionFactory.currentSession.flush()

        then:
        grupoFamiliaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        GrupoFamilia grupoFamilia = new GrupoFamilia()
        grupoFamiliaService.save(grupoFamilia)

        then:
        grupoFamilia.id != null
    }
}
