package creditos


import mx.saccsa.security.Usuario
import mx.saccsa.security.UsuarioRole

class InitController {
    static responseFormats = ['json']
    def springSecurityService

    def getsession(){
        def currentUser = springSecurityService.getCurrentUser() as Usuario
        UsuarioRole role = UsuarioRole.findByUsuario(currentUser)
        session.setAttribute('user',currentUser)
        respond username: currentUser.username, role: role.role.authority, avatar: currentUser.avatar, usuario: currentUser.descLabel
    }
}
