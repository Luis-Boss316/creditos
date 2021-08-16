package mx.saccsa.creditos

class SectoresEconomicos {
    Integer claveSectorEconomico
    String descripcion

    static constraints = {
        claveSectorEconomico nullable: false, blank: false
        descripcion nullable: false, blank: false
    }

    static mapping = {
        table "SECTORESECONOMICOS"
        version false
        id generator: "identity"
        claveSectorEconomico name:"claveSectorEconomico", column:"claveSectorEconomico", size: 0..2
        descripcion name:"descripcion", column:"descripcion", size: 0..60
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }
}


