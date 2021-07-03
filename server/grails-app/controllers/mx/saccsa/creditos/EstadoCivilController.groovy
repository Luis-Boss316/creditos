package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class EstadoCivilController extends RestfulController<EstadoCivil>{
    EstadoCivilController() {super (EstadoCivil)}

    def index()  {
        respond EstadoCivil.list().collect{
            [
                    id: it?.id,
                    claveEstadoCivil: it?.claveEstadoCivil,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
                    casado: it?.casado?'Si':'No',
            ]
        }
    }
}
