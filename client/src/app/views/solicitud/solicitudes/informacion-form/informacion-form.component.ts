import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_coacreditados, _combo, _informacionPLD} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-informacion-form',
  templateUrl: './informacion-form.component.html',
  styleUrls: ['./informacion-form.component.sass']
})
export class InformacionFormComponent implements OnInit {
  action: string;
  _informacionForm: FormGroup;
  dialogTitle: string;
  advanceTable: _informacionPLD;
  public monedaCombo: _combo[];
  public formasPagoCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<InformacionFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public dialog: MatDialog,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._informacionForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Monedas'}, 'comboController').subscribe(result =>
      this.monedaCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'FormasPago'}, 'comboController').subscribe(result =>
      this.formasPagoCombo = result);

    this.dialogTitle = this.data.data.alias;
    this._informacionForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      montoMaximoPago: [this.data.data.montoMaximoPago ? this.data.data.montoMaximoPago: ''],
      montoMaximoAnticipo: [this.data.data.montoMaximoAnticipo ? this.data.data.montoMaximoAnticipo: ''],
      ingresosMensuales: [this.data.data.ingresosMensuales ? this.data.data.ingresosMensuales: ''],
      moneda: [this.data.data.moneda ? this.data.data.moneda.id: ''],
      centroTrabajo: [this.data.data.centroTrabajo ? this.data.data.centroTrabajo: ''],
      proveedorRecursos: [this.data.data.proveedorRecursos ? this.data.data.proveedorRecursos: ''],
      canalPago: [this.data.data.canalPago ? this.data.data.canalPago: ''],
      formaPago: [this.data.data.formaPago ? this.data.data.formaPago.id: ''],
    });
  }
}
