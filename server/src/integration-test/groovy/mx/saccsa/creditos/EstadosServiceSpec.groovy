package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EstadosServiceSpec extends Specification {

    EstadosService estadosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Estados(...).save(flush: true, failOnError: true)
        //new Estados(...).save(flush: true, failOnError: true)
        //Estados estados = new Estados(...).save(flush: true, failOnError: true)
        //new Estados(...).save(flush: true, failOnError: true)
        //new Estados(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //estados.id
    }

    void "test get"() {
        setupData()

        expect:
        estadosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Estados> estadosList = estadosService.list(max: 2, offset: 2)

        then:
        estadosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        estadosService.count() == 5
    }

    void "test delete"() {
        Long estadosId = setupData()

        expect:
        estadosService.count() == 5

        when:
        estadosService.delete(estadosId)
        sessionFactory.currentSession.flush()

        then:
        estadosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Estados estados = new Estados()
        estadosService.save(estados)

        then:
        estados.id != null
    }
}
