package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class NotariosController extends RestfulController<Notarios>{
    NotariosController() {super (Notarios)}

    def index() {
        respond Notarios.list().collect{
            [
                    id: it?.id,
                    numeroNotario: it?.numeroNotario,
                    apellidoPaternoNotarioTitular: it?.apellidoPaternoNotarioTitular,
                    apellidoMaternoNotarioTitular: it?.apellidoMaternoNotarioTitular,
                    primerNombreNotarioTitular: it?.primerNombreNotarioTitular,
                    segundoNombreNotarioTitular: it?.segundoNombreNotarioTitular,
                    apellidoPaternoNotarioSuplente: it?.apellidoPaternoNotarioSuplente,
                    apellidoMaternoNotarioSuplente: it?.apellidoMaternoNotarioSuplente,
                    primerNombreNotarioSuplente: it?.primerNombreNotarioSuplente,
                    segundoNombreNotarioSuplente: it?.segundoNombreNotarioSuplente,
                    codigoPostalNotario: it?.codigoPostalNotario,
                    calleDomicilioNotario: it?.calleDomicilioNotario,
                    noExteriorNotario: it?.noExteriorNotario,
                    noInteriorNotario: it?.noInteriorNotario,
                    entreCalle: it?.entreCalle,
                    yCalle: it?.yCalle,
                    claveColonia: it?.claveColonia,
                    otraColonia: it?.otraColonia,
                    tipoAsentamiento: it?.tipoAsentamiento,
                    referenciaDomicilio: it?.referenciaDomicilio,
                    claveLadaTelefono1: it?.claveLadaTelefono1,
                    telefono1: it?.telefono1,
                    extensionTelefono1: it?.extensionTelefono1,
                    claveLadaTelefono2: it?.claveLadaTelefono2,
                    telefono2: it?.telefono2,
                    extensionTelefono2: it?.extensionTelefono2,
            ]
        }
    }
}
