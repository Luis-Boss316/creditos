package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class AseguradorasServiceSpec extends Specification {

    AseguradorasService aseguradorasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Aseguradoras(...).save(flush: true, failOnError: true)
        //new Aseguradoras(...).save(flush: true, failOnError: true)
        //Aseguradoras aseguradoras = new Aseguradoras(...).save(flush: true, failOnError: true)
        //new Aseguradoras(...).save(flush: true, failOnError: true)
        //new Aseguradoras(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //aseguradoras.id
    }

    void "test get"() {
        setupData()

        expect:
        aseguradorasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Aseguradoras> aseguradorasList = aseguradorasService.list(max: 2, offset: 2)

        then:
        aseguradorasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        aseguradorasService.count() == 5
    }

    void "test delete"() {
        Long aseguradorasId = setupData()

        expect:
        aseguradorasService.count() == 5

        when:
        aseguradorasService.delete(aseguradorasId)
        sessionFactory.currentSession.flush()

        then:
        aseguradorasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Aseguradoras aseguradoras = new Aseguradoras()
        aseguradorasService.save(aseguradoras)

        then:
        aseguradoras.id != null
    }
}
