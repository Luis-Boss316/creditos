package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProspectosServiceSpec extends Specification {

    ProspectosService prospectosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Prospectos(...).save(flush: true, failOnError: true)
        //new Prospectos(...).save(flush: true, failOnError: true)
        //Prospectos prospectos = new Prospectos(...).save(flush: true, failOnError: true)
        //new Prospectos(...).save(flush: true, failOnError: true)
        //new Prospectos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //prospectos.id
    }

    void "test get"() {
        setupData()

        expect:
        prospectosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Prospectos> prospectosList = prospectosService.list(max: 2, offset: 2)

        then:
        prospectosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        prospectosService.count() == 5
    }

    void "test delete"() {
        Long prospectosId = setupData()

        expect:
        prospectosService.count() == 5

        when:
        prospectosService.delete(prospectosId)
        sessionFactory.currentSession.flush()

        then:
        prospectosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Prospectos prospectos = new Prospectos()
        prospectosService.save(prospectos)

        then:
        prospectos.id != null
    }
}
