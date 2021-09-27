package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ParametrosProductosServiceSpec extends Specification {

    ParametrosProductosService parametrosProductosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ParametrosProductos(...).save(flush: true, failOnError: true)
        //new ParametrosProductos(...).save(flush: true, failOnError: true)
        //ParametrosProductos parametrosProductos = new ParametrosProductos(...).save(flush: true, failOnError: true)
        //new ParametrosProductos(...).save(flush: true, failOnError: true)
        //new ParametrosProductos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //parametrosProductos.id
    }

    void "test get"() {
        setupData()

        expect:
        parametrosProductosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ParametrosProductos> parametrosProductosList = parametrosProductosService.list(max: 2, offset: 2)

        then:
        parametrosProductosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        parametrosProductosService.count() == 5
    }

    void "test delete"() {
        Long parametrosProductosId = setupData()

        expect:
        parametrosProductosService.count() == 5

        when:
        parametrosProductosService.delete(parametrosProductosId)
        sessionFactory.currentSession.flush()

        then:
        parametrosProductosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ParametrosProductos parametrosProductos = new ParametrosProductos()
        parametrosProductosService.save(parametrosProductos)

        then:
        parametrosProductos.id != null
    }
}
