package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class BuroCreditoServiceSpec extends Specification {

    BuroCreditoService buroCreditoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new BuroCredito(...).save(flush: true, failOnError: true)
        //new BuroCredito(...).save(flush: true, failOnError: true)
        //BuroCredito buroCredito = new BuroCredito(...).save(flush: true, failOnError: true)
        //new BuroCredito(...).save(flush: true, failOnError: true)
        //new BuroCredito(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //buroCredito.id
    }

    void "test get"() {
        setupData()

        expect:
        buroCreditoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<BuroCredito> buroCreditoList = buroCreditoService.list(max: 2, offset: 2)

        then:
        buroCreditoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        buroCreditoService.count() == 5
    }

    void "test delete"() {
        Long buroCreditoId = setupData()

        expect:
        buroCreditoService.count() == 5

        when:
        buroCreditoService.delete(buroCreditoId)
        sessionFactory.currentSession.flush()

        then:
        buroCreditoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        BuroCredito buroCredito = new BuroCredito()
        buroCreditoService.save(buroCredito)

        then:
        buroCredito.id != null
    }
}
