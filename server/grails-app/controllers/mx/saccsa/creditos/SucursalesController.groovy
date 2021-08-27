package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class SucursalesController extends RestfulController<Sucursales>{
    SucursalesController() {super (Sucursales)}

    def index()  {
        respond Sucursales.list().collect({
            [
                    id: it?.id,
                    sucursal: it?.sucursal,
                    responsable: it?.responsable,
                    puesto: it?.puesto,
                    domicilio: it?.domicilio,
                    telefono: it?.telefono,
                    correo: it?.correo,
            ]
        })
    }
}
