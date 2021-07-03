package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TipoPersonaController extends RestfulController<TipoPersona>{
    TipoPersonaController() {super (TipoPersona)}

    def index() {
        respond TipoPersona.list().collect{
            [
                    id: it?.id,
                    claveTipoPersona: it?.claveTipoPersona,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
