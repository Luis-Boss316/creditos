package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CiudadesServiceSpec extends Specification {

    CiudadesService ciudadesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Ciudades(...).save(flush: true, failOnError: true)
        //new Ciudades(...).save(flush: true, failOnError: true)
        //Ciudades ciudades = new Ciudades(...).save(flush: true, failOnError: true)
        //new Ciudades(...).save(flush: true, failOnError: true)
        //new Ciudades(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //ciudades.id
    }

    void "test get"() {
        setupData()

        expect:
        ciudadesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Ciudades> ciudadesList = ciudadesService.list(max: 2, offset: 2)

        then:
        ciudadesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        ciudadesService.count() == 5
    }

    void "test delete"() {
        Long ciudadesId = setupData()

        expect:
        ciudadesService.count() == 5

        when:
        ciudadesService.delete(ciudadesId)
        sessionFactory.currentSession.flush()

        then:
        ciudadesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Ciudades ciudades = new Ciudades()
        ciudadesService.save(ciudades)

        then:
        ciudades.id != null
    }
}
