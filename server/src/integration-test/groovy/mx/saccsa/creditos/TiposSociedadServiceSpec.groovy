package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposSociedadServiceSpec extends Specification {

    TiposSociedadService tiposSociedadService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposSociedad(...).save(flush: true, failOnError: true)
        //new TiposSociedad(...).save(flush: true, failOnError: true)
        //TiposSociedad tiposSociedad = new TiposSociedad(...).save(flush: true, failOnError: true)
        //new TiposSociedad(...).save(flush: true, failOnError: true)
        //new TiposSociedad(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposSociedad.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposSociedadService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposSociedad> tiposSociedadList = tiposSociedadService.list(max: 2, offset: 2)

        then:
        tiposSociedadList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposSociedadService.count() == 5
    }

    void "test delete"() {
        Long tiposSociedadId = setupData()

        expect:
        tiposSociedadService.count() == 5

        when:
        tiposSociedadService.delete(tiposSociedadId)
        sessionFactory.currentSession.flush()

        then:
        tiposSociedadService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposSociedad tiposSociedad = new TiposSociedad()
        tiposSociedadService.save(tiposSociedad)

        then:
        tiposSociedad.id != null
    }
}
