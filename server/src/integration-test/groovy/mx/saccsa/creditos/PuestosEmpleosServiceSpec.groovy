package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PuestosEmpleosServiceSpec extends Specification {

    PuestosEmpleosService puestosEmpleosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new PuestosEmpleos(...).save(flush: true, failOnError: true)
        //new PuestosEmpleos(...).save(flush: true, failOnError: true)
        //PuestosEmpleos puestosEmpleos = new PuestosEmpleos(...).save(flush: true, failOnError: true)
        //new PuestosEmpleos(...).save(flush: true, failOnError: true)
        //new PuestosEmpleos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //puestosEmpleos.id
    }

    void "test get"() {
        setupData()

        expect:
        puestosEmpleosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<PuestosEmpleos> puestosEmpleosList = puestosEmpleosService.list(max: 2, offset: 2)

        then:
        puestosEmpleosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        puestosEmpleosService.count() == 5
    }

    void "test delete"() {
        Long puestosEmpleosId = setupData()

        expect:
        puestosEmpleosService.count() == 5

        when:
        puestosEmpleosService.delete(puestosEmpleosId)
        sessionFactory.currentSession.flush()

        then:
        puestosEmpleosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        PuestosEmpleos puestosEmpleos = new PuestosEmpleos()
        puestosEmpleosService.save(puestosEmpleos)

        then:
        puestosEmpleos.id != null
    }
}
