package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class KycServiceSpec extends Specification {

    KycService kycService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Kyc(...).save(flush: true, failOnError: true)
        //new Kyc(...).save(flush: true, failOnError: true)
        //Kyc kyc = new Kyc(...).save(flush: true, failOnError: true)
        //new Kyc(...).save(flush: true, failOnError: true)
        //new Kyc(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //kyc.id
    }

    void "test get"() {
        setupData()

        expect:
        kycService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Kyc> kycList = kycService.list(max: 2, offset: 2)

        then:
        kycList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        kycService.count() == 5
    }

    void "test delete"() {
        Long kycId = setupData()

        expect:
        kycService.count() == 5

        when:
        kycService.delete(kycId)
        sessionFactory.currentSession.flush()

        then:
        kycService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Kyc kyc = new Kyc()
        kycService.save(kyc)

        then:
        kyc.id != null
    }
}
