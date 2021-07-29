package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class GeneralesController extends RestfulController<Generales>{
    GeneralesController() {super (Generales)}


}
