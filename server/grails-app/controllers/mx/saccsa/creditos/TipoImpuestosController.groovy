package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TipoImpuestosController extends RestfulController<TipoImpuestos>{
    TipoImpuestosController() {super (TipoImpuestos)}

    def index() {
        respond TipoImpuestos.list().collect{
            [
                    id: it?.id,
                    claveImpuesto: it?.claveImpuesto,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
                    base: it?.base,
                    tasa: it?.tasa,
            ]
        }
    }
}
