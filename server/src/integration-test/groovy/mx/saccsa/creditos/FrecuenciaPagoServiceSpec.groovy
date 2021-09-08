package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class FrecuenciaPagoServiceSpec extends Specification {

    FrecuenciaPagoService frecuenciaPagoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new FrecuenciaPago(...).save(flush: true, failOnError: true)
        //new FrecuenciaPago(...).save(flush: true, failOnError: true)
        //FrecuenciaPago frecuenciaPago = new FrecuenciaPago(...).save(flush: true, failOnError: true)
        //new FrecuenciaPago(...).save(flush: true, failOnError: true)
        //new FrecuenciaPago(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //frecuenciaPago.id
    }

    void "test get"() {
        setupData()

        expect:
        frecuenciaPagoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<FrecuenciaPago> frecuenciaPagoList = frecuenciaPagoService.list(max: 2, offset: 2)

        then:
        frecuenciaPagoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        frecuenciaPagoService.count() == 5
    }

    void "test delete"() {
        Long frecuenciaPagoId = setupData()

        expect:
        frecuenciaPagoService.count() == 5

        when:
        frecuenciaPagoService.delete(frecuenciaPagoId)
        sessionFactory.currentSession.flush()

        then:
        frecuenciaPagoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        FrecuenciaPago frecuenciaPago = new FrecuenciaPago()
        frecuenciaPagoService.save(frecuenciaPago)

        then:
        frecuenciaPago.id != null
    }
}
