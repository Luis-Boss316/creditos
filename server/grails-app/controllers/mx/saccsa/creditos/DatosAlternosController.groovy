package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class DatosAlternosController extends RestfulController<DatosAlternos>{
    DatosAlternosController() {super (DatosAlternos)}

    def index(){
        respond DatosAlternos.list().collect{
            [
                    id: it?.id,
                    nombre: it?.nombre.descLabel,
                    primerNombre: it?.primerNombre,
                    segundoNombre: it?.segundoNombre,
                    apellidoPaterno: it?.apellidoPaterno,
                    apellidoMaterno: it?.apellidoMaterno,
            ]
        }
    }
}
