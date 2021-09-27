package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DenominacionesServiceSpec extends Specification {

    DenominacionesService denominacionesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Denominaciones(...).save(flush: true, failOnError: true)
        //new Denominaciones(...).save(flush: true, failOnError: true)
        //Denominaciones denominaciones = new Denominaciones(...).save(flush: true, failOnError: true)
        //new Denominaciones(...).save(flush: true, failOnError: true)
        //new Denominaciones(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //denominaciones.id
    }

    void "test get"() {
        setupData()

        expect:
        denominacionesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Denominaciones> denominacionesList = denominacionesService.list(max: 2, offset: 2)

        then:
        denominacionesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        denominacionesService.count() == 5
    }

    void "test delete"() {
        Long denominacionesId = setupData()

        expect:
        denominacionesService.count() == 5

        when:
        denominacionesService.delete(denominacionesId)
        sessionFactory.currentSession.flush()

        then:
        denominacionesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Denominaciones denominaciones = new Denominaciones()
        denominacionesService.save(denominaciones)

        then:
        denominaciones.id != null
    }
}
