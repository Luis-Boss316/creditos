package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TitulosServiceSpec extends Specification {

    TitulosService titulosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Titulos(...).save(flush: true, failOnError: true)
        //new Titulos(...).save(flush: true, failOnError: true)
        //Titulos titulos = new Titulos(...).save(flush: true, failOnError: true)
        //new Titulos(...).save(flush: true, failOnError: true)
        //new Titulos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //titulos.id
    }

    void "test get"() {
        setupData()

        expect:
        titulosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Titulos> titulosList = titulosService.list(max: 2, offset: 2)

        then:
        titulosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        titulosService.count() == 5
    }

    void "test delete"() {
        Long titulosId = setupData()

        expect:
        titulosService.count() == 5

        when:
        titulosService.delete(titulosId)
        sessionFactory.currentSession.flush()

        then:
        titulosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Titulos titulos = new Titulos()
        titulosService.save(titulos)

        then:
        titulos.id != null
    }
}
