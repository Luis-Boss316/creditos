package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TasasReferenciaServiceSpec extends Specification {

    TasasReferenciaService tasasReferenciaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TasasReferencia(...).save(flush: true, failOnError: true)
        //new TasasReferencia(...).save(flush: true, failOnError: true)
        //TasasReferencia tasasReferencia = new TasasReferencia(...).save(flush: true, failOnError: true)
        //new TasasReferencia(...).save(flush: true, failOnError: true)
        //new TasasReferencia(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tasasReferencia.id
    }

    void "test get"() {
        setupData()

        expect:
        tasasReferenciaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TasasReferencia> tasasReferenciaList = tasasReferenciaService.list(max: 2, offset: 2)

        then:
        tasasReferenciaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tasasReferenciaService.count() == 5
    }

    void "test delete"() {
        Long tasasReferenciaId = setupData()

        expect:
        tasasReferenciaService.count() == 5

        when:
        tasasReferenciaService.delete(tasasReferenciaId)
        sessionFactory.currentSession.flush()

        then:
        tasasReferenciaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TasasReferencia tasasReferencia = new TasasReferencia()
        tasasReferenciaService.save(tasasReferencia)

        then:
        tasasReferencia.id != null
    }
}
