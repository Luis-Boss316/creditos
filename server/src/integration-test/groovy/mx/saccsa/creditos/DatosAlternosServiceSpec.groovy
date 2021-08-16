package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DatosAlternosServiceSpec extends Specification {

    DatosAlternosService datosAlternosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new DatosAlternos(...).save(flush: true, failOnError: true)
        //new DatosAlternos(...).save(flush: true, failOnError: true)
        //DatosAlternos datosAlternos = new DatosAlternos(...).save(flush: true, failOnError: true)
        //new DatosAlternos(...).save(flush: true, failOnError: true)
        //new DatosAlternos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //datosAlternos.id
    }

    void "test get"() {
        setupData()

        expect:
        datosAlternosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<DatosAlternos> datosAlternosList = datosAlternosService.list(max: 2, offset: 2)

        then:
        datosAlternosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        datosAlternosService.count() == 5
    }

    void "test delete"() {
        Long datosAlternosId = setupData()

        expect:
        datosAlternosService.count() == 5

        when:
        datosAlternosService.delete(datosAlternosId)
        sessionFactory.currentSession.flush()

        then:
        datosAlternosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        DatosAlternos datosAlternos = new DatosAlternos()
        datosAlternosService.save(datosAlternos)

        then:
        datosAlternos.id != null
    }
}
