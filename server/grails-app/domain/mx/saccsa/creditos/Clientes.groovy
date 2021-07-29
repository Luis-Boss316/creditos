package mx.saccsa.creditos

class Clientes {
    Titular titular
    Cotitular cotitular
    ProcedenciaRecursos procedenciaRecursos
    ProveedorRecursos proveedorRecursos
    PropietarioReal propietarioReal
    UsoCuenta usoCuenta
    Generales generales

//Chequeras
//    String institucion
//    String cuenta
//    String titular
//    String clabe
//    String broker

//PPE
//    Boolean personaPoliticamenteExpuesta
//    String ambito


    static constraints = {
        titular nullable: true
        cotitular nullable: true
        procedenciaRecursos nullable: true
        proveedorRecursos nullable: true
        propietarioReal nullable: true
        usoCuenta nullable: true
        generales nullable: true

//        Chequeras
//        institucion nullable: true
//        cuenta nullable: true
//        titular nullable: true
//        clabe nullable: true
//        broker nullable: true

//        PPE
//        personaPoliticamenteExpuesta nullable: true
//        ambito nullable: true
    }

    static mapping = {
        table "Clientes"
        version false
        id generator:"identity"
        titular name:"titular", column:"titular"
        cotitular name:"cotitular", column:"cotitular"
        procedenciaRecursos name:"procedenciaRecursos", column:"procedenciaRecursos"
        proveedorRecursos name:"proveedorRecursos", column:"proveedorRecursos"
        propietarioReal name:"propietarioReal", column:"propietarioReal"
        usoCuenta name:"usoCuenta", column:"usoCuenta"
        generales name:"generales", column:"generales"

//        Chequeas
//        institucion name:"institucion", column:"institucion"
//        cuenta name:"cuenta", column:"cuenta"
//        titular name:"titular", column:"titular"
//        clabe name:"clabe", column:"clabe"
//        broker name:"broker", column:"broker"

//        PPE
//        personaPoliticamenteExpuesta name:"personaPoliticamenteExpuesta", column:"personaPoliticamenteExpuesta"
//        ambito name:"ambito", column:"ambito"
    }

    static transients = ['descLabel']
    String getDescLabel(){ titular }
}
