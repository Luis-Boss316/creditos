package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CorreosDatosGeneralesNegociosServiceSpec extends Specification {

    CorreosNegociosService correosNegociosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CorreosNegocios(...).save(flush: true, failOnError: true)
        //new CorreosNegocios(...).save(flush: true, failOnError: true)
        //CorreosNegocios correosNegocios = new CorreosNegocios(...).save(flush: true, failOnError: true)
        //new CorreosNegocios(...).save(flush: true, failOnError: true)
        //new CorreosNegocios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //correosNegocios.id
    }

    void "test get"() {
        setupData()

        expect:
        correosNegociosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CorreosNegocios> correosNegociosList = correosNegociosService.list(max: 2, offset: 2)

        then:
        correosNegociosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        correosNegociosService.count() == 5
    }

    void "test delete"() {
        Long correosNegociosId = setupData()

        expect:
        correosNegociosService.count() == 5

        when:
        correosNegociosService.delete(correosNegociosId)
        sessionFactory.currentSession.flush()

        then:
        correosNegociosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CorreosNegocios correosNegocios = new CorreosNegocios()
        correosNegociosService.save(correosNegocios)

        then:
        correosNegocios.id != null
    }
}
