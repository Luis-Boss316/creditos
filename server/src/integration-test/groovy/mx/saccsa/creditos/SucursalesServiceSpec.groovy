package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class SucursalesServiceSpec extends Specification {

    SucursalesService sucursalesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Sucursales(...).save(flush: true, failOnError: true)
        //new Sucursales(...).save(flush: true, failOnError: true)
        //Sucursales sucursales = new Sucursales(...).save(flush: true, failOnError: true)
        //new Sucursales(...).save(flush: true, failOnError: true)
        //new Sucursales(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //sucursales.id
    }

    void "test get"() {
        setupData()

        expect:
        sucursalesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Sucursales> sucursalesList = sucursalesService.list(max: 2, offset: 2)

        then:
        sucursalesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        sucursalesService.count() == 5
    }

    void "test delete"() {
        Long sucursalesId = setupData()

        expect:
        sucursalesService.count() == 5

        when:
        sucursalesService.delete(sucursalesId)
        sessionFactory.currentSession.flush()

        then:
        sucursalesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Sucursales sucursales = new Sucursales()
        sucursalesService.save(sucursales)

        then:
        sucursales.id != null
    }
}
