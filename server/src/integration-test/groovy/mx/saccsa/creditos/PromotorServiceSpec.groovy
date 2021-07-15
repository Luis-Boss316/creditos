package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PromotorServiceSpec extends Specification {

    PromotorService promotorService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Promotor(...).save(flush: true, failOnError: true)
        //new Promotor(...).save(flush: true, failOnError: true)
        //Promotor promotor = new Promotor(...).save(flush: true, failOnError: true)
        //new Promotor(...).save(flush: true, failOnError: true)
        //new Promotor(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //promotor.id
    }

    void "test get"() {
        setupData()

        expect:
        promotorService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Promotor> promotorList = promotorService.list(max: 2, offset: 2)

        then:
        promotorList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        promotorService.count() == 5
    }

    void "test delete"() {
        Long promotorId = setupData()

        expect:
        promotorService.count() == 5

        when:
        promotorService.delete(promotorId)
        sessionFactory.currentSession.flush()

        then:
        promotorService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Promotor promotor = new Promotor()
        promotorService.save(promotor)

        then:
        promotor.id != null
    }
}
