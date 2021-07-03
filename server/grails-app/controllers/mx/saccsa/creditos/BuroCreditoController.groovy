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
class BuroCreditoController extends RestfulController<BuroCredito>{
    BuroCreditoController() {super (BuroCredito)}

    def index() {
        respond BuroCredito.list().collect{
            [
                    id: it?.id,
                    numeroInstitucion: it?.numeroInstitucion,
                    claveOtorgante: it?.claveOtorgante,
                    nombreOtorgante: it?.nombreOtorgante,
                    claveVersion: it?.claveVersion,
                    domicilioDevolucion: it?.domicilioDevolucion,
                    generaLunes: it?.generaLunes?'Si':'No',
                    generaMartes: it?.generaMartes?'Si':'No',
                    generaMiercoles: it?.generaMiercoles?'Si':'No',
                    generaJueves: it?.generaJueves?'Si':'No',
                    generaViernes: it?.generaViernes?'Si':'No',
                    generaSabado: it?.generaSabado?'Si':'No',
                    generaDomingo: it?.generaDomingo?'Si':'No',
                    fechaUltimoReporteSemanal: it?.fechaUltimoReporteSemanal,
                    fechaProximoReporteSemanal: it?.fechaProcimoReporteSemanal,
                    fechaUltimoReporteMensual: it?.fechaUltimoReporteMensual,
                    tipoInstitucion: it?.tipoInstitucion,
            ]
        }
    }
}
