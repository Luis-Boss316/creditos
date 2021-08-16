package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TelefonosServiceSpec extends Specification {

    TelefonosService telefonosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Telefonos(...).save(flush: true, failOnError: true)
        //new Telefonos(...).save(flush: true, failOnError: true)
        //Telefonos telefonos = new Telefonos(...).save(flush: true, failOnError: true)
        //new Telefonos(...).save(flush: true, failOnError: true)
        //new Telefonos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //telefonos.id
    }

    void "test get"() {
        setupData()

        expect:
        telefonosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Telefonos> telefonosList = telefonosService.list(max: 2, offset: 2)

        then:
        telefonosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        telefonosService.count() == 5
    }

    void "test delete"() {
        Long telefonosId = setupData()

        expect:
        telefonosService.count() == 5

        when:
        telefonosService.delete(telefonosId)
        sessionFactory.currentSession.flush()

        then:
        telefonosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Telefonos telefonos = new Telefonos()
        telefonosService.save(telefonos)

        then:
        telefonos.id != null
    }
}
