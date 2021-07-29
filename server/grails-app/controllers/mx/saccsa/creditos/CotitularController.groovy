package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class CotitularController extends RestfulController<Cotitular>{
    CotitularController() {super (Cotitular)}


}
