package mx.saccsa.creditos

class ParametrosProductos {
    String baseCapital
    String plazoMinimo
    String plazoMaximo
    String proyectarIntereses
    String diasGracia
    String diasInhabiles
    String tipoPeriodoGracia
    String fechaCalculo
    String diasMinistracion
    String diaCorteEstadoCuenta
    String obtenerCat

    String numeroGracia
    String decimales
    String tipoCalculoDias
    String capitalizarIntereses
    String decimalesCalculo
    String tipoCalculo
    String capitalizarMoratorios
    String tipoCalendario
    String incluirImpuestos
    String diasCalculo
    String tipoTasaInteres

    String conceptoComprobantes
    String emitirComplementosComprobantes
    String emitirComprobantesFiscales
    String emitirComprobantesPor

    String tipoFactoraje

    String enviarInformacion

    String cobrarDiasProrroga
    String baseMoratorios
    String valoresMora
    String diasProrroga
    String cobrarMoratorios
    String tiposMoratorios

    String valoresTomaraTasa

    String llamadaMargen
    String porcentajeAforo
    String permiteRenovacion

    Boolean desembolsoPorParticipante = false
    Boolean permitirCapturaGrupo = false

    String aplicacionPagoAnticipado
    String prelacionAplicacionPago

    String plazoMinimoLineaCredito
    String montoMaximoDisposicion
    String plazoMaximoDisposicion
    String tasaEntregaRecursos

    static constraints = {
        baseCapital nullable: true, blank: true
        plazoMinimo nullable: true, blank: true
        plazoMaximo nullable: true, blank: true
        proyectarIntereses nullable: true, blank: true
        diasGracia nullable: true, blank: true
        diasInhabiles nullable: true, blank: true
        tipoPeriodoGracia nullable: true, blank: true
        fechaCalculo nullable: true, blank: true
        diasMinistracion nullable: true, blank: true
        diaCorteEstadoCuenta nullable: true, blank: true
        obtenerCat nullable: true, blank: true

        numeroGracia nullable: true, blank: true
        decimales nullable: true, blank: true
        tipoCalculoDias nullable: true, blank: true
        capitalizarIntereses nullable: true, blank: true
        decimalesCalculo nullable: true, blank: true
        tipoCalculo nullable: true, blank: true
        capitalizarMoratorios nullable: true, blank: true
        tipoCalendario nullable: true, blank: true
        incluirImpuestos nullable: true, blank: true
        diasCalculo nullable: true, blank: true
        tipoTasaInteres nullable: true, blank: true

        conceptoComprobantes nullable: true, blank: true
        emitirComplementosComprobantes nullable: true, blank: true
        emitirComprobantesFiscales nullable: true, blank: true
        emitirComprobantesPor nullable: true, blank: true

        tipoFactoraje nullable: true, blank: true

        enviarInformacion nullable: true, blank: true

        cobrarDiasProrroga nullable:true, blank:true
        baseMoratorios nullable:true, blank:true
        valoresMora nullable:true, blank:true
        diasProrroga nullable:true, blank:true
        cobrarMoratorios nullable:true, blank:true
        tiposMoratorios nullable:true, blank:true

        valoresTomaraTasa nullable: true, blank: true

        llamadaMargen nullable: true, blank: true
        porcentajeAforo nullable: true, blank: true
        permiteRenovacion nullable: true, blank: true

        desembolsoPorParticipante nullable: true, blank: true
        permitirCapturaGrupo nullable: true, blank: true

        aplicacionPagoAnticipado nullable:true, blank:true
        prelacionAplicacionPago nullable:true, blank:true

        plazoMinimoLineaCredito nullable:true, blank:true
        montoMaximoDisposicion nullable:true, blank:true
        plazoMaximoDisposicion nullable:true, blank:true
        tasaEntregaRecursos nullable:true, blank:true
    }

    static mapping = {
        table('PARAMETROSPRODUCTO')
        version(false)
        id generator: "identity"
        baseCapital name:"baseCapital", column:"baseCapital"
        plazoMinimo name:"plazoMinimo", column:"plazoMinimo"
        plazoMaximo name:"plazoMaximo", column:"plazoMaximo"
        proyectarIntereses name:"proyectarIntereses", column:"proyectarIntereses"
        diasGracia name:"diasGracia", column:"diasGracia"
        diasInhabiles name:"diasInhabiles", column:"diasInhabiles"
        tipoPeriodoGracia name:"tipoPeriodoGracia", column:"tipoPeriodoGracia"
        fechaCalculo name:"fechaCalculo", column:"fechaCalculo"
        diasMinistracion name:"diasMinistracion", column:"diasMinistracion"
        diaCorteEstadoCuenta name:"diaCorteEstadoCuenta", column:"diaCorteEstadoCuenta"
        obtenerCat name:"obtenerCat", column:"obtenerCat"

        numeroGracia name:"numeroGracia", column:"numeroGracia"
        decimales name:"decimales", column:"decimales"
        tipoCalculoDias name:"tipoCalculoDias", column:"tipoCalculoDias"
        capitalizarIntereses name:"capitalizarIntereses", column:"capitalizarIntereses"
        decimalesCalculo name:"decimalesCalculo", column:"decimalesCalculo"
        tipoCalculo name:"tipoCalculo", column:"tipoCalculo"
        capitalizarMoratorios name:"capitalizarMoratorios", column:"capitalizarMoratorios"
        tipoCalendario name:"tipoCalendario", column:"tipoCalendario"
        incluirImpuestos name:"incluirImpuestos", column:"incluirImpuestos"
        diasCalculo name:"diasCalculo", column:"diasCalculo"
        tipoTasaInteres name:"tipoTasaInteres", column:"tipoTasaInteres"

        conceptoComprobantes name:"conceptoComprobantes", column:"conceptoComprobantes"
        emitirComplementosComprobantes name:"emitirComplementosComprobantes", column:"emitirComplementosComprobantes"
        emitirComprobantesFiscales name:"emitirComprobantesFiscales", column:"emitirComprobantesFiscales"
        emitirComprobantesPor name:"emitirComprobantesPor", column:"emitirComprobantesPor"

        tipoFactoraje name:"tipoFactoraje", column:"tipoFactoraje"

        enviarInformacion name:"enviarInformacion", column: "enviarInformacion"

        cobrarDiasProrroga name:"cobrarDiasProrroga", column:"cobrarDiasProrroga"
        baseMoratorios name:"baseMoratorios", column:"baseMoratorios"
        valoresMora name:"valoresMora", column:"valoresMora"
        diasProrroga name:"diasProrroga", column:"diasProrroga"
        cobrarMoratorios name:"cobrarMoratorios", column:"cobrarMoratorios"
        tiposMoratorios name:"tiposMoratorios", column:"tiposMoratorios"

        valoresTomaraTasa name:"valoresTomaraTasa", column:"valoresTomaraTasa"

        llamadaMargen name:"llamadaMargen", column:"llamadaMargen"
        porcentajeAforo name:"porcentajeAforo", column:"porcentajeAforo"
        permiteRenovacion name:"permiteRenovacion", column:"permiteRenovacion"

        desembolsoPorParticipante name:"desembolsoPorParticipante", column:"desembolsoPorParticipante"
        permitirCapturaGrupo name:"permitirCapturaGrupo", column:"permitirCapturaGrupo"

        aplicacionPagoAnticipado name:"aplicacionPagoAnticipado", column:"aplicacionPagoAnticipado"
        prelacionAplicacionPago name:"prelacionAplicacionPago", column:"prelacionAplicacionPago"

        plazoMinimoLineaCredito name:"plazoMinimoLineaCredito", column:"plazoMinimoLineaCredito"
        montoMaximoDisposicion name:"montoMaximoDisposicion", column:"montoMaximoDisposicion"
        plazoMaximoDisposicion name:"plazoMaximoDisposicion", column:"plazoMaximoDisposicion"
        tasaEntregaRecursos name:"tasaEntregaRecursos", column:"tasaEntregaRecursos"
    }
}
