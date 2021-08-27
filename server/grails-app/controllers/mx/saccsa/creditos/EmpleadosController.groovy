package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class EmpleadosController extends RestfulController<Empleados>{
    EmpleadosController() {super (Empleados)}

    def index() {
        respond Empleados.list().collect({
            [
                    id: it?.id,
                    numeroEmpleado: it?.numeroEmpleado,
                    nombre: it?.nombre,
                    puesto: it?.puesto,
                    sucursal: it?.sucursal.descLabel,
            ]
        })
    }
}
