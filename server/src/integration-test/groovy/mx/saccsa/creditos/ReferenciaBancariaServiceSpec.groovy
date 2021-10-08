package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ReferenciaBancariaServiceSpec extends Specification {

    ReferenciaBancariaService referenciaBancariaService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ReferenciaBancaria(...).save(flush: true, failOnError: true)
        //new ReferenciaBancaria(...).save(flush: true, failOnError: true)
        //ReferenciaBancaria referenciaBancaria = new ReferenciaBancaria(...).save(flush: true, failOnError: true)
        //new ReferenciaBancaria(...).save(flush: true, failOnError: true)
        //new ReferenciaBancaria(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //referenciaBancaria.id
    }

    void "test get"() {
        setupData()

        expect:
        referenciaBancariaService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ReferenciaBancaria> referenciaBancariaList = referenciaBancariaService.list(max: 2, offset: 2)

        then:
        referenciaBancariaList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        referenciaBancariaService.count() == 5
    }

    void "test delete"() {
        Long referenciaBancariaId = setupData()

        expect:
        referenciaBancariaService.count() == 5

        when:
        referenciaBancariaService.delete(referenciaBancariaId)
        sessionFactory.currentSession.flush()

        then:
        referenciaBancariaService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ReferenciaBancaria referenciaBancaria = new ReferenciaBancaria()
        referenciaBancariaService.save(referenciaBancaria)

        then:
        referenciaBancaria.id != null
    }
}
