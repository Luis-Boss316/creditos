package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CotitularServiceSpec extends Specification {

    CotitularService cotitularService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Cotitular(...).save(flush: true, failOnError: true)
        //new Cotitular(...).save(flush: true, failOnError: true)
        //Cotitular cotitular = new Cotitular(...).save(flush: true, failOnError: true)
        //new Cotitular(...).save(flush: true, failOnError: true)
        //new Cotitular(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //cotitular.id
    }

    void "test get"() {
        setupData()

        expect:
        cotitularService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Cotitular> cotitularList = cotitularService.list(max: 2, offset: 2)

        then:
        cotitularList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        cotitularService.count() == 5
    }

    void "test delete"() {
        Long cotitularId = setupData()

        expect:
        cotitularService.count() == 5

        when:
        cotitularService.delete(cotitularId)
        sessionFactory.currentSession.flush()

        then:
        cotitularService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Cotitular cotitular = new Cotitular()
        cotitularService.save(cotitular)

        then:
        cotitular.id != null
    }
}
