package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ClavesLadaController extends RestfulController<ClavesLada>{
    ClavesLadaController() {super (ClavesLada)}

    def index() {
        respond ClavesLada.list().collect{
            [
                    id: it?.id,
                    numeroClaveLada: it?.numeroClaveLada,
                    claveLadaActual: it?.claveLadaActual,
                    localidadTelmex: it?.localidadTelmex,
                    claveLocalidad: it?.claveLocalidad,
            ]
        }
    }
}
