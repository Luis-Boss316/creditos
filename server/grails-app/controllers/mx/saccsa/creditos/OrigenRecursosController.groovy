package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class OrigenRecursosController extends RestfulController<OrigenRecursos>{
    OrigenRecursosController() {super (OrigenRecursos)}

    def index() {
        respond OrigenRecursos.list().collect{
            [
                    id: it?.id,
                    claveOrigenRecursosCuenta: it?.claveOrigenRecursosCuenta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
