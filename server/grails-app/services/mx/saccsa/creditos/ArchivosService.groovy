package mx.saccsa.creditos

import grails.gorm.transactions.Transactional
import mx.saccsa.security.Usuario

@Transactional
class ArchivosService {
    def springSecurityService
    def uploadFile(String controlador, String id, String categoria){
        String groupId = 'mx.saccsa.creditos'
        Class c = Class.forName(groupId + "." + controlador.capitalize())
        def registro = c.findById(id as Long)
        def ruta = Parametros.valor('Ruta_Base')
//        String nombreArchivo = ruta + categoria + File.separator + registro.nombre + File.separator
    }

    def getUser(){
        return springSecurityService.getCurrentUser() as Usuario
    }
}
