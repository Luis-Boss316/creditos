package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposPropiedadController extends RestfulController<TiposPropiedad>{
    TiposPropiedadController() {super (TiposPropiedad)}

    def index() {
        respond TiposPropiedad.list().collect{
            [
                    id: it?.id,
                    claveTipoPropiedad: it?.claveTipoPropiedad,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
