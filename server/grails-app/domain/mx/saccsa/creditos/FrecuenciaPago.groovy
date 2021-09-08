package mx.saccsa.creditos

class FrecuenciaPago {
    String dias
    String frecuenciaPago
    String cnbv
    String bc
    String cc

    static constraints = {
        dias nullable:false, blank:false
        frecuenciaPago nullable:false, blank:false
        cnbv nullable:true, blank:true
        bc nullable:true, blank:true
        cc nullable:true, blank:true
    }

    static mapping = {
        table('FRECUENCIAPAGO')
        version(false)
        id generator: "identity"
        dias name:"dias", column:"dias"
        frecuenciaPago name:"frecuenciaPago", column:"frecuenciaPago"
        cnbv name:"cnbv", column:"cnbv"
        bc name:"bc", column:"bc"
        cc name:"cc", column:"cc"
    }

    static transients = ['descLabel']
    String getDescLabel(){ frecuenciaPago }
}
