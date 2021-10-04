package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class CreditoSimpleController extends RestfulController<CreditoSimple>{
    CreditoSimpleController() {super (CreditoSimple)}

}
