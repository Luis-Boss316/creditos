package mx.saccsa.creditos

class Parametros {
    String parametro
    String valor

    static constraints = {
        parametro unique: true
    }

    static mapping = {
        table "PARAMETROS"
        version false
        id generator: 'assigned', name:"parametro", column:"parametro"
    }

    static valor(String parametro) {
        findByParametro(parametro)?.valor ?: null
    }
}
