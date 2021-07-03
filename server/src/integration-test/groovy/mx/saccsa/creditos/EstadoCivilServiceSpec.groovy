package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class EstadoCivilServiceSpec extends Specification {

    EstadoCivilService estadoCivilService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new EstadoCivil(...).save(flush: true, failOnError: true)
        //new EstadoCivil(...).save(flush: true, failOnError: true)
        //EstadoCivil estadoCivil = new EstadoCivil(...).save(flush: true, failOnError: true)
        //new EstadoCivil(...).save(flush: true, failOnError: true)
        //new EstadoCivil(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //estadoCivil.id
    }

    void "test get"() {
        setupData()

        expect:
        estadoCivilService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<EstadoCivil> estadoCivilList = estadoCivilService.list(max: 2, offset: 2)

        then:
        estadoCivilList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        estadoCivilService.count() == 5
    }

    void "test delete"() {
        Long estadoCivilId = setupData()

        expect:
        estadoCivilService.count() == 5

        when:
        estadoCivilService.delete(estadoCivilId)
        sessionFactory.currentSession.flush()

        then:
        estadoCivilService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        EstadoCivil estadoCivil = new EstadoCivil()
        estadoCivilService.save(estadoCivil)

        then:
        estadoCivil.id != null
    }
}
