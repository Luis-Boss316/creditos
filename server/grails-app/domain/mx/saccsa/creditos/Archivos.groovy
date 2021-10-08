package mx.saccsa.creditos

import mx.saccsa.security.Usuario

class Archivos {
    String ruta
    Usuario usuarioAlta
    String contentType
    String categoria
    String descripcion
    String nombre
    Date fechaAlta = new Date()
    String controlador
    String idControlador

    static constraints = {
        ruta nullable: false, blank: false
        usuarioAlta nullable: false, blank: false
        contentType nullable: false, blank: false
        descripcion nullable: false, blank: false
        categoria nullable: false, blank: false
        nombre nullable: false, blank: false
        fechaAlta nullable: false, blank: false
        controlador nullable: false, blank: false
        idControlador nullable: false, blank: false
    }

    static mapping = {
        table('Archivos')
        version(true)
        id generator: 'identity'
        ruta column: 'ruta', name: 'ruta'
        usuarioAlta column: 'usuarioAlta', name: 'usuarioAlta'
        contentType column: 'contentType', name: 'contentType'
        descripcion column: 'descripcion', name: 'descripcion'
        categoria column: 'categoria', name: 'categoria'
        nombre column: 'nombre', name: 'nombre'
        fechaAlta column: 'fechaAlta', name: 'fechaAlta'
        controlador column: 'controlador', name: 'controlador'
        idControlador column: 'idControlador', name: 'idControlador'
    }
}
