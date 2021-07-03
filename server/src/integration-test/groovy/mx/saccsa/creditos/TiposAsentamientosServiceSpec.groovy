package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposAsentamientosServiceSpec extends Specification {

    TiposAsentamientosService tiposAsentamientosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposAsentamientos(...).save(flush: true, failOnError: true)
        //new TiposAsentamientos(...).save(flush: true, failOnError: true)
        //TiposAsentamientos tiposAsentamientos = new TiposAsentamientos(...).save(flush: true, failOnError: true)
        //new TiposAsentamientos(...).save(flush: true, failOnError: true)
        //new TiposAsentamientos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposAsentamientos.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposAsentamientosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposAsentamientos> tiposAsentamientosList = tiposAsentamientosService.list(max: 2, offset: 2)

        then:
        tiposAsentamientosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposAsentamientosService.count() == 5
    }

    void "test delete"() {
        Long tiposAsentamientosId = setupData()

        expect:
        tiposAsentamientosService.count() == 5

        when:
        tiposAsentamientosService.delete(tiposAsentamientosId)
        sessionFactory.currentSession.flush()

        then:
        tiposAsentamientosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposAsentamientos tiposAsentamientos = new TiposAsentamientos()
        tiposAsentamientosService.save(tiposAsentamientos)

        then:
        tiposAsentamientos.id != null
    }
}
