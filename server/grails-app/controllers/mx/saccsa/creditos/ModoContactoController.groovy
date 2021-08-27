package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class ModoContactoController extends RestfulController<ModoContacto>{
    ModoContactoController() {super (ModoContacto)}

    def index(){
        respond ModoContacto.list().collect({
            [
                    id: it?.id,
                    valor: it?.valor,
                    descripcion: it?.descripcion,
                    financieraNacional: it?.financieraNacional,
            ]
        })
    }
}
