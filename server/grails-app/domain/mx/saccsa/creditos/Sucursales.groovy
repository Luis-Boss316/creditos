package mx.saccsa.creditos

class Sucursales {
    String sucursal
    String responsable
    String puesto
    String domicilio
    String telefono
    String correo

    static constraints = {
        sucursal nullable: false, blank: false
        responsable nullable: false, blank: false
        puesto nullable: false, blank: false
        domicilio nullable: false, blank: false
        telefono nullable: false, blank: false
        correo nullable: false, blank: false
    }

    static mapping = {
        table('SUCURSALES')
        version(false)
        id generator: "identity"
        sucursal name:"sucursal", column:"sucursal"
        responsable name:"responsable", column:"responsable"
        puesto name:"puesto", column:"puesto"
        domicilio name:"domicilio", column:"domicilio"
        telefono name:"telefono", column:"telefono"
        correo name: "correo", column:"correo"
    }

    static transients = ['descLabel']
    String getDescLabel(){ sucursal }
}
