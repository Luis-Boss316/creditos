package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ActVulnerableServiceSpec extends Specification {

    ActVulnerableService actVulnerableService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ActVulnerable(...).save(flush: true, failOnError: true)
        //new ActVulnerable(...).save(flush: true, failOnError: true)
        //ActVulnerable actVulnerable = new ActVulnerable(...).save(flush: true, failOnError: true)
        //new ActVulnerable(...).save(flush: true, failOnError: true)
        //new ActVulnerable(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //actVulnerable.id
    }

    void "test get"() {
        setupData()

        expect:
        actVulnerableService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ActVulnerable> actVulnerableList = actVulnerableService.list(max: 2, offset: 2)

        then:
        actVulnerableList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        actVulnerableService.count() == 5
    }

    void "test delete"() {
        Long actVulnerableId = setupData()

        expect:
        actVulnerableService.count() == 5

        when:
        actVulnerableService.delete(actVulnerableId)
        sessionFactory.currentSession.flush()

        then:
        actVulnerableService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ActVulnerable actVulnerable = new ActVulnerable()
        actVulnerableService.save(actVulnerable)

        then:
        actVulnerable.id != null
    }
}
