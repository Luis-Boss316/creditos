package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ContactosDatosGeneralesNegociosServiceSpec extends Specification {

    ContactosNegociosService contactosNegociosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ContactosNegocios(...).save(flush: true, failOnError: true)
        //new ContactosNegocios(...).save(flush: true, failOnError: true)
        //ContactosNegocios contactosNegocios = new ContactosNegocios(...).save(flush: true, failOnError: true)
        //new ContactosNegocios(...).save(flush: true, failOnError: true)
        //new ContactosNegocios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //contactosNegocios.id
    }

    void "test get"() {
        setupData()

        expect:
        contactosNegociosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ContactosNegocios> contactosNegociosList = contactosNegociosService.list(max: 2, offset: 2)

        then:
        contactosNegociosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        contactosNegociosService.count() == 5
    }

    void "test delete"() {
        Long contactosNegociosId = setupData()

        expect:
        contactosNegociosService.count() == 5

        when:
        contactosNegociosService.delete(contactosNegociosId)
        sessionFactory.currentSession.flush()

        then:
        contactosNegociosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ContactosNegocios contactosNegocios = new ContactosNegocios()
        contactosNegociosService.save(contactosNegocios)

        then:
        contactosNegocios.id != null
    }
}
