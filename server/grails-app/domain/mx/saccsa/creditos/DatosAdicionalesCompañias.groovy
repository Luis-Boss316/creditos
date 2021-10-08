package mx.saccsa.creditos

class DatosAdicionalesCompañias {
    String compañiaRetenedora

    static constraints = {
        compañiaRetenedora nullable: false
    }

    static mapping = {
        table('DATOSADICIONALES')
        version(false)
        id generator: 'identity'
        compañiaRetenedora name:"compañiaRetenedora", column:"compañiaRetenedora"
    }
}
