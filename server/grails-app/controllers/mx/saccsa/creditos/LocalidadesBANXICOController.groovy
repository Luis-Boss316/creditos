package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class LocalidadesBANXICOController extends RestfulController<LocalidadesBANXICO>{
    LocalidadesBANXICOController() {super (LocalidadesBANXICO)}

    def index() {
        respond LocalidadesBANXICO.list().collect{
            [
                    id: it?.id,
                    claveLocalidadBanxico: it?.claveLocalidadBanxico,
                    descripcion: it?.descripcion,
                    numeroEstado: it?.numeroEstado,
                    descripcionEstado: it?.descripcionEstado,
            ]
        }
    }
}
