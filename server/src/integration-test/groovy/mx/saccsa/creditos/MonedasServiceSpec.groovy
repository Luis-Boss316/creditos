package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class MonedasServiceSpec extends Specification {

    MonedasService monedasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Monedas(...).save(flush: true, failOnError: true)
        //new Monedas(...).save(flush: true, failOnError: true)
        //Monedas monedas = new Monedas(...).save(flush: true, failOnError: true)
        //new Monedas(...).save(flush: true, failOnError: true)
        //new Monedas(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //monedas.id
    }

    void "test get"() {
        setupData()

        expect:
        monedasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Monedas> monedasList = monedasService.list(max: 2, offset: 2)

        then:
        monedasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        monedasService.count() == 5
    }

    void "test delete"() {
        Long monedasId = setupData()

        expect:
        monedasService.count() == 5

        when:
        monedasService.delete(monedasId)
        sessionFactory.currentSession.flush()

        then:
        monedasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Monedas monedas = new Monedas()
        monedasService.save(monedas)

        then:
        monedas.id != null
    }
}
