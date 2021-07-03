package mx.saccsa.creditos


import grails.rest.RestfulController
import mx.saccsa.security.Role

class RoleController extends RestfulController<Role>{
	static responseFormats = ['json', 'xml']

    RoleController() { super(Role) }

}
