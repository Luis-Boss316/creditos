package mx.saccsa.creditos

import grails.rest.RestfulController
//import net.coobird.thumbnailator.Thumbnails
import mx.saccsa.security.Usuario
import org.springframework.dao.DuplicateKeyException

import grails.gorm.transactions.Transactional
import java.sql.SQLException

class KycController extends RestfulController<Kyc> {
    KycController() { super(Kyc) }
    def springSecurityService

    def index() {
        respond Kyc.list().collect {
            [
                    id         : it?.id,
                    ruta       : it?.ruta,
                    tipoArchivo: it?.tipoArchivo,
                    nombre     : it?.nombre.descLabel,
                    fecha      : it?.fecha,
            ]
        }
    }

    @Transactional
    def save() {
        params
        def rutaArchivo
        request.JSON
        def instance = resource.newInstance()
        request.multipartFiles
        if (request.multipartFiles) {
            def file = request.multipartFiles.file[0]
            def ruta = "C:\\Archivos\\" + params.tipoArchivo + "\\"
            if (!file) {
                response.status = 400
                respond mensaje: "El archivo es incorrecto o nulo."
                return
            }
            String tipo = file?.contentType
            def bytesOfFile = file.getBytes()
            def nombre = file.filename
            def directorio = new File(ruta);
            if (!directorio.exists())
                directorio.mkdirs()
            rutaArchivo = ruta + nombre;
            def archivo = new File(rutaArchivo)
            archivo.bytes = bytesOfFile
        } else {
            response.status = 400
            respond mensaje: "No se encontro el archivo"
            return
        }
        instance.ruta = rutaArchivo
        instance.tipoArchivo = params.tipoArchivo
        Usuario user = springSecurityService.getCurrentUser() as Usuario
        instance.nombre = user

        instance.validate()

        if (instance.hasErrors()) {
            transactionStatus.setRollbackOnly()
            respond instance.errors, view: 'create' // STATUS CODE 422
            return
        }

        try {
            instance.save insert: true, flush: true, failOnError: true
        } catch (DuplicateKeyException ignored) {
            transactionStatus.setRollbackOnly()
            response.status = 422
            respond errors: [[message: "Registro duplicado"]]
            return
        } catch (SQLException sql) {
            transactionStatus.setRollbackOnly()
            response.status = 422
            respond errors: [[message: "Error en base de datos: " + sql.message]]
            return
        }
        respond instance
    }

//    def thumbnail(Long id, Long pc){
//        Kyc imageFile = Kyc.findById(id)
//        def ruta = Parametros.valor("RUTA_ARCHIVO")
//        Double poc = pc? (pc/100) : 0.10d
//        response.contentType = imageFile.contentType
//        response.characterEncoding = "UTF-8"
//        Thumbnails.of(ruta+imageFile.ruta)
//                .scale(poc)
//                .toOutputStream(response.outputStream)
//    }
}
