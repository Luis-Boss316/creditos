package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposBeneficiarioController extends RestfulController<TiposBeneficiario>{
    TiposBeneficiarioController() {super (TiposBeneficiario)}

    def index() {
        respond TiposBeneficiario.list().collect{
            [
                    id: it?.id,
                    claveTipoBeneficiario: it?.claveTipoBeneficiario,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
