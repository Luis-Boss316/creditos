package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class NacionalidadesServiceSpec extends Specification {

    NacionalidadesService nacionalidadesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Nacionalidades(...).save(flush: true, failOnError: true)
        //new Nacionalidades(...).save(flush: true, failOnError: true)
        //Nacionalidades nacionalidades = new Nacionalidades(...).save(flush: true, failOnError: true)
        //new Nacionalidades(...).save(flush: true, failOnError: true)
        //new Nacionalidades(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //nacionalidades.id
    }

    void "test get"() {
        setupData()

        expect:
        nacionalidadesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Nacionalidades> nacionalidadesList = nacionalidadesService.list(max: 2, offset: 2)

        then:
        nacionalidadesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        nacionalidadesService.count() == 5
    }

    void "test delete"() {
        Long nacionalidadesId = setupData()

        expect:
        nacionalidadesService.count() == 5

        when:
        nacionalidadesService.delete(nacionalidadesId)
        sessionFactory.currentSession.flush()

        then:
        nacionalidadesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Nacionalidades nacionalidades = new Nacionalidades()
        nacionalidadesService.save(nacionalidades)

        then:
        nacionalidades.id != null
    }
}
