package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PaisesServiceSpec extends Specification {

    PaisesService paisesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Paises(...).save(flush: true, failOnError: true)
        //new Paises(...).save(flush: true, failOnError: true)
        //Paises paises = new Paises(...).save(flush: true, failOnError: true)
        //new Paises(...).save(flush: true, failOnError: true)
        //new Paises(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //paises.id
    }

    void "test get"() {
        setupData()

        expect:
        paisesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Paises> paisesList = paisesService.list(max: 2, offset: 2)

        then:
        paisesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        paisesService.count() == 5
    }

    void "test delete"() {
        Long paisesId = setupData()

        expect:
        paisesService.count() == 5

        when:
        paisesService.delete(paisesId)
        sessionFactory.currentSession.flush()

        then:
        paisesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Paises paises = new Paises()
        paisesService.save(paises)

        then:
        paises.id != null
    }
}
