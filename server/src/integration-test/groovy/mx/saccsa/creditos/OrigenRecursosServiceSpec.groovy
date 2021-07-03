package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class OrigenRecursosServiceSpec extends Specification {

    OrigenRecursosService origenRecursosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new OrigenRecursos(...).save(flush: true, failOnError: true)
        //new OrigenRecursos(...).save(flush: true, failOnError: true)
        //OrigenRecursos origenRecursos = new OrigenRecursos(...).save(flush: true, failOnError: true)
        //new OrigenRecursos(...).save(flush: true, failOnError: true)
        //new OrigenRecursos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //origenRecursos.id
    }

    void "test get"() {
        setupData()

        expect:
        origenRecursosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<OrigenRecursos> origenRecursosList = origenRecursosService.list(max: 2, offset: 2)

        then:
        origenRecursosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        origenRecursosService.count() == 5
    }

    void "test delete"() {
        Long origenRecursosId = setupData()

        expect:
        origenRecursosService.count() == 5

        when:
        origenRecursosService.delete(origenRecursosId)
        sessionFactory.currentSession.flush()

        then:
        origenRecursosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        OrigenRecursos origenRecursos = new OrigenRecursos()
        origenRecursosService.save(origenRecursos)

        then:
        origenRecursos.id != null
    }
}
