package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class PeriodicidadesController extends RestfulController<Periodicidades>{
    PeriodicidadesController() {super (Periodicidades)}

    def index() {
        respond Periodicidades.list().collect{
            [
                    id: it?.id,
                    clavePeriodicidad: it?.clavePeriodicidad,
                    sistema: it?.sistema,
                    descripcion: it?.descripcion,
                    periodo: it?.periodo,
                    frecuencia: it?.frecuencia,
                    dias: it?.dias,
            ]
        }
    }
}
