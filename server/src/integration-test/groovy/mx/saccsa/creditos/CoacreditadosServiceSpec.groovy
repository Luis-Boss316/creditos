package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CoacreditadosServiceSpec extends Specification {

    CoacreditadosService coacreditadosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Coacreditados(...).save(flush: true, failOnError: true)
        //new Coacreditados(...).save(flush: true, failOnError: true)
        //Coacreditados coacreditados = new Coacreditados(...).save(flush: true, failOnError: true)
        //new Coacreditados(...).save(flush: true, failOnError: true)
        //new Coacreditados(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //coacreditados.id
    }

    void "test get"() {
        setupData()

        expect:
        coacreditadosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Coacreditados> coacreditadosList = coacreditadosService.list(max: 2, offset: 2)

        then:
        coacreditadosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        coacreditadosService.count() == 5
    }

    void "test delete"() {
        Long coacreditadosId = setupData()

        expect:
        coacreditadosService.count() == 5

        when:
        coacreditadosService.delete(coacreditadosId)
        sessionFactory.currentSession.flush()

        then:
        coacreditadosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Coacreditados coacreditados = new Coacreditados()
        coacreditadosService.save(coacreditados)

        then:
        coacreditados.id != null
    }
}
