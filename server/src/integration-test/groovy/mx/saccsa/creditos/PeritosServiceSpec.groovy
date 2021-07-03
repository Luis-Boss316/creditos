package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PeritosServiceSpec extends Specification {

    PeritosService peritosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Peritos(...).save(flush: true, failOnError: true)
        //new Peritos(...).save(flush: true, failOnError: true)
        //Peritos peritos = new Peritos(...).save(flush: true, failOnError: true)
        //new Peritos(...).save(flush: true, failOnError: true)
        //new Peritos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //peritos.id
    }

    void "test get"() {
        setupData()

        expect:
        peritosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Peritos> peritosList = peritosService.list(max: 2, offset: 2)

        then:
        peritosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        peritosService.count() == 5
    }

    void "test delete"() {
        Long peritosId = setupData()

        expect:
        peritosService.count() == 5

        when:
        peritosService.delete(peritosId)
        sessionFactory.currentSession.flush()

        then:
        peritosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Peritos peritos = new Peritos()
        peritosService.save(peritos)

        then:
        peritos.id != null
    }
}
