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
class ActEcoCNBVController extends RestfulController<ActEcoCNBV>{
    ActEcoCNBVController() {super (ActEcoCNBV)}

    def index() {
        respond ActEcoCNBV.list().collect{
            [
                    id: it?.id,
                    claveActividad: it?.claveActividad,
                    descripcion: it?.descripcion,
            ]
        }
    }
}
