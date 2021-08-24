package mx.saccsa.creditos

import grails.testing.mixin.integration.Integration
import grails.gorm.transactions.Rollback
import spock.lang.Specification
import org.hibernate.SessionFactory

@Integration
@Rollback
class ParticipantesServiceSpec extends Specification {

    ParticipantesService participantesService
    SessionFactory sessionFactory

    private Long setupData() {
        // TODO: Populate valid domain instances and return a valid ID
        //new Participantes(...).save(flush: true, failOnError: true)
        //new Participantes(...).save(flush: true, failOnError: true)
        //Participantes participantes = new Participantes(...).save(flush: true, failOnError: true)
        //new Participantes(...).save(flush: true, failOnError: true)
        //new Participantes(...).save(flush: true, failOnError: true)
        assert false, "TODO: Provide a setupData() implementation for this generated test suite"
        //participantes.id
    }

    void "test get"() {
        setupData()

        expect:
        participantesService.get(1) != null
    }

    void "test list"() {
        setupData()

        when:
        List<Participantes> participantesList = participantesService.list(max: 2, offset: 2)

        then:
        participantesList.size() == 2
        assert false, "TODO: Verify the correct instances are returned"
    }

    void "test count"() {
        setupData()

        expect:
        participantesService.count() == 5
    }

    void "test delete"() {
        Long participantesId = setupData()

        expect:
        participantesService.count() == 5

        when:
        participantesService.delete(participantesId)
        sessionFactory.currentSession.flush()

        then:
        participantesService.count() == 4
    }

    void "test save"() {
        when:
        assert false, "TODO: Provide a valid instance to save"
        Participantes participantes = new Participantes()
        participantesService.save(participantes)

        then:
        participantes.id != null
    }
}
