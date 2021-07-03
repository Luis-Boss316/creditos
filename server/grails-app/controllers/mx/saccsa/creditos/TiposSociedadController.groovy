package mx.saccsa.creditos

import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposSociedadController extends RestfulController<TiposSociedad>{
    TiposSociedadController() {super (TiposSociedad)}

    def index() {
        respond TiposSociedad.list().collect{
            [
                    id: it?.id,
                    claveTipoSociedad: it?.claveTipoSociedad,
                    descripcion: it?.descripcion,
                    descripcionLarga: it?.descripcionLarga,
            ]
        }
    }
}
