package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class LocalidadesBANXICOServiceSpec extends Specification {

    LocalidadesBANXICOService localidadesBANXICOService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new LocalidadesBANXICO(...).save(flush: true, failOnError: true)
        //new LocalidadesBANXICO(...).save(flush: true, failOnError: true)
        //LocalidadesBANXICO localidadesBANXICO = new LocalidadesBANXICO(...).save(flush: true, failOnError: true)
        //new LocalidadesBANXICO(...).save(flush: true, failOnError: true)
        //new LocalidadesBANXICO(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //localidadesBANXICO.id
    }

    void "test get"() {
        setupData()

        expect:
        localidadesBANXICOService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<LocalidadesBANXICO> localidadesBANXICOList = localidadesBANXICOService.list(max: 2, offset: 2)

        then:
        localidadesBANXICOList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        localidadesBANXICOService.count() == 5
    }

    void "test delete"() {
        Long localidadesBANXICOId = setupData()

        expect:
        localidadesBANXICOService.count() == 5

        when:
        localidadesBANXICOService.delete(localidadesBANXICOId)
        sessionFactory.currentSession.flush()

        then:
        localidadesBANXICOService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        LocalidadesBANXICO localidadesBANXICO = new LocalidadesBANXICO()
        localidadesBANXICOService.save(localidadesBANXICO)

        then:
        localidadesBANXICO.id != null
    }
}
