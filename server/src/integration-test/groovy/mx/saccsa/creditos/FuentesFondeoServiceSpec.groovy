package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class FuentesFondeoServiceSpec extends Specification {

    FuentesFondeoService fuentesFondeoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new FuentesFondeo(...).save(flush: true, failOnError: true)
        //new FuentesFondeo(...).save(flush: true, failOnError: true)
        //FuentesFondeo fuentesFondeo = new FuentesFondeo(...).save(flush: true, failOnError: true)
        //new FuentesFondeo(...).save(flush: true, failOnError: true)
        //new FuentesFondeo(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //fuentesFondeo.id
    }

    void "test get"() {
        setupData()

        expect:
        fuentesFondeoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<FuentesFondeo> fuentesFondeoList = fuentesFondeoService.list(max: 2, offset: 2)

        then:
        fuentesFondeoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        fuentesFondeoService.count() == 5
    }

    void "test delete"() {
        Long fuentesFondeoId = setupData()

        expect:
        fuentesFondeoService.count() == 5

        when:
        fuentesFondeoService.delete(fuentesFondeoId)
        sessionFactory.currentSession.flush()

        then:
        fuentesFondeoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        FuentesFondeo fuentesFondeo = new FuentesFondeo()
        fuentesFondeoService.save(fuentesFondeo)

        then:
        fuentesFondeo.id != null
    }
}
