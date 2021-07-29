package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class GeneralesServiceSpec extends Specification {

    GeneralesService generalesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Generales(...).save(flush: true, failOnError: true)
        //new Generales(...).save(flush: true, failOnError: true)
        //Generales generales = new Generales(...).save(flush: true, failOnError: true)
        //new Generales(...).save(flush: true, failOnError: true)
        //new Generales(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //generales.id
    }

    void "test get"() {
        setupData()

        expect:
        generalesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Generales> generalesList = generalesService.list(max: 2, offset: 2)

        then:
        generalesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        generalesService.count() == 5
    }

    void "test delete"() {
        Long generalesId = setupData()

        expect:
        generalesService.count() == 5

        when:
        generalesService.delete(generalesId)
        sessionFactory.currentSession.flush()

        then:
        generalesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Generales generales = new Generales()
        generalesService.save(generales)

        then:
        generales.id != null
    }
}
