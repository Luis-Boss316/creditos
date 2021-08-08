package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class NegociosServiceSpec extends Specification {

    NegociosService negociosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Negocios(...).save(flush: true, failOnError: true)
        //new Negocios(...).save(flush: true, failOnError: true)
        //Negocios negocios = new Negocios(...).save(flush: true, failOnError: true)
        //new Negocios(...).save(flush: true, failOnError: true)
        //new Negocios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //negocios.id
    }

    void "test get"() {
        setupData()

        expect:
        negociosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Negocios> negociosList = negociosService.list(max: 2, offset: 2)

        then:
        negociosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        negociosService.count() == 5
    }

    void "test delete"() {
        Long negociosId = setupData()

        expect:
        negociosService.count() == 5

        when:
        negociosService.delete(negociosId)
        sessionFactory.currentSession.flush()

        then:
        negociosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Negocios negocios = new Negocios()
        negociosService.save(negocios)

        then:
        negocios.id != null
    }
}
