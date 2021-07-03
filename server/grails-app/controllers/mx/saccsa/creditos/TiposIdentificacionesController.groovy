package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposIdentificacionesController extends RestfulController<TiposIdentificaciones>{
    TiposIdentificacionesController() {super (TiposIdentificaciones)}

    def index() {
        respond TiposIdentificaciones.list().collect{
            [
                    id: it?.id,
                    claveTipoIdentificacion: it?.claveTipoIdentificacion,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
