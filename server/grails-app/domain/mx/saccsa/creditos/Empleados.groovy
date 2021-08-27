package mx.saccsa.creditos

class Empleados {
    Long numeroEmpleado
    String nombre
    String puesto
    Sucursales sucursal

    static constraints = {
        numeroEmpleado nullable: false, blank: false
        nombre nullable: false, blank: false
        puesto nullable: false, blank: false
        sucursal nullable: false, blank: false
    }

    static mapping = {
        table('EMPLEADOS')
        version(false)
        id generator: "identity"
        numeroEmpleado name:"numeroEmpleado", column:"numeroEmpleado"
        nombre name:"nombre", column:"nombre"
        puesto name:"puesto", column:"puesto"
        sucursal name:"sucursal", column:"sucursal"
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombre }
}
