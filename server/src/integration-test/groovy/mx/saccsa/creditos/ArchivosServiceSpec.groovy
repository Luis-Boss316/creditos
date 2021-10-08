package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ArchivosServiceSpec extends Specification {

    ArchivosService archivosService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Archivos(...).save(flush: true, failOnError: true)
        //new Archivos(...).save(flush: true, failOnError: true)
        //Archivos archivos = new Archivos(...).save(flush: true, failOnError: true)
        //new Archivos(...).save(flush: true, failOnError: true)
        //new Archivos(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //archivos.id
    }

    void "test get"() {
        setupData()

        expect:
        archivosService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Archivos> archivosList = archivosService.list(max: 2, offset: 2)

        then:
        archivosList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        archivosService.count() == 5
    }

    void "test delete"() {
        Long archivosId = setupData()

        expect:
        archivosService.count() == 5

        when:
        archivosService.delete(archivosId)
        sessionFactory.currentSession.flush()

        then:
        archivosService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Archivos archivos = new Archivos()
        archivosService.save(archivos)

        then:
        archivos.id != null
    }
}
