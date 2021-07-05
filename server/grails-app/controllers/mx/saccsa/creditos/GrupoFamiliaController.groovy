package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class GrupoFamiliaController extends RestfulController<GrupoFamilia>{
    GrupoFamiliaController() {super (GrupoFamilia)}

    def index() {
        respond GrupoFamilia.list().collect{
            [
                    id: it?.id,
                    grupoFamilia: it?.grupoFamilia,
            ]
        }
    }
}
