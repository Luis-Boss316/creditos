package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class GrupoFamiliaController extends RestfulController<GrupoFamilia>{
    GrupoFamiliaController() {super (GrupoFamilia)}

    def combo(){
        respond data : GrupoFamilia.list().collect{ [class:GrupoFamilia.class.name, id: it.id, descLabel: it.descLabel]}
    }
    def getDefault(){
        respond data : GrupoFamilia.findByLdefault(true)
    }
}
