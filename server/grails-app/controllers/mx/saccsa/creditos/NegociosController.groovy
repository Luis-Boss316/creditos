package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class NegociosController extends RestfulController<Negocios>{
    NegociosController() {super(Negocios)}

    def index(){
        respond Negocios.list().collect{
            [
                    id: it?.id,
                    nombre: it?.nombre,
                    tipoPersona: it?.tipoPersona,
                    tipoSociedad: it?.tipoSociedad.descLabel,
                    tipoOperacion: it?.tipoOperacion,
                    fechaInicioOperaciones: it?.fechaInicioOperaciones,
                    fechaInicioRegistro: it?.fechaInicioRegistro,
                    actividad: it?.actividad.descLabel,
                    giro: it?.giro.descLabel,
                    establecimiento: it?.establecimiento,
                    nacionalidad: it?.nacionalidad.descLabel,
                    paginaWeb: it?.paginaWeb,
            ]
        }
    }
}
