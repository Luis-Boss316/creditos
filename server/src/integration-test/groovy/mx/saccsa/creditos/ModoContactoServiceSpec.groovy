package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ModoContactoServiceSpec extends Specification {

    ModoContactoService modoContactoService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new ModoContacto(...).save(flush: true, failOnError: true)
        //new ModoContacto(...).save(flush: true, failOnError: true)
        //ModoContacto modoContacto = new ModoContacto(...).save(flush: true, failOnError: true)
        //new ModoContacto(...).save(flush: true, failOnError: true)
        //new ModoContacto(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //modoContacto.id
    }

    void "test get"() {
        setupData()

        expect:
        modoContactoService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<ModoContacto> modoContactoList = modoContactoService.list(max: 2, offset: 2)

        then:
        modoContactoList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        modoContactoService.count() == 5
    }

    void "test delete"() {
        Long modoContactoId = setupData()

        expect:
        modoContactoService.count() == 5

        when:
        modoContactoService.delete(modoContactoId)
        sessionFactory.currentSession.flush()

        then:
        modoContactoService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        ModoContacto modoContacto = new ModoContacto()
        modoContactoService.save(modoContacto)

        then:
        modoContacto.id != null
    }
}
