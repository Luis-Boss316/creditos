package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class DatosAdicionalesCompañiasServiceSpec extends Specification {

    DatosAdicionalesCompañiasService datosAdicionalesCompañiasService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new DatosAdicionalesCompañias(...).save(flush: true, failOnError: true)
        //new DatosAdicionalesCompañias(...).save(flush: true, failOnError: true)
        //DatosAdicionalesCompañias datosAdicionalesCompañias = new DatosAdicionalesCompañias(...).save(flush: true, failOnError: true)
        //new DatosAdicionalesCompañias(...).save(flush: true, failOnError: true)
        //new DatosAdicionalesCompañias(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //datosAdicionalesCompañias.id
    }

    void "test get"() {
        setupData()

        expect:
        datosAdicionalesCompañiasService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<DatosAdicionalesCompañias> datosAdicionalesCompañiasList = datosAdicionalesCompañiasService.list(max: 2, offset: 2)

        then:
        datosAdicionalesCompañiasList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        datosAdicionalesCompañiasService.count() == 5
    }

    void "test delete"() {
        Long datosAdicionalesCompañiasId = setupData()

        expect:
        datosAdicionalesCompañiasService.count() == 5

        when:
        datosAdicionalesCompañiasService.delete(datosAdicionalesCompañiasId)
        sessionFactory.currentSession.flush()

        then:
        datosAdicionalesCompañiasService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        DatosAdicionalesCompañias datosAdicionalesCompañias = new DatosAdicionalesCompañias()
        datosAdicionalesCompañiasService.save(datosAdicionalesCompañias)

        then:
        datosAdicionalesCompañias.id != null
    }
}
