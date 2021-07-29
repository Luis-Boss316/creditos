package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class PropietarioRealController extends RestfulController<PropietarioReal>{
    PropietarioRealController() {super (PropietarioReal)}


}
