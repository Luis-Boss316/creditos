package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CreditoSimpleServiceSpec extends Specification {

    CreditoSimpleService creditoSimpleService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CreditoSimple(...).save(flush: true, failOnError: true)
        //new CreditoSimple(...).save(flush: true, failOnError: true)
        //CreditoSimple creditoSimple = new CreditoSimple(...).save(flush: true, failOnError: true)
        //new CreditoSimple(...).save(flush: true, failOnError: true)
        //new CreditoSimple(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //creditoSimple.id
    }

    void "test get"() {
        setupData()

        expect:
        creditoSimpleService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CreditoSimple> creditoSimpleList = creditoSimpleService.list(max: 2, offset: 2)

        then:
        creditoSimpleList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        creditoSimpleService.count() == 5
    }

    void "test delete"() {
        Long creditoSimpleId = setupData()

        expect:
        creditoSimpleService.count() == 5

        when:
        creditoSimpleService.delete(creditoSimpleId)
        sessionFactory.currentSession.flush()

        then:
        creditoSimpleService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CreditoSimple creditoSimple = new CreditoSimple()
        creditoSimpleService.save(creditoSimple)

        then:
        creditoSimple.id != null
    }
}
