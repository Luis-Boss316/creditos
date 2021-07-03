package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposRelacionesServiceSpec extends Specification {

    TiposRelacionesService tiposRelacionesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposRelaciones(...).save(flush: true, failOnError: true)
        //new TiposRelaciones(...).save(flush: true, failOnError: true)
        //TiposRelaciones tiposRelaciones = new TiposRelaciones(...).save(flush: true, failOnError: true)
        //new TiposRelaciones(...).save(flush: true, failOnError: true)
        //new TiposRelaciones(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposRelaciones.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposRelacionesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposRelaciones> tiposRelacionesList = tiposRelacionesService.list(max: 2, offset: 2)

        then:
        tiposRelacionesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposRelacionesService.count() == 5
    }

    void "test delete"() {
        Long tiposRelacionesId = setupData()

        expect:
        tiposRelacionesService.count() == 5

        when:
        tiposRelacionesService.delete(tiposRelacionesId)
        sessionFactory.currentSession.flush()

        then:
        tiposRelacionesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposRelaciones tiposRelaciones = new TiposRelaciones()
        tiposRelacionesService.save(tiposRelaciones)

        then:
        tiposRelaciones.id != null
    }
}
