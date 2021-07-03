package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class MunicipiosController extends RestfulController<Municipios>{
    MunicipiosController() {super (Municipios)}

    def index() {
        respond Municipios.list().collect(){
            [
                    id: it?.id,
                    numeroMunicipio: it?.numeroMunicipio,
                    numeroEstado: it?.numeroEstado,
                    numeroPais: it?.numeroPais,
                    descripcionCorta: it?.descripcionCorta,
                    descripcionEstado: it?.descripcionEstado,
            ]
        }
    }
}
