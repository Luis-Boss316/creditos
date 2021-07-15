package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ChequeraServiceSpec extends Specification {

    ChequeraService chequeraService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Chequera(...).save(flush: true, failOnError: true)
        //new Chequera(...).save(flush: true, failOnError: true)
        //Chequera chequera = new Chequera(...).save(flush: true, failOnError: true)
        //new Chequera(...).save(flush: true, failOnError: true)
        //new Chequera(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //chequera.id
    }

    void "test get"() {
        setupData()

        expect:
        chequeraService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Chequera> chequeraList = chequeraService.list(max: 2, offset: 2)

        then:
        chequeraList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        chequeraService.count() == 5
    }

    void "test delete"() {
        Long chequeraId = setupData()

        expect:
        chequeraService.count() == 5

        when:
        chequeraService.delete(chequeraId)
        sessionFactory.currentSession.flush()

        then:
        chequeraService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Chequera chequera = new Chequera()
        chequeraService.save(chequera)

        then:
        chequera.id != null
    }
}
