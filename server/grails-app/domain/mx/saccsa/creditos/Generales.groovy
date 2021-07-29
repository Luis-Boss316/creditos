package mx.saccsa.creditos

class Generales {
    //Generales
    Nacionalidades nacionalidadG
    Paises paisG
    String calleG
    String noExteriorG
    String noInteriorG
    String coloniaG
    Municipios alcaldia
    Ciudades ciudadG
    Estados estadosG
    String cpG
    String telefonoParticularG
    String telefonoCelularG
    String email
    String rfcG
    String curpG
    String fiel

    static constraints = {
        //        Generales
        nacionalidadG nullable: true
        paisG nullable: true
        calleG nullable: true
        noExteriorG nullable: true
        noInteriorG nullable: true
        coloniaG nullable: true
        alcaldia nullable: true
        ciudadG nullable: true
        estadosG nullable: true
        cpG nullable: true
        telefonoParticularG nullable: true
        telefonoCelularG nullable: true
        email nullable: true
        rfcG nullable: true
        curpG nullable: true
        fiel nullable: true
    }

    static mapping = {
        //        Generales
        table "Generales"
        version false
        id generator:"identity"
        nacionalidadG name:"nacionalidadG", column:"nacionalidadG"
        paisG name:"paisG", column:"paisG"
        calleG name:"calleG", column:"calleG"
        noExteriorG name:"noExteriorG", column:"noExteriorG"
        noInteriorG name:"noInteriorG", column:"noInteriorG"
        coloniaG name:"coloniaG", column:"coloniaG"
        alcaldia name:"alcaldia", column:"alcaldia"
        ciudadG name:"ciudadG", column:"ciudadG"
        estadosG name:"estadosG", column:"estadosG"
        cpG name:"cpG", column:"cpG"
        telefonoParticularG name:"telefonoParticularG", column:"telefonoParticularG"
        telefonoCelularG name:"telefonoCelularG", column:"telefonoCelularG"
        email name:"email", column:"email"
        rfcG name:"rfcG", column:"rfcG"
        curpG name:"curpG", column:"curpG"
        fiel name:"fiel", column:"fiel"
    }

    static transients = ['descLabel']
    String getDescLabel(){ nacionalidadG }
}
