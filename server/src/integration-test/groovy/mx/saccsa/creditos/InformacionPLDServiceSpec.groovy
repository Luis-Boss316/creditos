package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class InformacionPLDServiceSpec extends Specification {

    InformacionPLDService informacionPLDService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new InformacionPLD(...).save(flush: true, failOnError: true)
        //new InformacionPLD(...).save(flush: true, failOnError: true)
        //InformacionPLD informacionPLD = new InformacionPLD(...).save(flush: true, failOnError: true)
        //new InformacionPLD(...).save(flush: true, failOnError: true)
        //new InformacionPLD(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //informacionPLD.id
    }

    void "test get"() {
        setupData()

        expect:
        informacionPLDService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<InformacionPLD> informacionPLDList = informacionPLDService.list(max: 2, offset: 2)

        then:
        informacionPLDList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        informacionPLDService.count() == 5
    }

    void "test delete"() {
        Long informacionPLDId = setupData()

        expect:
        informacionPLDService.count() == 5

        when:
        informacionPLDService.delete(informacionPLDId)
        sessionFactory.currentSession.flush()

        then:
        informacionPLDService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        InformacionPLD informacionPLD = new InformacionPLD()
        informacionPLDService.save(informacionPLD)

        then:
        informacionPLD.id != null
    }
}
