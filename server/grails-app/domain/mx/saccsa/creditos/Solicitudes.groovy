package mx.saccsa.creditos

class Solicitudes {
    String tipo
    String nombre
    Date fechaSolicitud
    Sucursales sucursal
    ProductoFinanciero producto
    Empleados ejecutivo
    Empleados promotor
    String concetoInversion
    String numeroAmortizaciones
    Date fechaEntrega
    Date fechaPrimerAmortizacion
    String tasa


    static constraints = {
        tipo nullable: false, blank:false
        nombre nullable: false, blank:false
        fechaSolicitud nullable: false, blank:false
        sucursal nullable: false, blank:false
        producto nullable: false, blank:false
        ejecutivo nullable: false, blank:false
        promotor nullable: false, blank:false
        concetoInversion nullable: false, blank:false
        numeroAmortizaciones nullable: false, blank:false
        fechaEntrega nullable: false, blank:false
        fechaPrimerAmortizacion nullable: false, blank:false
        tasa nullable: false, blank:false
    }

    static mapping = {
        table('SOLICITUDES')
        version(false)
        id generator: "identity"
        tipo name:"tipo", column:"tipo"
        nombre name:"nombre", column:"nombre"
        fechaSolicitud name:"fechaSolicitud", column:"fechaSolicitud"
        sucursal name:"sucursal", column:"sucursal"
        producto name:"producto", column:"producto"
        ejecutivo name:"ejecutivo", column:"ejecutivo"
        promotor name:"promotor", column:"promotor"
        concetoInversion name:"concetoInversion", column:"concetoInversion"
        numeroAmortizaciones name:"numeroAmortizaciones", column:"numeroAmortizaciones"
        fechaEntrega name:"fechaEntrega", column:"fechaEntrega"
        fechaPrimerAmortizacion name:"fechaPrimerAmortizacion", column:"fechaPrimerAmortizacion"
        tasa name:"tasa", column:"tasa"
    }
}
