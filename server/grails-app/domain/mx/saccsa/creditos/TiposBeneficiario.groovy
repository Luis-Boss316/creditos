package mx.saccsa.creditos

class TiposBeneficiario {
    Integer claveTipoBeneficiario
    String descripcion

    static constraints = {
        claveTipoBeneficiario nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "TIPOSBENEFICIARIO"
        version false
        id generator: "identity"
        claveTipoBeneficiario name:"claveTipoBeneficiario", column:"claveTipoBeneficiario", size: 0..3
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
