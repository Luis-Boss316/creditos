package mx.saccsa.creditos

class Telefonos {
    Personas nombre
    Boolean activo
    Boolean principal
    String tipo
    String compania
    String lada
    String telefono
    String extencion
    String observaciones

    static constraints = {
        nombre nullable: false, blank: false
        activo nullable: false, blank: false
        principal nullable: false, blank: false
        tipo nullable: false, blank: false
        compania nullable: false, blank: false
        lada nullable: false, blank: false
        telefono nullable: false, blank: false
        extencion nullable: true, blank: true
        observaciones  nullable: true, blank: true
    }

    static mapping = {
        table('TELEFONOS')
        version(false)
        id generator: "identity"
        nombre name:"nombre", column:"nombre"
        activo name:"activo", column:"activo"
        principal name:"principal", column:"principal"
        tipo name:"tipo", column:"tipo"
        compania name:"compania", column:"compania"
        lada name:"lada", column:"lada"
        telefono name:"telefono", column:"telefono"
        extencion name:"extencion", column:"extencion"
        observaciones name:"observaciones", column:"observaciones"
    }

    static transients = ['descLabel']
    String getDescLabel(){ telefono }
}
