package mx.saccsa.creditos

class LocalidadesBANXICO {
    Integer claveLocalidadBanxico
    String descripcion
    Integer numeroEstado
    String descripcionEstado

    static constraints = {
        claveLocalidadBanxico nullable: false, blank:false
        descripcion nullable: false, blank:false
        numeroEstado nullable: false, blank:false
        descripcionEstado nullable: false, blank:false
    }

    static mapping = {
        table "LOCALIDADESBANXICO"
        version false
        id generator: "identity"
        claveLocalidadBanxico name:"claveLocalidadBanxico", column:"claveLocalidadBanxico", size: 0..8
        descripcion name:"descripcion", column:"descripcion", size: 0..60
        numeroEstado name:"numeroEstado", column:"numeroEstado", size: 0..5
        descripcionEstado name:"descripcionEstado", column:"descripcionEstado", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}
