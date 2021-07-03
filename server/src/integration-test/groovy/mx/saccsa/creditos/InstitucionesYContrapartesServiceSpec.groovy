package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class InstitucionesYContrapartesServiceSpec extends Specification {

    InstitucionesYContrapartesService institucionesYContrapartesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new InstitucionesYContrapartes(...).save(flush: true, failOnError: true)
        //new InstitucionesYContrapartes(...).save(flush: true, failOnError: true)
        //InstitucionesYContrapartes institucionesYContrapartes = new InstitucionesYContrapartes(...).save(flush: true, failOnError: true)
        //new InstitucionesYContrapartes(...).save(flush: true, failOnError: true)
        //new InstitucionesYContrapartes(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //institucionesYContrapartes.id
    }

    void "test get"() {
        setupData()

        expect:
        institucionesYContrapartesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<InstitucionesYContrapartes> institucionesYContrapartesList = institucionesYContrapartesService.list(max: 2, offset: 2)

        then:
        institucionesYContrapartesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        institucionesYContrapartesService.count() == 5
    }

    void "test delete"() {
        Long institucionesYContrapartesId = setupData()

        expect:
        institucionesYContrapartesService.count() == 5

        when:
        institucionesYContrapartesService.delete(institucionesYContrapartesId)
        sessionFactory.currentSession.flush()

        then:
        institucionesYContrapartesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        InstitucionesYContrapartes institucionesYContrapartes = new InstitucionesYContrapartes()
        institucionesYContrapartesService.save(institucionesYContrapartes)

        then:
        institucionesYContrapartes.id != null
    }
}
