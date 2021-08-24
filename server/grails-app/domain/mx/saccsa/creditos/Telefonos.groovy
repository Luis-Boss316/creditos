package mx.saccsa.creditos

class Telefonos {
    Boolean activo1
    Boolean principal1
    String tipo1
    String compania
    String lada
    String telefono
    String extencion
    String observaciones

    static constraints = {
        activo1 nullable: true
        principal1 nullable: true
        tipo1 nullable: true
        compania nullable: true
        lada nullable: true
        telefono nullable: true
        extencion nullable: true
        observaciones  nullable: true
    }

    static mapping = {
        table('TELEFONOS')
        version(false)
        id generator: "identity"
        activo1 name:"activo", column:"activo"
        principal1 name:"principal", column:"principal"
        tipo1 name:"tipo", column:"tipo"
        compania name:"compania", column:"compania"
        lada name:"lada", column:"lada"
        telefono name:"telefono", column:"telefono"
        extencion name:"extencion", column:"extencion"
        observaciones name:"observaciones", column:"observaciones"
    }

    static transients = ['descLabel']
    String getDescLabel(){ telefono }
}
