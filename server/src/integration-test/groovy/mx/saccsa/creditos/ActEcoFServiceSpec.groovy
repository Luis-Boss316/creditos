package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ActEcoFServiceSpec extends Specification {

    ActEcoFService actEcoFService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ActEcoF(...).save(flush: true, failOnError: true)
        //new ActEcoF(...).save(flush: true, failOnError: true)
        //ActEcoF actEcoF = new ActEcoF(...).save(flush: true, failOnError: true)
        //new ActEcoF(...).save(flush: true, failOnError: true)
        //new ActEcoF(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //actEcoF.id
    }

    void "test get"() {
        setupData()

        expect:
        actEcoFService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ActEcoF> actEcoFList = actEcoFService.list(max: 2, offset: 2)

        then:
        actEcoFList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        actEcoFService.count() == 5
    }

    void "test delete"() {
        Long actEcoFId = setupData()

        expect:
        actEcoFService.count() == 5

        when:
        actEcoFService.delete(actEcoFId)
        sessionFactory.currentSession.flush()

        then:
        actEcoFService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ActEcoF actEcoF = new ActEcoF()
        actEcoFService.save(actEcoF)

        then:
        actEcoF.id != null
    }
}
