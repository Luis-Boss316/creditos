package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CirculoCreditoServiceSpec extends Specification {

    CirculoCreditoService circuloCreditoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CirculoCredito(...).save(flush: true, failOnError: true)
        //new CirculoCredito(...).save(flush: true, failOnError: true)
        //CirculoCredito circuloCredito = new CirculoCredito(...).save(flush: true, failOnError: true)
        //new CirculoCredito(...).save(flush: true, failOnError: true)
        //new CirculoCredito(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //circuloCredito.id
    }

    void "test get"() {
        setupData()

        expect:
        circuloCreditoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CirculoCredito> circuloCreditoList = circuloCreditoService.list(max: 2, offset: 2)

        then:
        circuloCreditoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        circuloCreditoService.count() == 5
    }

    void "test delete"() {
        Long circuloCreditoId = setupData()

        expect:
        circuloCreditoService.count() == 5

        when:
        circuloCreditoService.delete(circuloCreditoId)
        sessionFactory.currentSession.flush()

        then:
        circuloCreditoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CirculoCredito circuloCredito = new CirculoCredito()
        circuloCreditoService.save(circuloCredito)

        then:
        circuloCredito.id != null
    }
}
