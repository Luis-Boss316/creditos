package spring
import grails.plugin.springsecurity.SpringSecurityUtils
import saccsa.security.BearerTokenAuthenticationFailureHandler
import saccsa.security.GormTokenStorageService
import saccsa.security.UsuarioPasswordEncoderListener
// Place your Spring DSL code here
beans = {
    usuarioPasswordEncoderListener(UsuarioPasswordEncoderListener, ref('hibernateDatastore'))
    localeResolver(org.springframework.web.servlet.i18n.SessionLocaleResolver) {
        defaultLocale = new Locale("es","MX")
        java.util.Locale.setDefault(defaultLocale)
    }
    def conf = SpringSecurityUtils.securityConfig
    if (!conf || !conf.active) {
        return
    }

    restAuthenticationFailureHandler(BearerTokenAuthenticationFailureHandler){
        tokenReader = ref('tokenReader')
    }

    tokenStorageService(GormTokenStorageService) {
        userDetailsService = ref('userDetailsService')
    }
}
