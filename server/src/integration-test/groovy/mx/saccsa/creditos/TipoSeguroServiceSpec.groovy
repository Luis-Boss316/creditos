package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TipoSeguroServiceSpec extends Specification {

    TipoSeguroService tipoSeguroService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TipoSeguro(...).save(flush: true, failOnError: true)
        //new TipoSeguro(...).save(flush: true, failOnError: true)
        //TipoSeguro tipoSeguro = new TipoSeguro(...).save(flush: true, failOnError: true)
        //new TipoSeguro(...).save(flush: true, failOnError: true)
        //new TipoSeguro(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tipoSeguro.id
    }

    void "test get"() {
        setupData()

        expect:
        tipoSeguroService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TipoSeguro> tipoSeguroList = tipoSeguroService.list(max: 2, offset: 2)

        then:
        tipoSeguroList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tipoSeguroService.count() == 5
    }

    void "test delete"() {
        Long tipoSeguroId = setupData()

        expect:
        tipoSeguroService.count() == 5

        when:
        tipoSeguroService.delete(tipoSeguroId)
        sessionFactory.currentSession.flush()

        then:
        tipoSeguroService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TipoSeguro tipoSeguro = new TipoSeguro()
        tipoSeguroService.save(tipoSeguro)

        then:
        tipoSeguro.id != null
    }
}
