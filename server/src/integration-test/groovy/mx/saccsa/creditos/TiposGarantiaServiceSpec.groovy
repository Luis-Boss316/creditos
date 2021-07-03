package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposGarantiaServiceSpec extends Specification {

    TiposGarantiaService tiposGarantiaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposGarantia(...).save(flush: true, failOnError: true)
        //new TiposGarantia(...).save(flush: true, failOnError: true)
        //TiposGarantia tiposGarantia = new TiposGarantia(...).save(flush: true, failOnError: true)
        //new TiposGarantia(...).save(flush: true, failOnError: true)
        //new TiposGarantia(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposGarantia.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposGarantiaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposGarantia> tiposGarantiaList = tiposGarantiaService.list(max: 2, offset: 2)

        then:
        tiposGarantiaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposGarantiaService.count() == 5
    }

    void "test delete"() {
        Long tiposGarantiaId = setupData()

        expect:
        tiposGarantiaService.count() == 5

        when:
        tiposGarantiaService.delete(tiposGarantiaId)
        sessionFactory.currentSession.flush()

        then:
        tiposGarantiaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposGarantia tiposGarantia = new TiposGarantia()
        tiposGarantiaService.save(tiposGarantia)

        then:
        tiposGarantia.id != null
    }
}
