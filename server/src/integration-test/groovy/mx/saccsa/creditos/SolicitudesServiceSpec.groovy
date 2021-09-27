package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SolicitudesServiceSpec extends Specification {

    SolicitudesService solicitudesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Solicitudes(...).save(flush: true, failOnError: true)
        //new Solicitudes(...).save(flush: true, failOnError: true)
        //Solicitudes solicitudes = new Solicitudes(...).save(flush: true, failOnError: true)
        //new Solicitudes(...).save(flush: true, failOnError: true)
        //new Solicitudes(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //solicitudes.id
    }

    void "test get"() {
        setupData()

        expect:
        solicitudesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Solicitudes> solicitudesList = solicitudesService.list(max: 2, offset: 2)

        then:
        solicitudesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        solicitudesService.count() == 5
    }

    void "test delete"() {
        Long solicitudesId = setupData()

        expect:
        solicitudesService.count() == 5

        when:
        solicitudesService.delete(solicitudesId)
        sessionFactory.currentSession.flush()

        then:
        solicitudesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Solicitudes solicitudes = new Solicitudes()
        solicitudesService.save(solicitudes)

        then:
        solicitudes.id != null
    }
}
