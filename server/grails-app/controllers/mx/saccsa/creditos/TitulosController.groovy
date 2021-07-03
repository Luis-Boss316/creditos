package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TitulosController extends RestfulController<Titulos>{
    TitulosController() {super (Titulos)}

    def index() {
        respond Titulos.list().collect{
            [
                    id: it?.id,
                    claveTipoPropiedad: it?.claveTipoPropiedad,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
