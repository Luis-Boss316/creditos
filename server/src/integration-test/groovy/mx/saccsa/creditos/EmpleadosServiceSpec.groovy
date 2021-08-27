package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EmpleadosServiceSpec extends Specification {

    EmpleadosService empleadosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Empleados(...).save(flush: true, failOnError: true)
        //new Empleados(...).save(flush: true, failOnError: true)
        //Empleados empleados = new Empleados(...).save(flush: true, failOnError: true)
        //new Empleados(...).save(flush: true, failOnError: true)
        //new Empleados(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //empleados.id
    }

    void "test get"() {
        setupData()

        expect:
        empleadosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Empleados> empleadosList = empleadosService.list(max: 2, offset: 2)

        then:
        empleadosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        empleadosService.count() == 5
    }

    void "test delete"() {
        Long empleadosId = setupData()

        expect:
        empleadosService.count() == 5

        when:
        empleadosService.delete(empleadosId)
        sessionFactory.currentSession.flush()

        then:
        empleadosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Empleados empleados = new Empleados()
        empleadosService.save(empleados)

        then:
        empleados.id != null
    }
}
