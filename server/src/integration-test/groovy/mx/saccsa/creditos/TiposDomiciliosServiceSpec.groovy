package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposDomiciliosServiceSpec extends Specification {

    TiposDomiciliosService tiposDomiciliosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposDomicilios(...).save(flush: true, failOnError: true)
        //new TiposDomicilios(...).save(flush: true, failOnError: true)
        //TiposDomicilios tiposDomicilios = new TiposDomicilios(...).save(flush: true, failOnError: true)
        //new TiposDomicilios(...).save(flush: true, failOnError: true)
        //new TiposDomicilios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposDomicilios.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposDomiciliosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposDomicilios> tiposDomiciliosList = tiposDomiciliosService.list(max: 2, offset: 2)

        then:
        tiposDomiciliosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposDomiciliosService.count() == 5
    }

    void "test delete"() {
        Long tiposDomiciliosId = setupData()

        expect:
        tiposDomiciliosService.count() == 5

        when:
        tiposDomiciliosService.delete(tiposDomiciliosId)
        sessionFactory.currentSession.flush()

        then:
        tiposDomiciliosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposDomicilios tiposDomicilios = new TiposDomicilios()
        tiposDomiciliosService.save(tiposDomicilios)

        then:
        tiposDomicilios.id != null
    }
}
