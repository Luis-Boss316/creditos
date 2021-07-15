package mx.saccsa.creditos

class ActVulnerable {
    String cveActVulnerable
    String descripcion
    Boolean vulnerable = false

    static constraints = {
        cveActVulnerable nullable: false
        descripcion nullable: false
        vulnerable nullable: true
    }

    static mapping = {
        table "ACTVULNERABLE"
        id generator: 'assigned', name:'cveActVulnerable', column:'cveActVulnerable'
        descripcion name:'descripcion', column:'descripcion'
        vulnerable name:'vulnerable', column:'vulnerable'
    }

    static transients = ['descLabel']
    String getDescLabel(){ descripcion }

    String getId(){
        cveActVulnerable
    }
}
