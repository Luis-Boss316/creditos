package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ParticipesServiceSpec extends Specification {

    ParticipesService participesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Participes(...).save(flush: true, failOnError: true)
        //new Participes(...).save(flush: true, failOnError: true)
        //Participes participes = new Participes(...).save(flush: true, failOnError: true)
        //new Participes(...).save(flush: true, failOnError: true)
        //new Participes(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //participes.id
    }

    void "test get"() {
        setupData()

        expect:
        participesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Participes> participesList = participesService.list(max: 2, offset: 2)

        then:
        participesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        participesService.count() == 5
    }

    void "test delete"() {
        Long participesId = setupData()

        expect:
        participesService.count() == 5

        when:
        participesService.delete(participesId)
        sessionFactory.currentSession.flush()

        then:
        participesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Participes participes = new Participes()
        participesService.save(participes)

        then:
        participes.id != null
    }
}
