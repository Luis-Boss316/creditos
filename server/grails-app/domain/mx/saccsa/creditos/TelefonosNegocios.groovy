package mx.saccsa.creditos

class TelefonosNegocios {
    Boolean activo
    Boolean principal
    String tipo
    String compania
    String lada
    String telefono
    String extencion
    String observaciones

    static constraints = {
        activo nullable: true
        principal nullable: true
        tipo nullable: true
        compania nullable: true
        lada nullable: true
        telefono nullable: true
        extencion nullable: true
        observaciones  nullable: true
    }

    static mapping = {
        table('TELEFONOSNEGOCIOS')
        version(false)
        id generator: "identity"
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
