package mx.saccsa.creditos

class Prospectos {
    String tipo
    String nombre
    ModoContacto modoDeContacto
    ModoContacto comoSeEntero
    Sucursales sucursal
    Empleados ejecutivo
    Empleados promotor
    ProductoFinanciero producto
    String monto


    static constraints = {
        tipo nullable: false, blank: false
        nombre nullable: false, blank: false
        modoDeContacto nullable: false, blank: false
        comoSeEntero nullable: false, blank: false
        sucursal nullable: false, blank: false
        ejecutivo nullable: false, blank: false
        promotor nullable: false, blank: false
        producto nullable: false, blank: false
        monto nullable: false, blank: false
    }

    static mapping = {
        table('PROSPECTOS')
        version(false)
        id generator: "identity"
        tipo name:"tipo", column:"tipo"
        nombre name:"nombre", column:"nombre"
        modoDeContacto name:"modoDeContacto", column:"modoDeContacto"
        comoSeEntero name:"comoSeEntero", column:"comoSeEntero"
        sucursal name:"sucursal", column:"sucursal"
        ejecutivo name:"ejecutivo", column:"ejecutivo"
        promotor name:"promotor", column:"promotor"
        producto name:"producto", column:"producto"
        monto name:"monto", column:"monto"
    }

    static transients = ['descLabel']
    String getDescLabel(){ tipo + nombre }
}
