package mx.saccsa.creditos


import grails.rest.RestfulController
import mx.saccsa.security.RoleDetalle

class RoleDetalleController extends RestfulController<RoleDetalle>{
	static responseFormats = ['json', 'xml']

    RoleDetalleController() { super(RoleDetalle) }
}
