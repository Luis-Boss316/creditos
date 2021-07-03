package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposEmpleosServiceSpec extends Specification {

    TiposEmpleosService tiposEmpleosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposEmpleos(...).save(flush: true, failOnError: true)
        //new TiposEmpleos(...).save(flush: true, failOnError: true)
        //TiposEmpleos tiposEmpleos = new TiposEmpleos(...).save(flush: true, failOnError: true)
        //new TiposEmpleos(...).save(flush: true, failOnError: true)
        //new TiposEmpleos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposEmpleos.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposEmpleosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposEmpleos> tiposEmpleosList = tiposEmpleosService.list(max: 2, offset: 2)

        then:
        tiposEmpleosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposEmpleosService.count() == 5
    }

    void "test delete"() {
        Long tiposEmpleosId = setupData()

        expect:
        tiposEmpleosService.count() == 5

        when:
        tiposEmpleosService.delete(tiposEmpleosId)
        sessionFactory.currentSession.flush()

        then:
        tiposEmpleosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposEmpleos tiposEmpleos = new TiposEmpleos()
        tiposEmpleosService.save(tiposEmpleos)

        then:
        tiposEmpleos.id != null
    }
}
