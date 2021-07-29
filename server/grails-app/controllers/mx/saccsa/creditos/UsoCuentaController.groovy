package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class UsoCuentaController extends RestfulController<UsoCuenta>{
    UsoCuentaController() {super (UsoCuenta)}


}
