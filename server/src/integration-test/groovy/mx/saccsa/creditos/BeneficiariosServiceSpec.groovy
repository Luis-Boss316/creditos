package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class BeneficiariosServiceSpec extends Specification {

    BeneficiariosService beneficiariosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Beneficiarios(...).save(flush: true, failOnError: true)
        //new Beneficiarios(...).save(flush: true, failOnError: true)
        //Beneficiarios beneficiarios = new Beneficiarios(...).save(flush: true, failOnError: true)
        //new Beneficiarios(...).save(flush: true, failOnError: true)
        //new Beneficiarios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //beneficiarios.id
    }

    void "test get"() {
        setupData()

        expect:
        beneficiariosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Beneficiarios> beneficiariosList = beneficiariosService.list(max: 2, offset: 2)

        then:
        beneficiariosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        beneficiariosService.count() == 5
    }

    void "test delete"() {
        Long beneficiariosId = setupData()

        expect:
        beneficiariosService.count() == 5

        when:
        beneficiariosService.delete(beneficiariosId)
        sessionFactory.currentSession.flush()

        then:
        beneficiariosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Beneficiarios beneficiarios = new Beneficiarios()
        beneficiariosService.save(beneficiarios)

        then:
        beneficiarios.id != null
    }
}
