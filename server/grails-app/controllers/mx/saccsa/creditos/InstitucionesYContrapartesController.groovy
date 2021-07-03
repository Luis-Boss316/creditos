package mx.saccsa.creditos

import grails.rest.RestfulController
import grails.validation.ValidationException
import static org.springframework.http.HttpStatus.CREATED
import static org.springframework.http.HttpStatus.NOT_FOUND
import static org.springframework.http.HttpStatus.NO_CONTENT
import static org.springframework.http.HttpStatus.OK
import static org.springframework.http.HttpStatus.UNPROCESSABLE_ENTITY

import grails.gorm.transactions.ReadOnly
import grails.gorm.transactions.Transactional

@ReadOnly
class InstitucionesYContrapartesController extends RestfulController<InstitucionesYContrapartes>{
    InstitucionesYContrapartesController() {super (InstitucionesYContrapartes)}

    def index() {
        respond InstitucionesYContrapartes.list().collect{
            [
                    id: it?.id,
                    claveInstitucionFinanciera: it?.claveInstitucionFinanciera,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
