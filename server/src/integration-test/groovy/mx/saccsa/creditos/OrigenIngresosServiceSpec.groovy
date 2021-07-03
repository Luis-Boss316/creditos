package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class OrigenIngresosServiceSpec extends Specification {

    OrigenIngresosService origenIngresosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new OrigenIngresos(...).save(flush: true, failOnError: true)
        //new OrigenIngresos(...).save(flush: true, failOnError: true)
        //OrigenIngresos origenIngresos = new OrigenIngresos(...).save(flush: true, failOnError: true)
        //new OrigenIngresos(...).save(flush: true, failOnError: true)
        //new OrigenIngresos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //origenIngresos.id
    }

    void "test get"() {
        setupData()

        expect:
        origenIngresosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<OrigenIngresos> origenIngresosList = origenIngresosService.list(max: 2, offset: 2)

        then:
        origenIngresosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        origenIngresosService.count() == 5
    }

    void "test delete"() {
        Long origenIngresosId = setupData()

        expect:
        origenIngresosService.count() == 5

        when:
        origenIngresosService.delete(origenIngresosId)
        sessionFactory.currentSession.flush()

        then:
        origenIngresosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        OrigenIngresos origenIngresos = new OrigenIngresos()
        origenIngresosService.save(origenIngresos)

        then:
        origenIngresos.id != null
    }
}
