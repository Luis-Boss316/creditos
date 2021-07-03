package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposIdentificacionesServiceSpec extends Specification {

    TiposIdentificacionesService tiposIdentificacionesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposIdentificaciones(...).save(flush: true, failOnError: true)
        //new TiposIdentificaciones(...).save(flush: true, failOnError: true)
        //TiposIdentificaciones tiposIdentificaciones = new TiposIdentificaciones(...).save(flush: true, failOnError: true)
        //new TiposIdentificaciones(...).save(flush: true, failOnError: true)
        //new TiposIdentificaciones(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposIdentificaciones.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposIdentificacionesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposIdentificaciones> tiposIdentificacionesList = tiposIdentificacionesService.list(max: 2, offset: 2)

        then:
        tiposIdentificacionesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposIdentificacionesService.count() == 5
    }

    void "test delete"() {
        Long tiposIdentificacionesId = setupData()

        expect:
        tiposIdentificacionesService.count() == 5

        when:
        tiposIdentificacionesService.delete(tiposIdentificacionesId)
        sessionFactory.currentSession.flush()

        then:
        tiposIdentificacionesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposIdentificaciones tiposIdentificaciones = new TiposIdentificaciones()
        tiposIdentificacionesService.save(tiposIdentificaciones)

        then:
        tiposIdentificaciones.id != null
    }
}
