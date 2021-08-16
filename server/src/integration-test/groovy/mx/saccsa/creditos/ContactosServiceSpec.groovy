package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ContactosServiceSpec extends Specification {

    ContactosService contactosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Contactos(...).save(flush: true, failOnError: true)
        //new Contactos(...).save(flush: true, failOnError: true)
        //Contactos contactos = new Contactos(...).save(flush: true, failOnError: true)
        //new Contactos(...).save(flush: true, failOnError: true)
        //new Contactos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //contactos.id
    }

    void "test get"() {
        setupData()

        expect:
        contactosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Contactos> contactosList = contactosService.list(max: 2, offset: 2)

        then:
        contactosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        contactosService.count() == 5
    }

    void "test delete"() {
        Long contactosId = setupData()

        expect:
        contactosService.count() == 5

        when:
        contactosService.delete(contactosId)
        sessionFactory.currentSession.flush()

        then:
        contactosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Contactos contactos = new Contactos()
        contactosService.save(contactos)

        then:
        contactos.id != null
    }
}
