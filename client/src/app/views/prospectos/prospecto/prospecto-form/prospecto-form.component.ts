import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_ciudades, _combo, _prospectos} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {SimuladorFormComponent} from "../simulador-form/simulador-form.component";

@Component({
  selector: 'app-prospecto-form',
  templateUrl: './prospecto-form.component.html',
  styleUrls: ['./prospecto-form.component.sass']
})
export class ProspectoFormComponent implements OnInit {
  action: string;
  _prospectosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _prospectos;
  public modoContactoCombo: _combo[];
  public comoEnteroCombo: _combo[];
  public sucursalCombo: _combo[];
  public ejecutivoCombo: _combo[];
  public promotorCombo: _combo[];
  public nombreCombo: _combo[];
  public productoCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<ProspectoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public dialog: MatDialog,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._prospectosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'ModoContacto'}, 'comboController').subscribe(result =>
      this.modoContactoCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'ModoContacto'}, 'comboController').subscribe(result =>
      this.comoEnteroCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Sucursales'}, 'comboController').subscribe(result =>
      this.sucursalCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Empleados'}, 'comboController').subscribe(result =>
      this.ejecutivoCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Empleados'}, 'comboController').subscribe(result =>
      this.promotorCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'ProductoFinanciero'}, 'comboController').subscribe(result =>
      this.productoCombo = result);


    this.dialogTitle = this.data.data.alias;


    this._prospectosForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      tipo: [this.data.data.tipo ? this.data.data.tipo: ''],
      nombre: [this.data.data.nombre ? this.data.data.nombre: ''],
      modoDeContacto: [this.data.data.modoDeContacto ? this.data.data.modoDeContacto.id: ''],
      comoSeEntero: [this.data.data.comoSeEntero ? this.data.data.comoSeEntero.id: ''],
      sucursal: [this.data.data.sucursal ? this.data.data.sucursal.id: ''],
      ejecutivo: [this.data.data.ejecutivo ? this.data.data.ejecutivo.id: ''],
      promotor: [this.data.data.promotor ? this.data.data.promotor.id: ''],
      producto: [this.data.data.producto ? this.data.data.producto.id: ''],
      monto: [this.data.data.monto ? this.data.data.monto: ''],
    });


    if (this.data.data.tipo != undefined){
      this.cargarCombo(this.data.data.tipo)
      this._prospectosForm.patchValue({nombre: Number(this.data.data.nombre)})
    }
  }

  cargarCombo(value: any) {
    this.advanceTableService.combo<_combo[]>({id: value}, 'comboController').subscribe(result =>
      this.nombreCombo = result);
  }

  simulador() {
    const dialogRef = this.dialog.open(SimuladorFormComponent, {
      width:'60%', height:'90%',
      data: { title: 'Simulador', disableClose: true, action: 'Agregar' }
    });
  }
}
