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
class TasasReferenciaController extends RestfulController<TasasReferencia>{
    TasasReferenciaController() {super (TasasReferencia)}

    def index() {
        respond TasasReferencia.list().collect{
            [
                    id: it?.id,
                    claveTasa: it?.claveTasa,
                    descripcionCorta: it?.descripcionCorta,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
