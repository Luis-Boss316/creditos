package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DatosBancariosServiceSpec extends Specification {

    DatosBancariosService datosBancariosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new DatosBancarios(...).save(flush: true, failOnError: true)
        //new DatosBancarios(...).save(flush: true, failOnError: true)
        //DatosBancarios datosBancarios = new DatosBancarios(...).save(flush: true, failOnError: true)
        //new DatosBancarios(...).save(flush: true, failOnError: true)
        //new DatosBancarios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //datosBancarios.id
    }

    void "test get"() {
        setupData()

        expect:
        datosBancariosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<DatosBancarios> datosBancariosList = datosBancariosService.list(max: 2, offset: 2)

        then:
        datosBancariosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        datosBancariosService.count() == 5
    }

    void "test delete"() {
        Long datosBancariosId = setupData()

        expect:
        datosBancariosService.count() == 5

        when:
        datosBancariosService.delete(datosBancariosId)
        sessionFactory.currentSession.flush()

        then:
        datosBancariosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        DatosBancarios datosBancarios = new DatosBancarios()
        datosBancariosService.save(datosBancarios)

        then:
        datosBancarios.id != null
    }
}
