package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class AvalesServiceSpec extends Specification {

    AvalesService avalesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Avales(...).save(flush: true, failOnError: true)
        //new Avales(...).save(flush: true, failOnError: true)
        //Avales avales = new Avales(...).save(flush: true, failOnError: true)
        //new Avales(...).save(flush: true, failOnError: true)
        //new Avales(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //avales.id
    }

    void "test get"() {
        setupData()

        expect:
        avalesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Avales> avalesList = avalesService.list(max: 2, offset: 2)

        then:
        avalesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        avalesService.count() == 5
    }

    void "test delete"() {
        Long avalesId = setupData()

        expect:
        avalesService.count() == 5

        when:
        avalesService.delete(avalesId)
        sessionFactory.currentSession.flush()

        then:
        avalesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Avales avales = new Avales()
        avalesService.save(avales)

        then:
        avales.id != null
    }
}
