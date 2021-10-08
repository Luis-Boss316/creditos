package mx.saccsa.creditos

class CreditoSimple {
    String tipo
    String nombre
    String ocupacion
    String sucursal
    String producto
    String conceptoInversion
    Date fechaContrato
    String numeroContrato
    String ejecutivo
    String promotor
    String frecuenciaPago
    String numeroAmortizacion
    String cat
    String montoNeto
    String estatus
    String etiquetas

    static constraints = {
        tipo nullable: true, blank: true
        nombre nullable: true, blank: true
        ocupacion nullable: true, blank: true
        sucursal nullable: true, blank: true
        producto nullable: true, blank: true
        conceptoInversion nullable: true, blank: true
        fechaContrato nullable: true, blank: true
        numeroContrato nullable: true, blank: true
        ejecutivo nullable: true, blank: true
        promotor nullable: true, blank: true
        frecuenciaPago nullable: true, blank: true
        numeroAmortizacion nullable: true, blank: true
        cat nullable: true, blank: true
        montoNeto nullable: true, blank: true
        estatus nullable: true, blank: true
        etiquetas nullable: true, blank: true
    }

    static mapping = {
        table('CREDITOSIMPLE')
        version(false)
        id generator: "identity"
        tipo name:"tipo", column:"tipo"
        nombre name:"nombre", column:"nombre"
        ocupacion name:"ocupacion", column:"ocupacion"
        sucursal name:"sucursal", column:"sucursal"
        producto name:"producto", column:"producto"
        conceptoInversion name:"conceptoInversion", column:"conceptoInversion"
        fechaContrato name:"fechaContrato", column:"fechaContrato"
        numeroContrato name:"numeroContrato", column:"numeroContrato"
        ejecutivo name:"ejecutivo", column:"ejecutivo"
        promotor name:"promotor", column:"promotor"
        frecuenciaPago name:"frecuenciaPago", column:"frecuenciaPago"
        numeroAmortizacion name:"numeroAmortizacion", column:"numeroAmortizacion"
        cat name:"cat", column:"cat"
        montoNeto name:"montoNeto", column:"montoNeto"
        estatus name:"estatus", column:"estatus"
        etiquetas name:"etiquetas", column:"etiquetas"
    }
}
