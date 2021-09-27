package mx.saccsa.creditos

import grails.rest.RestfulController

import grails.gorm.transactions.ReadOnly

@ReadOnly
class ParametrosProductosController extends RestfulController<ParametrosProductos>{
    ParametrosProductosController() {super (ParametrosProductos)}

    def index() {
        respond ParametrosProductos.list().collect({
            [
                    id: it?.id,
                    baseCapital: it?.baseCapital,
                    plazoMinimo: it?.plazoMinimo,
                    plazoMaximo: it?.plazoMaximo,
                    proyectarIntereses: it?.proyectarIntereses,
                    diasGracia: it?.diasGracia,
                    diasInhabiles: it?.diasInhabiles,
                    tipoPeriodoGracia: it?.tipoPeriodoGracia,
                    fechaCalculo: it?.fechaCalculo,
                    diasMinistracion: it?.diasMinistracion,
                    diaCorteEstadoCuenta: it?.diaCorteEstadoCuenta,
                    obtenerCat: it?.obtenerCat,

                    numeroGracia: it?.numeroGracia,
                    decimales: it?.decimales,
                    tipoCalculoDias: it?.tipoCalculoDias,
                    capitalizarIntereses: it?.capitalizarIntereses,
                    decimalesCalculo: it?.decimalesCalculo,
                    tipoCalculo: it?.tipoCalculo,
                    capitalizarMoratorios: it?.capitalizarMoratorios,
                    tipoCalendario: it?.tipoCalendario,
                    incluirImpuestos: it?.incluirImpuestos,
                    diasCalculo: it?.diasCalculo,
                    tipoTasaInteres: it?.tipoTasaInteres,

                    conceptoComprobantes: it?.conceptoComprobantes,
                    emitirComplementosComprobantes: it?.emitirComplementosComprobantes,
                    emitirComprobantesFiscales: it?.emitirComprobantesFiscales,
                    emitirComprobantesPor: it?.emitirComprobantesPor,

                    tipoFactoraje: it?.tipoFactoraje,

                    enviarInformacion: it?.enviarInformacion,

                    cobrarDiasProrroga: it?.cobrarDiasProrroga,
                    baseMoratorios: it?.baseMoratorios,
                    valoresMora: it?.valoresMora,
                    diasProrroga: it?.diasProrroga,
                    cobrarMoratorios: it?.cobrarMoratorios,
                    tiposMoratorios: it?.tiposMoratorios,

                    valoresTomaraTasa: it?.valoresTomaraTasa,

                    llamadaMargen: it?.llamadaMargen,
                    porcentajeAforo: it?.porcentajeAforo,
                    permiteRenovacion: it?.permiteRenovacion,

                    desembolsoPorParticipante: it?.desembolsoPorParticipante?'Si':'No',
                    permitirCapturaGrupo: it?.permitirCapturaGrupo?'Si':'No',

                    aplicacionPagoAnticipado: it?.aplicacionPagoAnticipado,
                    prelacionAplicacionPago: it?.prelacionAplicacionPago,

                    plazoMinimoLineaCredito: it?.plazoMinimoLineaCredito,
                    montoMaximoDisposicion: it?.montoMaximoDisposicion,
                    plazoMaximoDisposicion: it?.plazoMaximoDisposicion,
                    tasaEntregaRecursos: it?.tasaEntregaRecursos,
            ]
        })
    }
}
