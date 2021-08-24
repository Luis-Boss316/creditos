package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class CuentasBancariasDatosGeneralesNegociosServiceSpec extends Specification {

    CuentasBancariasNegociosService cuentasBancariasNegociosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new CuentasBancariasNegocios(...).save(flush: true, failOnError: true)
        //new CuentasBancariasNegocios(...).save(flush: true, failOnError: true)
        //CuentasBancariasNegocios cuentasBancariasNegocios = new CuentasBancariasNegocios(...).save(flush: true, failOnError: true)
        //new CuentasBancariasNegocios(...).save(flush: true, failOnError: true)
        //new CuentasBancariasNegocios(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //cuentasBancariasNegocios.id
    }

    void "test get"() {
        setupData()

        expect:
        cuentasBancariasNegociosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<CuentasBancariasNegocios> cuentasBancariasNegociosList = cuentasBancariasNegociosService.list(max: 2, offset: 2)

        then:
        cuentasBancariasNegociosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        cuentasBancariasNegociosService.count() == 5
    }

    void "test delete"() {
        Long cuentasBancariasNegociosId = setupData()

        expect:
        cuentasBancariasNegociosService.count() == 5

        when:
        cuentasBancariasNegociosService.delete(cuentasBancariasNegociosId)
        sessionFactory.currentSession.flush()

        then:
        cuentasBancariasNegociosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        CuentasBancariasNegocios cuentasBancariasNegocios = new CuentasBancariasNegocios()
        cuentasBancariasNegociosService.save(cuentasBancariasNegocios)

        then:
        cuentasBancariasNegocios.id != null
    }
}
