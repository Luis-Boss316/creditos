package mx.saccsa.creditos

class ProductoFinanciero {
    String producto
    BigDecimal montoMinimo
    BigDecimal montoMaximo
    String tipo
    String clasificacionBancaria
    Monedas moneda
    Boolean activo = false

    static constraints = {
        producto nullable: false, blank: false
        montoMinimo nullable: false, blank: false
        montoMaximo nullable: false, blank: false
        tipo nullable: false, blank: false
        clasificacionBancaria nullable: false, blank: false
        moneda nullable: false, blank: false
        activo nullable: true, blank: true
    }

    static mapping = {
        table('PRODUCTOFINANCIERO')
        version(false)
        id generator: "identity"
        producto name:"producto", column:"producto"
        montoMinimo name:"montoMinimo", column:"montoMinimo"
        montoMaximo name:"montoMaximo", column:"montoMaximo"
        tipo name:"tipo", column:"tipo"
        clasificacionBancaria name:"clasificacionBancaria", column:"clasificacionBancaria"
        moneda name:"moneda", column:"moneda"
        activo name:"activo", column:"activo"
    }

    static transients = ['descLabel']
    String getDescLabel(){ producto }
}
