package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProcedenciaRecursosServiceSpec extends Specification {

    ProcedenciaRecursosService procedenciaRecursosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ProcedenciaRecursos(...).save(flush: true, failOnError: true)
        //new ProcedenciaRecursos(...).save(flush: true, failOnError: true)
        //ProcedenciaRecursos procedenciaRecursos = new ProcedenciaRecursos(...).save(flush: true, failOnError: true)
        //new ProcedenciaRecursos(...).save(flush: true, failOnError: true)
        //new ProcedenciaRecursos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //procedenciaRecursos.id
    }

    void "test get"() {
        setupData()

        expect:
        procedenciaRecursosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ProcedenciaRecursos> procedenciaRecursosList = procedenciaRecursosService.list(max: 2, offset: 2)

        then:
        procedenciaRecursosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        procedenciaRecursosService.count() == 5
    }

    void "test delete"() {
        Long procedenciaRecursosId = setupData()

        expect:
        procedenciaRecursosService.count() == 5

        when:
        procedenciaRecursosService.delete(procedenciaRecursosId)
        sessionFactory.currentSession.flush()

        then:
        procedenciaRecursosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ProcedenciaRecursos procedenciaRecursos = new ProcedenciaRecursos()
        procedenciaRecursosService.save(procedenciaRecursos)

        then:
        procedenciaRecursos.id != null
    }
}
