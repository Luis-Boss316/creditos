package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ClavesLadaServiceSpec extends Specification {

    ClavesLadaService clavesLadaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ClavesLada(...).save(flush: true, failOnError: true)
        //new ClavesLada(...).save(flush: true, failOnError: true)
        //ClavesLada clavesLada = new ClavesLada(...).save(flush: true, failOnError: true)
        //new ClavesLada(...).save(flush: true, failOnError: true)
        //new ClavesLada(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //clavesLada.id
    }

    void "test get"() {
        setupData()

        expect:
        clavesLadaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ClavesLada> clavesLadaList = clavesLadaService.list(max: 2, offset: 2)

        then:
        clavesLadaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        clavesLadaService.count() == 5
    }

    void "test delete"() {
        Long clavesLadaId = setupData()

        expect:
        clavesLadaService.count() == 5

        when:
        clavesLadaService.delete(clavesLadaId)
        sessionFactory.currentSession.flush()

        then:
        clavesLadaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ClavesLada clavesLada = new ClavesLada()
        clavesLadaService.save(clavesLada)

        then:
        clavesLada.id != null
    }
}
