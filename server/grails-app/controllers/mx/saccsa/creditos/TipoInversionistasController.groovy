package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class TipoInversionistasController extends RestfulController<TipoInversionistas>{
    TipoInversionistasController() {super (TipoInversionistas)}

    def index() {
        respond TipoInversionistas.list().collect{
            [
                    id: it?.cveTipoInversionista,
                    cveTipoInversionista: it?.cveTipoInversionista,
                    descripcion: it?.descripcion,
                    prioridad: it?.prioridad,
                    institucional: it?.institucional,
                    sector: it?.sector,
                    cambioTasa: it?.cambioTasa,
                    pJuridica: it?.pJuridica,
            ]
        }
    }
}
