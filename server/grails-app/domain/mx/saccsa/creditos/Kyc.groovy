package mx.saccsa.creditos

import mx.saccsa.security.Usuario

class Kyc {
    String ruta
    String tipoArchivo
    Usuario nombre
    Date fecha = new Date()

    static constraints = {
        ruta nullable: false, blank: false
        tipoArchivo nullable: false, blank: false
        nombre nullable: false, blank: false
        fecha nullable: false, blank: false
    }

    static mapping = {
        table "KYC"
        version false
        id generator: "identity"
        ruta name:"ruta", column:"ruta"
        tipoArchivo name:"tipoArchivo", column:"tipoArchivo"
        nombre name:"nombre", column:"nombre"
        fecha name:"fecha", column:"fecha"
    }

    static transients = ['descLabel']
    String getDescLabel(){ usuario.nombre + fecha }
}
