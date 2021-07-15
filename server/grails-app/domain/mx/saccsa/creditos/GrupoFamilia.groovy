package mx.saccsa.creditos

class GrupoFamilia {
    String clave
    String nombre
    String descripcion
    Boolean ldefault = false


    static constraints = {
        clave size:0..50
        nombre nullable: true, blank: true, size: 0..100
        descripcion nullable: true, blank: true, size: 0..200
        ldefault nullable: true
    }

    static mapping = {
        table "GRUPOFAMILIA"
        version false
        id generator: 'assigned', name:"clave", column:"clave"
        clave name:"clave", column:"clave"
        nombre name:"nombre", column: "nombre"
        descripcion name: "descripcion", column: "descripcion"
        ldefault name:'ldefault', column: 'ldefault'
    }

    static transients = ['descLabel']
    String getDescLabel(){ nombre }

    String getId(){
        clave
    }
}
