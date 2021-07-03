package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class RegimenMatrimonialServiceSpec extends Specification {

    RegimenMatrimonialService regimenMatrimonialService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new RegimenMatrimonial(...).save(flush: true, failOnError: true)
        //new RegimenMatrimonial(...).save(flush: true, failOnError: true)
        //RegimenMatrimonial regimenMatrimonial = new RegimenMatrimonial(...).save(flush: true, failOnError: true)
        //new RegimenMatrimonial(...).save(flush: true, failOnError: true)
        //new RegimenMatrimonial(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //regimenMatrimonial.id
    }

    void "test get"() {
        setupData()

        expect:
        regimenMatrimonialService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<RegimenMatrimonial> regimenMatrimonialList = regimenMatrimonialService.list(max: 2, offset: 2)

        then:
        regimenMatrimonialList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        regimenMatrimonialService.count() == 5
    }

    void "test delete"() {
        Long regimenMatrimonialId = setupData()

        expect:
        regimenMatrimonialService.count() == 5

        when:
        regimenMatrimonialService.delete(regimenMatrimonialId)
        sessionFactory.currentSession.flush()

        then:
        regimenMatrimonialService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        RegimenMatrimonial regimenMatrimonial = new RegimenMatrimonial()
        regimenMatrimonialService.save(regimenMatrimonial)

        then:
        regimenMatrimonial.id != null
    }
}
