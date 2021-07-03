package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposCreditoServiceSpec extends Specification {

    TiposCreditoService tiposCreditoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposCredito(...).save(flush: true, failOnError: true)
        //new TiposCredito(...).save(flush: true, failOnError: true)
        //TiposCredito tiposCredito = new TiposCredito(...).save(flush: true, failOnError: true)
        //new TiposCredito(...).save(flush: true, failOnError: true)
        //new TiposCredito(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposCredito.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposCreditoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposCredito> tiposCreditoList = tiposCreditoService.list(max: 2, offset: 2)

        then:
        tiposCreditoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposCreditoService.count() == 5
    }

    void "test delete"() {
        Long tiposCreditoId = setupData()

        expect:
        tiposCreditoService.count() == 5

        when:
        tiposCreditoService.delete(tiposCreditoId)
        sessionFactory.currentSession.flush()

        then:
        tiposCreditoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposCredito tiposCredito = new TiposCredito()
        tiposCreditoService.save(tiposCredito)

        then:
        tiposCredito.id != null
    }
}
