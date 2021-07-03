package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class FuentesFondeoController extends RestfulController<FuentesFondeo>{
    FuentesFondeoController() {super (FuentesFondeo)}

    def index() {
        respond FuentesFondeo.list().collect{
            [
                    id: it?.id,
                    claveInstitucionFondeadora: it?.claveInstitucionFondeadora,
                    nombreInstitucionFondeadora: it?.nombreInstitucionFondeadora,
            ]
        }
    }
}
