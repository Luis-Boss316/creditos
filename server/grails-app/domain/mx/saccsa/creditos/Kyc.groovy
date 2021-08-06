package mx.saccsa.creditos

import mx.saccsa.security.Usuario

class Kyc {
    String nombre
    String contentType
    String ruta
    Date fecha = new Date()
    String tipoArchivo

    static constraints = {
        nombre nullable: false, blank: false
        contentType nullable: false, blank: false
        ruta nullable: false, blank: false
        fecha nullable: false, blank: false
        tipoArchivo nullable: false, blank: false
    }

    static mapping = {
        table "KYC"
        version false
        id generator: "identity"
        nombre name:"nombre", column:"nombre"
        contentType name:"contentType", column:"contentType"
        ruta name:"ruta", column:"ruta"
        fecha name:"fecha", column:"fecha"
        tipoArchivo name:"tipoArchivo", column: "tipoArchivo"
    }

    static transients = ['descLabel']
    String getDescLabel(){nombre}
}
