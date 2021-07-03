package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CoberturasGeograficasServiceSpec extends Specification {

    CoberturasGeograficasService coberturasGeograficasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CoberturasGeograficas(...).save(flush: true, failOnError: true)
        //new CoberturasGeograficas(...).save(flush: true, failOnError: true)
        //CoberturasGeograficas coberturasGeograficas = new CoberturasGeograficas(...).save(flush: true, failOnError: true)
        //new CoberturasGeograficas(...).save(flush: true, failOnError: true)
        //new CoberturasGeograficas(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //coberturasGeograficas.id
    }

    void "test get"() {
        setupData()

        expect:
        coberturasGeograficasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CoberturasGeograficas> coberturasGeograficasList = coberturasGeograficasService.list(max: 2, offset: 2)

        then:
        coberturasGeograficasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        coberturasGeograficasService.count() == 5
    }

    void "test delete"() {
        Long coberturasGeograficasId = setupData()

        expect:
        coberturasGeograficasService.count() == 5

        when:
        coberturasGeograficasService.delete(coberturasGeograficasId)
        sessionFactory.currentSession.flush()

        then:
        coberturasGeograficasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CoberturasGeograficas coberturasGeograficas = new CoberturasGeograficas()
        coberturasGeograficasService.save(coberturasGeograficas)

        then:
        coberturasGeograficas.id != null
    }
}
