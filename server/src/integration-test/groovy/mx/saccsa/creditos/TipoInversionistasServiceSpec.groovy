package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TipoInversionistasServiceSpec extends Specification {

    TipoInversionistasService tipoInversionistasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TipoInversionistas(...).save(flush: true, failOnError: true)
        //new TipoInversionistas(...).save(flush: true, failOnError: true)
        //TipoInversionistas tipoInversionistas = new TipoInversionistas(...).save(flush: true, failOnError: true)
        //new TipoInversionistas(...).save(flush: true, failOnError: true)
        //new TipoInversionistas(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tipoInversionistas.id
    }

    void "test get"() {
        setupData()

        expect:
        tipoInversionistasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TipoInversionistas> tipoInversionistasList = tipoInversionistasService.list(max: 2, offset: 2)

        then:
        tipoInversionistasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tipoInversionistasService.count() == 5
    }

    void "test delete"() {
        Long tipoInversionistasId = setupData()

        expect:
        tipoInversionistasService.count() == 5

        when:
        tipoInversionistasService.delete(tipoInversionistasId)
        sessionFactory.currentSession.flush()

        then:
        tipoInversionistasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TipoInversionistas tipoInversionistas = new TipoInversionistas()
        tipoInversionistasService.save(tipoInversionistas)

        then:
        tipoInversionistas.id != null
    }
}
