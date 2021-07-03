package mx.saccsa.creditos


import grails.gorm.transactions.ReadOnly
import grails.rest.RestfulController

@ReadOnly
class TiposReferenciasController extends RestfulController<TiposReferencias>{
    TiposReferenciasController() {super (TiposReferencias)}

   def index() {
       respond TiposReferencias.list().collect{
           [
                   id: it?.id,
                   claveTipoReferencia: it?.claveTipoReferencia,
                   descripcion: it?.descripcion,
           ]
       }
   }
}
