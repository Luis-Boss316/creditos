package mx.saccsa.creditos

class Personas {
    DatosGeneralesPersonas persona
    DatosAlternos datos
    DatosBancarios bancarios
    Correos correo
    Contactos contacto
    Telefonos telefono

    static constraints = {
        persona nullable: true
        datos nullable: true
        bancarios nullable: true
        correo nullable: true
        contacto nullable: true
        telefono nullable: true
    }

    static mapping = {
        table('PERSONAS')
        version(false)
        id generator:"identity"
        persona name:"personas", column:"personas"
        datos name:"datos", column:"datos"
        bancarios name:"bancarios", column:"bancarios"
        correo name:"correo", column:"correo"
        contacto name:"contacto", column:"contacto"
        telefono name:"telefono", column:"telefono"
    }

    static transients = ['descLabel']
    String getDescLabel(){ persona.descLabel }
}
