package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class OcupacionesServiceSpec extends Specification {

    OcupacionesService ocupacionesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Ocupaciones(...).save(flush: true, failOnError: true)
        //new Ocupaciones(...).save(flush: true, failOnError: true)
        //Ocupaciones ocupaciones = new Ocupaciones(...).save(flush: true, failOnError: true)
        //new Ocupaciones(...).save(flush: true, failOnError: true)
        //new Ocupaciones(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //ocupaciones.id
    }

    void "test get"() {
        setupData()

        expect:
        ocupacionesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Ocupaciones> ocupacionesList = ocupacionesService.list(max: 2, offset: 2)

        then:
        ocupacionesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        ocupacionesService.count() == 5
    }

    void "test delete"() {
        Long ocupacionesId = setupData()

        expect:
        ocupacionesService.count() == 5

        when:
        ocupacionesService.delete(ocupacionesId)
        sessionFactory.currentSession.flush()

        then:
        ocupacionesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Ocupaciones ocupaciones = new Ocupaciones()
        ocupacionesService.save(ocupaciones)

        then:
        ocupaciones.id != null
    }
}
