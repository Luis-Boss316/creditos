package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class GiroEmpresarialServiceSpec extends Specification {

    GiroEmpresarialService giroEmpresarialService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new GiroEmpresarial(...).save(flush: true, failOnError: true)
        //new GiroEmpresarial(...).save(flush: true, failOnError: true)
        //GiroEmpresarial giroEmpresarial = new GiroEmpresarial(...).save(flush: true, failOnError: true)
        //new GiroEmpresarial(...).save(flush: true, failOnError: true)
        //new GiroEmpresarial(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //giroEmpresarial.id
    }

    void "test get"() {
        setupData()

        expect:
        giroEmpresarialService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<GiroEmpresarial> giroEmpresarialList = giroEmpresarialService.list(max: 2, offset: 2)

        then:
        giroEmpresarialList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        giroEmpresarialService.count() == 5
    }

    void "test delete"() {
        Long giroEmpresarialId = setupData()

        expect:
        giroEmpresarialService.count() == 5

        when:
        giroEmpresarialService.delete(giroEmpresarialId)
        sessionFactory.currentSession.flush()

        then:
        giroEmpresarialService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        GiroEmpresarial giroEmpresarial = new GiroEmpresarial()
        giroEmpresarialService.save(giroEmpresarial)

        then:
        giroEmpresarial.id != null
    }
}
