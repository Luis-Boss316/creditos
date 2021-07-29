package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PropietarioRealServiceSpec extends Specification {

    PropietarioRealService propietarioRealService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new PropietarioReal(...).save(flush: true, failOnError: true)
        //new PropietarioReal(...).save(flush: true, failOnError: true)
        //PropietarioReal propietarioReal = new PropietarioReal(...).save(flush: true, failOnError: true)
        //new PropietarioReal(...).save(flush: true, failOnError: true)
        //new PropietarioReal(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //propietarioReal.id
    }

    void "test get"() {
        setupData()

        expect:
        propietarioRealService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<PropietarioReal> propietarioRealList = propietarioRealService.list(max: 2, offset: 2)

        then:
        propietarioRealList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        propietarioRealService.count() == 5
    }

    void "test delete"() {
        Long propietarioRealId = setupData()

        expect:
        propietarioRealService.count() == 5

        when:
        propietarioRealService.delete(propietarioRealId)
        sessionFactory.currentSession.flush()

        then:
        propietarioRealService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        PropietarioReal propietarioReal = new PropietarioReal()
        propietarioRealService.save(propietarioReal)

        then:
        propietarioReal.id != null
    }
}
