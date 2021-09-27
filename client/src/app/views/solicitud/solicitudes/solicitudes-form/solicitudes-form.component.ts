import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_combo, _prospectos, _solicitudes} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-solicitudes-form',
  templateUrl: './solicitudes-form.component.html',
  styleUrls: ['./solicitudes-form.component.sass']
})
export class SolicitudesFormComponent implements OnInit {
  action: string;
  _solicitudesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _solicitudes;
  public sucursalCombo: _combo[];
  public productoFinancieroCombo: _combo[];
  public empleadosCombo: _combo[];
  public empleados2Combo: _combo[];
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<SolicitudesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public dialog: MatDialog,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._solicitudesForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Sucursales'}, 'comboController').subscribe(result =>
      this.sucursalCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'ProductoFinanciero'}, 'comboController').subscribe(result =>
      this.productoFinancieroCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Empleados'}, 'comboController').subscribe(result =>
      this.empleadosCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Empleados'}, 'comboController').subscribe(result =>
      this.empleados2Combo = result);

    this.dialogTitle = this.data.data.alias;
    this._solicitudesForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      tipo: [this.data.data.tipo ? this.data.data.tipo: ''],
      nombre: [this.data.data.nombre ? this.data.data.nombre: ''],
      fechaSolicitud: [this.data.data.fechaSolicitud ? this.data.data.fechaSolicitud: ''],
      sucursal: [this.data.data.sucursal ? this.data.data.sucursal.id: ''],
      producto: [this.data.data.producto ? this.data.data.producto.id: ''],
      ejecutivo: [this.data.data.ejecutivo ? this.data.data.ejecutivo.id: ''],
      promotor: [this.data.data.promotor ? this.data.data.promotor.id: ''],
      concetoInversion: [this.data.data.concetoInversion ? this.data.data.concetoInversion: ''],
      numeroAmortizaciones: [this.data.data.numeroAmortizaciones ? this.data.data.numeroAmortizaciones: ''],
      fechaEntrega: [this.data.data.fechaEntrega ? this.data.data.fechaEntrega: ''],
      fechaPrimerAmortizacion: [this.data.data.fechaPrimerAmortizacion ? this.data.data.fechaPrimerAmortizacion: ''],
      tasa: [this.data.data.tasa ? this.data.data.tasa: ''],
    });

    if (this.data.data.tipo != undefined){
      this.cargarCombo(this.data.data.tipo)
      this._solicitudesForm.patchValue({nombre: Number(this.data.data.nombre)})
    }
  }

  cargarCombo(value: any) {
    this.advanceTableService.combo<_combo[]>({id: value}, 'comboController').subscribe(result =>
      this.nombreCombo = result);
  }
}
