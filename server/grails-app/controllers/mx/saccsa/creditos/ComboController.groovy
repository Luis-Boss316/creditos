package mx.saccsa.creditos


import grails.rest.*
import grails.converters.*

class ComboController {
	static responseFormats = ['json', 'xml']
    def springSecurityService

    def comboController(String id) {
        String groupId = 'mx.saccsa.creditos'
        Class c = Class.forName(groupId + "." + id.capitalize())
        def data = c.list().collect {
            [
                    id         : it.id,
                    descripcion: it.descLabel
            ]
        }
        respond data
    }

    def comboSecurity(String id) {
        String groupId = 'mx.saccsa.security'
        Class c = Class.forName(groupId + "." + id.capitalize())
        def data = c.list().collect {
            [
                    id         : it.ident(),
                    descripcion: it.descLabel
            ]
        }
        respond data
    }
}
