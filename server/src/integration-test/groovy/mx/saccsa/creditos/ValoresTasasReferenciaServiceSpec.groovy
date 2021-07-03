package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ValoresTasasReferenciaServiceSpec extends Specification {

    ValoresTasasReferenciaService valoresTasasReferenciaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ValoresTasasReferencia(...).save(flush: true, failOnError: true)
        //new ValoresTasasReferencia(...).save(flush: true, failOnError: true)
        //ValoresTasasReferencia valoresTasasReferencia = new ValoresTasasReferencia(...).save(flush: true, failOnError: true)
        //new ValoresTasasReferencia(...).save(flush: true, failOnError: true)
        //new ValoresTasasReferencia(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //valoresTasasReferencia.id
    }

    void "test get"() {
        setupData()

        expect:
        valoresTasasReferenciaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ValoresTasasReferencia> valoresTasasReferenciaList = valoresTasasReferenciaService.list(max: 2, offset: 2)

        then:
        valoresTasasReferenciaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        valoresTasasReferenciaService.count() == 5
    }

    void "test delete"() {
        Long valoresTasasReferenciaId = setupData()

        expect:
        valoresTasasReferenciaService.count() == 5

        when:
        valoresTasasReferenciaService.delete(valoresTasasReferenciaId)
        sessionFactory.currentSession.flush()

        then:
        valoresTasasReferenciaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ValoresTasasReferencia valoresTasasReferencia = new ValoresTasasReferencia()
        valoresTasasReferenciaService.save(valoresTasasReferencia)

        then:
        valoresTasasReferencia.id != null
    }
}
