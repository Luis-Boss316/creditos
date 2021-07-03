package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class AseguradorasController extends RestfulController<Aseguradoras>{
    AseguradorasController() {super (Aseguradoras)}

    def index() {
        respond Aseguradoras.list().collect{
            [
                    id: it?.id,
                    claveAseguradoraSeguro: it?.claveAseguradoraSeguro,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
