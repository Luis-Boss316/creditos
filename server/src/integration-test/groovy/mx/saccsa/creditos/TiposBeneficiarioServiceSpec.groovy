package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class TiposBeneficiarioServiceSpec extends Specification {

    TiposBeneficiarioService tiposBeneficiarioService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new TiposBeneficiario(...).save(flush: true, failOnError: true)
        //new TiposBeneficiario(...).save(flush: true, failOnError: true)
        //TiposBeneficiario tiposBeneficiario = new TiposBeneficiario(...).save(flush: true, failOnError: true)
        //new TiposBeneficiario(...).save(flush: true, failOnError: true)
        //new TiposBeneficiario(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //tiposBeneficiario.id
    }

    void "test get"() {
        setupData()

        expect:
        tiposBeneficiarioService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<TiposBeneficiario> tiposBeneficiarioList = tiposBeneficiarioService.list(max: 2, offset: 2)

        then:
        tiposBeneficiarioList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        tiposBeneficiarioService.count() == 5
    }

    void "test delete"() {
        Long tiposBeneficiarioId = setupData()

        expect:
        tiposBeneficiarioService.count() == 5

        when:
        tiposBeneficiarioService.delete(tiposBeneficiarioId)
        sessionFactory.currentSession.flush()

        then:
        tiposBeneficiarioService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        TiposBeneficiario tiposBeneficiario = new TiposBeneficiario()
        tiposBeneficiarioService.save(tiposBeneficiario)

        then:
        tiposBeneficiario.id != null
    }
}
