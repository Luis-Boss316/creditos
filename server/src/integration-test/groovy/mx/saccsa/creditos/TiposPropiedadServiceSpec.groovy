package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposPropiedadServiceSpec extends Specification {

    TiposPropiedadService tiposPropiedadService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposPropiedad(...).save(flush: true, failOnError: true)
        //new TiposPropiedad(...).save(flush: true, failOnError: true)
        //TiposPropiedad tiposPropiedad = new TiposPropiedad(...).save(flush: true, failOnError: true)
        //new TiposPropiedad(...).save(flush: true, failOnError: true)
        //new TiposPropiedad(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposPropiedad.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposPropiedadService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposPropiedad> tiposPropiedadList = tiposPropiedadService.list(max: 2, offset: 2)

        then:
        tiposPropiedadList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposPropiedadService.count() == 5
    }

    void "test delete"() {
        Long tiposPropiedadId = setupData()

        expect:
        tiposPropiedadService.count() == 5

        when:
        tiposPropiedadService.delete(tiposPropiedadId)
        sessionFactory.currentSession.flush()

        then:
        tiposPropiedadService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposPropiedad tiposPropiedad = new TiposPropiedad()
        tiposPropiedadService.save(tiposPropiedad)

        then:
        tiposPropiedad.id != null
    }
}
