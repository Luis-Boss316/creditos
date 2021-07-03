package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DestinosCreditoServiceSpec extends Specification {

    DestinosCreditoService destinosCreditoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new DestinosCredito(...).save(flush: true, failOnError: true)
        //new DestinosCredito(...).save(flush: true, failOnError: true)
        //DestinosCredito destinosCredito = new DestinosCredito(...).save(flush: true, failOnError: true)
        //new DestinosCredito(...).save(flush: true, failOnError: true)
        //new DestinosCredito(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //destinosCredito.id
    }

    void "test get"() {
        setupData()

        expect:
        destinosCreditoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<DestinosCredito> destinosCreditoList = destinosCreditoService.list(max: 2, offset: 2)

        then:
        destinosCreditoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        destinosCreditoService.count() == 5
    }

    void "test delete"() {
        Long destinosCreditoId = setupData()

        expect:
        destinosCreditoService.count() == 5

        when:
        destinosCreditoService.delete(destinosCreditoId)
        sessionFactory.currentSession.flush()

        then:
        destinosCreditoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        DestinosCredito destinosCredito = new DestinosCredito()
        destinosCreditoService.save(destinosCredito)

        then:
        destinosCredito.id != null
    }
}
