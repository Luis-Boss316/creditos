package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TipoImpuestosServiceSpec extends Specification {

    TipoImpuestosService tipoImpuestosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TipoImpuestos(...).save(flush: true, failOnError: true)
        //new TipoImpuestos(...).save(flush: true, failOnError: true)
        //TipoImpuestos tipoImpuestos = new TipoImpuestos(...).save(flush: true, failOnError: true)
        //new TipoImpuestos(...).save(flush: true, failOnError: true)
        //new TipoImpuestos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tipoImpuestos.id
    }

    void "test get"() {
        setupData()

        expect:
        tipoImpuestosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TipoImpuestos> tipoImpuestosList = tipoImpuestosService.list(max: 2, offset: 2)

        then:
        tipoImpuestosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tipoImpuestosService.count() == 5
    }

    void "test delete"() {
        Long tipoImpuestosId = setupData()

        expect:
        tipoImpuestosService.count() == 5

        when:
        tipoImpuestosService.delete(tipoImpuestosId)
        sessionFactory.currentSession.flush()

        then:
        tipoImpuestosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TipoImpuestos tipoImpuestos = new TipoImpuestos()
        tipoImpuestosService.save(tipoImpuestos)

        then:
        tipoImpuestos.id != null
    }
}
