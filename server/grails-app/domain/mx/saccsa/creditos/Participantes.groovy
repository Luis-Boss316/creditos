package mx.saccsa.creditos

class Participantes {
    String participante
    String puesto
    String porcentajeParticipacion
    String apoderado
    String poder
    Boolean firma

    static constraints = {
        participante nullable: true
        puesto nullable: true
        porcentajeParticipacion nullable: true
        apoderado nullable: true
        poder nullable: true
        firma nullable: true
    }

    static mapping = {
        table('PARTICIPANTES')
        version(false)
        id generator: "identity"
        participante name:"participante", column:"participante"
        puesto name:"puesto", column:"puesto"
        porcentajeParticipacion name:"porcentajeParticipacion", column:"porcentajeParticipacion"
        apoderado name:"apoderado", column:"apoderado"
        poder name:"poder", column:"poder"
        firma name:"firma", column:"firma"
    }

    static transients = ['descLabel']
    String getDescLabel(){ participante }
}
