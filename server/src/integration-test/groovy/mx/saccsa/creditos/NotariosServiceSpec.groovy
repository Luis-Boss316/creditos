package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class NotariosServiceSpec extends Specification {

    NotariosService notariosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Notarios(...).save(flush: true, failOnError: true)
        //new Notarios(...).save(flush: true, failOnError: true)
        //Notarios notarios = new Notarios(...).save(flush: true, failOnError: true)
        //new Notarios(...).save(flush: true, failOnError: true)
        //new Notarios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //notarios.id
    }

    void "test get"() {
        setupData()

        expect:
        notariosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Notarios> notariosList = notariosService.list(max: 2, offset: 2)

        then:
        notariosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        notariosService.count() == 5
    }

    void "test delete"() {
        Long notariosId = setupData()

        expect:
        notariosService.count() == 5

        when:
        notariosService.delete(notariosId)
        sessionFactory.currentSession.flush()

        then:
        notariosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Notarios notarios = new Notarios()
        notariosService.save(notarios)

        then:
        notarios.id != null
    }
}
