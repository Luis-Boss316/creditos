package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class MunicipiosServiceSpec extends Specification {

    MunicipiosService municipiosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Municipios(...).save(flush: true, failOnError: true)
        //new Municipios(...).save(flush: true, failOnError: true)
        //Municipios municipios = new Municipios(...).save(flush: true, failOnError: true)
        //new Municipios(...).save(flush: true, failOnError: true)
        //new Municipios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //municipios.id
    }

    void "test get"() {
        setupData()

        expect:
        municipiosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Municipios> municipiosList = municipiosService.list(max: 2, offset: 2)

        then:
        municipiosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        municipiosService.count() == 5
    }

    void "test delete"() {
        Long municipiosId = setupData()

        expect:
        municipiosService.count() == 5

        when:
        municipiosService.delete(municipiosId)
        sessionFactory.currentSession.flush()

        then:
        municipiosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Municipios municipios = new Municipios()
        municipiosService.save(municipios)

        then:
        municipios.id != null
    }
}
