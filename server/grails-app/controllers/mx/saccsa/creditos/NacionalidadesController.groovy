package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class NacionalidadesController extends RestfulController<Nacionalidades>{
    NacionalidadesController() {super (Nacionalidades)}

    def index() {
        respond Nacionalidades.list().collect{
            [
                    id: it?.id,
                    claveNacionalidad: it?.claveNacionalidad,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
