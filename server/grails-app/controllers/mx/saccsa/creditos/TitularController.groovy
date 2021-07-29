package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class TitularController extends RestfulController<Titular>{
    TitularController() {super (Titular)}

}
