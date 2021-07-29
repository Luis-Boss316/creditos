package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TipoClienteServiceSpec extends Specification {

    TipoClienteService tipoClienteService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TipoCliente(...).save(flush: true, failOnError: true)
        //new TipoCliente(...).save(flush: true, failOnError: true)
        //TipoCliente tipoCliente = new TipoCliente(...).save(flush: true, failOnError: true)
        //new TipoCliente(...).save(flush: true, failOnError: true)
        //new TipoCliente(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tipoCliente.id
    }

    void "test get"() {
        setupData()

        expect:
        tipoClienteService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TipoCliente> tipoClienteList = tipoClienteService.list(max: 2, offset: 2)

        then:
        tipoClienteList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tipoClienteService.count() == 5
    }

    void "test delete"() {
        Long tipoClienteId = setupData()

        expect:
        tipoClienteService.count() == 5

        when:
        tipoClienteService.delete(tipoClienteId)
        sessionFactory.currentSession.flush()

        then:
        tipoClienteService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TipoCliente tipoCliente = new TipoCliente()
        tipoClienteService.save(tipoCliente)

        then:
        tipoCliente.id != null
    }
}
