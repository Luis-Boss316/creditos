package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TitularServiceSpec extends Specification {

    TitularService titularService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Titular(...).save(flush: true, failOnError: true)
        //new Titular(...).save(flush: true, failOnError: true)
        //Titular titular = new Titular(...).save(flush: true, failOnError: true)
        //new Titular(...).save(flush: true, failOnError: true)
        //new Titular(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //titular.id
    }

    void "test get"() {
        setupData()

        expect:
        titularService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Titular> titularList = titularService.list(max: 2, offset: 2)

        then:
        titularList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        titularService.count() == 5
    }

    void "test delete"() {
        Long titularId = setupData()

        expect:
        titularService.count() == 5

        when:
        titularService.delete(titularId)
        sessionFactory.currentSession.flush()

        then:
        titularService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Titular titular = new Titular()
        titularService.save(titular)

        then:
        titular.id != null
    }
}
