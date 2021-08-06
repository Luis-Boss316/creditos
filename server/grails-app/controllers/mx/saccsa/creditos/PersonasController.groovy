package mx.saccsa.creditos

import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class PersonasController extends RestfulController<Personas>{
    PersonasController() {super(Personas)}

    def index(){
        respond Personas.list().collect{
            [
                    id: it?.id,
                    primerNombre: it?.primerNombre,
                    segundoNombre: it?.segundoNombre,
                    apellidoPaterno: it?.apellidoPaterno,
                    apellidoMaterno: it?.apellidoMaterno,
                    genero: it?.genero,
                    estadoCivil: it?.estadoCivil.descLabel,
                    nacionalidad: it?.nacionalidad.descLabel,
                    fechaNacimiento: it?.fechaNacimiento,
                    actividad: it?.actividad,
                    giro: it?.giro.descLabel,
                    paisNacimiento: it?.paisNacimiento.descLabel,
                    estadoNacimiento: it?.estadoNacimiento.descLabel,
            ]
        }
    }
}
