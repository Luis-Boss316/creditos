package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProveedorRecursosServiceSpec extends Specification {

    ProveedorRecursosService proveedorRecursosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ProveedorRecursos(...).save(flush: true, failOnError: true)
        //new ProveedorRecursos(...).save(flush: true, failOnError: true)
        //ProveedorRecursos proveedorRecursos = new ProveedorRecursos(...).save(flush: true, failOnError: true)
        //new ProveedorRecursos(...).save(flush: true, failOnError: true)
        //new ProveedorRecursos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //proveedorRecursos.id
    }

    void "test get"() {
        setupData()

        expect:
        proveedorRecursosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ProveedorRecursos> proveedorRecursosList = proveedorRecursosService.list(max: 2, offset: 2)

        then:
        proveedorRecursosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        proveedorRecursosService.count() == 5
    }

    void "test delete"() {
        Long proveedorRecursosId = setupData()

        expect:
        proveedorRecursosService.count() == 5

        when:
        proveedorRecursosService.delete(proveedorRecursosId)
        sessionFactory.currentSession.flush()

        then:
        proveedorRecursosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ProveedorRecursos proveedorRecursos = new ProveedorRecursos()
        proveedorRecursosService.save(proveedorRecursos)

        then:
        proveedorRecursos.id != null
    }
}
