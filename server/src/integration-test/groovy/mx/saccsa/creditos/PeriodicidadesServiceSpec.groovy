package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class PeriodicidadesServiceSpec extends Specification {

    PeriodicidadesService periodicidadesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Periodicidades(...).save(flush: true, failOnError: true)
        //new Periodicidades(...).save(flush: true, failOnError: true)
        //Periodicidades periodicidades = new Periodicidades(...).save(flush: true, failOnError: true)
        //new Periodicidades(...).save(flush: true, failOnError: true)
        //new Periodicidades(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //periodicidades.id
    }

    void "test get"() {
        setupData()

        expect:
        periodicidadesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Periodicidades> periodicidadesList = periodicidadesService.list(max: 2, offset: 2)

        then:
        periodicidadesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        periodicidadesService.count() == 5
    }

    void "test delete"() {
        Long periodicidadesId = setupData()

        expect:
        periodicidadesService.count() == 5

        when:
        periodicidadesService.delete(periodicidadesId)
        sessionFactory.currentSession.flush()

        then:
        periodicidadesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Periodicidades periodicidades = new Periodicidades()
        periodicidadesService.save(periodicidades)

        then:
        periodicidades.id != null
    }
}
