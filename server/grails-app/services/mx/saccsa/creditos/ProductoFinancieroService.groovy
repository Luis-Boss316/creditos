package mx.saccsa.creditos

import grails.gorm.services.Service

@Service(ProductoFinanciero)
interface ProductoFinancieroService {

    ProductoFinanciero get(Serializable id)

    List<ProductoFinanciero> list(Map args)

    Long count()

    void delete(Serializable id)

    ProductoFinanciero save(ProductoFinanciero productoFinanciero)

}