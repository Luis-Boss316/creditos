package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TipoPersonaServiceSpec extends Specification {

    TipoPersonaService tipoPersonaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TipoPersona(...).save(flush: true, failOnError: true)
        //new TipoPersona(...).save(flush: true, failOnError: true)
        //TipoPersona tipoPersona = new TipoPersona(...).save(flush: true, failOnError: true)
        //new TipoPersona(...).save(flush: true, failOnError: true)
        //new TipoPersona(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tipoPersona.id
    }

    void "test get"() {
        setupData()

        expect:
        tipoPersonaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TipoPersona> tipoPersonaList = tipoPersonaService.list(max: 2, offset: 2)

        then:
        tipoPersonaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tipoPersonaService.count() == 5
    }

    void "test delete"() {
        Long tipoPersonaId = setupData()

        expect:
        tipoPersonaService.count() == 5

        when:
        tipoPersonaService.delete(tipoPersonaId)
        sessionFactory.currentSession.flush()

        then:
        tipoPersonaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TipoPersona tipoPersona = new TipoPersona()
        tipoPersonaService.save(tipoPersona)

        then:
        tipoPersona.id != null
    }
}
