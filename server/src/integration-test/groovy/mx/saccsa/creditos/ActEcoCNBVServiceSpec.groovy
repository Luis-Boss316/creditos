package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ActEcoCNBVServiceSpec extends Specification {

    ActEcoCNBVService actEcoCNBVService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ActEcoCNBV(...).save(flush: true, failOnError: true)
        //new ActEcoCNBV(...).save(flush: true, failOnError: true)
        //ActEcoCNBV actEcoCNBV = new ActEcoCNBV(...).save(flush: true, failOnError: true)
        //new ActEcoCNBV(...).save(flush: true, failOnError: true)
        //new ActEcoCNBV(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //actEcoCNBV.id
    }

    void "test get"() {
        setupData()

        expect:
        actEcoCNBVService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ActEcoCNBV> actEcoCNBVList = actEcoCNBVService.list(max: 2, offset: 2)

        then:
        actEcoCNBVList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        actEcoCNBVService.count() == 5
    }

    void "test delete"() {
        Long actEcoCNBVId = setupData()

        expect:
        actEcoCNBVService.count() == 5

        when:
        actEcoCNBVService.delete(actEcoCNBVId)
        sessionFactory.currentSession.flush()

        then:
        actEcoCNBVService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ActEcoCNBV actEcoCNBV = new ActEcoCNBV()
        actEcoCNBVService.save(actEcoCNBV)

        then:
        actEcoCNBV.id != null
    }
}
