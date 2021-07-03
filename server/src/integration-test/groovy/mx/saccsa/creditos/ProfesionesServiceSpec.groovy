package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ProfesionesServiceSpec extends Specification {

    ProfesionesService profesionesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Profesiones(...).save(flush: true, failOnError: true)
        //new Profesiones(...).save(flush: true, failOnError: true)
        //Profesiones profesiones = new Profesiones(...).save(flush: true, failOnError: true)
        //new Profesiones(...).save(flush: true, failOnError: true)
        //new Profesiones(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //profesiones.id
    }

    void "test get"() {
        setupData()

        expect:
        profesionesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Profesiones> profesionesList = profesionesService.list(max: 2, offset: 2)

        then:
        profesionesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        profesionesService.count() == 5
    }

    void "test delete"() {
        Long profesionesId = setupData()

        expect:
        profesionesService.count() == 5

        when:
        profesionesService.delete(profesionesId)
        sessionFactory.currentSession.flush()

        then:
        profesionesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Profesiones profesiones = new Profesiones()
        profesionesService.save(profesiones)

        then:
        profesiones.id != null
    }
}
