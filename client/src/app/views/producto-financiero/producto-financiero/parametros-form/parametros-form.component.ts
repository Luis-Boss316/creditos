import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {FormGroup} from "@angular/forms";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {_parametros} from "../../../../shared/interfaces/Creditos.interface";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-parametros-form',
  templateUrl: './parametros-form.component.html',
  styleUrls: ['./parametros-form.component.scss']
})
export class ParametrosFormComponent implements OnInit {
  action: string;
  dialogTitle: string;
  _parametrosForm: FormGroup;
  advanceTable: _parametros;
  isLinear: false;

  constructor(public dialogRef: MatDialogRef<ParametrosFormComponent>,
              public dialog: MatDialog,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,
              private snackBar: MatSnackBar) {
  }

  submit() {
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  public guardar(): void {
    this.dialogRef.close(this._parametrosForm.value);
  }

  ngOnInit(): void {
    this._parametrosForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      baseCapital: [this.data.data.baseCapital ? this.data.data.baseCapital: ''],
      plazoMinimo: [this.data.data.plazoMinimo ? this.data.data.plazoMinimo: ''],
      plazoMaximo: [this.data.data.plazoMaximo ? this.data.data.plazoMaximo: ''],
      proyectarIntereses: [this.data.data.proyectarIntereses ? this.data.data.proyectarIntereses: ''],
      diasGracia: [this.data.data.diasGracia ? this.data.data.diasGracia: ''],
      diasInhabiles: [this.data.data.diasInhabiles ? this.data.data.diasInhabiles: ''],
      tipoPeriodoGracia: [this.data.data.tipoPeriodoGracia ? this.data.data.tipoPeriodoGracia: ''],
      fechaCalculo: [this.data.data.fechaCalculo ? this.data.data.fechaCalculo: ''],
      diasMinistracion: [this.data.data.diasMinistracion ? this.data.data.diasMinistracion: ''],
      diaCorteEstadoCuenta: [this.data.data.diaCorteEstadoCuenta ? this.data.data.diaCorteEstadoCuenta: ''],
      obtenerCat: [this.data.data.obtenerCat ? this.data.data.obtenerCat: ''],
      numeroGracia: [this.data.data.numeroGracia ? this.data.data.numeroGracia: ''],
      decimales: [this.data.data.decimales ? this.data.data.decimales: ''],
      tipoCalculoDias: [this.data.data.tipoCalculoDias ? this.data.data.tipoCalculoDias: ''],
      capitalizarIntereses: [this.data.data.capitalizarIntereses ? this.data.data.capitalizarIntereses: ''],
      decimalesCalculo: [this.data.data.decimalesCalculo ? this.data.data.decimalesCalculo: ''],
      tipoCalculo: [this.data.data.tipoCalculo ? this.data.data.tipoCalculo: ''],
      capitalizarMoratorios: [this.data.data.capitalizarMoratorios ? this.data.data.capitalizarMoratorios: ''],
      tipoCalendario: [this.data.data.tipoCalendario ? this.data.data.tipoCalendario: ''],
      incluirImpuestos: [this.data.data.incluirImpuestos ? this.data.data.incluirImpuestos: ''],
      diasCalculo: [this.data.data.diasCalculo ? this.data.data.diasCalculo: ''],
      tipoTasaInteres: [this.data.data.tipoTasaInteres ? this.data.data.tipoTasaInteres: ''],
      conceptoComprobantes: [this.data.data.conceptoComprobantes ? this.data.data.conceptoComprobantes: ''],
      emitirComplementosComprobantes: [this.data.data.emitirComplementosComprobantes ? this.data.data.emitirComplementosComprobantes: ''],
      emitirComprobantesFiscales: [this.data.data.emitirComprobantesFiscales ? this.data.data.emitirComprobantesFiscales: ''],
      emitirComprobantesPor: [this.data.data.emitirComprobantesPor ? this.data.data.emitirComprobantesPor: ''],
      tipoFactoraje: [this.data.data.tipoFactoraje ? this.data.data.tipoFactoraje: ''],
      enviarInformacion: [this.data.data.enviarInformacion ? this.data.data.enviarInformacion: ''],
      cobrarDiasProrroga: [this.data.data.cobrarDiasProrroga ? this.data.data.cobrarDiasProrroga: ''],
      baseMoratorios: [this.data.data.baseMoratorios ? this.data.data.baseMoratorios: ''],
      valoresMora: [this.data.data.valoresMora ? this.data.data.valoresMora: ''],
      diasProrroga: [this.data.data.diasProrroga ? this.data.data.diasProrroga: ''],
      cobrarMoratorios: [this.data.data.cobrarMoratorios ? this.data.data.cobrarMoratorios: ''],
      tiposMoratorios: [this.data.data.tiposMoratorios ? this.data.data.tiposMoratorios: ''],
      valoresTomaraTasa: [this.data.data.valoresTomaraTasa ? this.data.data.valoresTomaraTasa: ''],
      llamadaMargen: [this.data.data.llamadaMargen ? this.data.data.llamadaMargen: ''],
      porcentajeAforo: [this.data.data.porcentajeAforo ? this.data.data.porcentajeAforo: ''],
      permiteRenovacion: [this.data.data.permiteRenovacion ? this.data.data.permiteRenovacion: ''],
      desembolsoPorParticipante: [this.data.data.desembolsoPorParticipante ? this.data.data.desembolsoPorParticipante: ''],
      permitirCapturaGrupo: [this.data.data.permitirCapturaGrupo ? this.data.data.permitirCapturaGrupo: ''],
      aplicacionPagoAnticipado: [this.data.data.aplicacionPagoAnticipado ? this.data.data.aplicacionPagoAnticipado: ''],
      prelacionAplicacionPago: [this.data.data.prelacionAplicacionPago ? this.data.data.prelacionAplicacionPago: ''],
      plazoMinimoLineaCredito: [this.data.data.plazoMinimoLineaCredito ? this.data.data.plazoMinimoLineaCredito: ''],
      montoMaximoDisposicion: [this.data.data.montoMaximoDisposicion ? this.data.data.montoMaximoDisposicion: ''],
      plazoMaximoDisposicion: [this.data.data.plazoMaximoDisposicion ? this.data.data.plazoMaximoDisposicion: ''],
      tasaEntregaRecursos: [this.data.data.tasaEntregaRecursos ? this.data.data.tasaEntregaRecursos: ''],
    });
  }
}
