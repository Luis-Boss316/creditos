import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {
  _creditoSimple,
  _datosAdicionalesCompañias,
  _parametros,
  _referencias
} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {MatSnackBar} from "@angular/material/snack-bar";
import {ParametrosFormComponent} from "../../../producto-financiero/producto-financiero/parametros-form/parametros-form.component";
import {ReferenciasFormComponent} from "../referencias-form/referencias-form.component";
import {DatosAdicionalesComponent} from "../datos-adicionales/datos-adicionales.component";

@Component({
  selector: 'app-credito-simple-form',
  templateUrl: './credito-simple-form.component.html',
  styleUrls: ['./credito-simple-form.component.sass']
})
export class CreditoSimpleFormComponent implements OnInit {
  action: string;
  dialogTitle: string;
  _creditoForm: FormGroup;
  advanceTable: _creditoSimple;
  isLinear: false;

  constructor(public dialogRef: MatDialogRef<CreditoSimpleFormComponent>,
              public dialog: MatDialog,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,
              private snackBar: MatSnackBar) { }

  submit() {
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  public guardar(): void {
    this.dialogRef.close(this._creditoForm.value);
  }

  ngOnInit(): void {
    this._creditoForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      tipo: [this.data.data.tipo ? this.data.data.tipo: ''],
      nombre: [this.data.data.nombre ? this.data.data.nombre: ''],
      ocupacion: [this.data.data.ocupacion ? this.data.data.ocupacion: ''],
      sucursal: [this.data.data.sucursal ? this.data.data.sucursal: ''],
      producto: [this.data.data.producto ? this.data.data.producto: ''],
      conceptoInversion: [this.data.data.conceptoInversion ? this.data.data.conceptoInversion: ''],
      fechaContrato: [this.data.data.fechaContrato ? this.data.data.fechaContrato: ''],
      numeroContrato: [this.data.data.numeroContrato ? this.data.data.numeroContrato: ''],
      ejecutivo: [this.data.data.ejecutivo ? this.data.data.ejecutivo: ''],
      promotor: [this.data.data.promotor ? this.data.data.promotor: ''],
      frecuenciaPago: [this.data.data.frecuenciaPago ? this.data.data.frecuenciaPago: ''],
      numeroAmortizacion: [this.data.data.numeroAmortizacion ? this.data.data.numeroAmortizacion: ''],
      fechaPrimerAmortizacion: [this.data.data.fechaPrimerAmortizacion ? this.data.data.fechaPrimerAmortizacion: ''],
      cat: [this.data.data.cat ? this.data.data.cat: ''],
      montoNeto: [this.data.data.montoNeto ? this.data.data.montoNeto: ''],
      estatus: [this.data.data.estatus ? this.data.data.estatus: ''],
      etiquetas: [this.data.data.etiquetas ? this.data.data.etiquetas: ''],
    });
  }


  referencias() {
    let data: any;
    this.advanceTableService.initService('ReferenciaBancaria')
    this.advanceTableService.create<_referencias>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(ReferenciasFormComponent, {
        data: { title: 'Referencias', disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('ReferenciaBancaria')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Referencia Agregada', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('CreditoSimple')
    });
  }

  showNotification(colorName, text, placementFrom, placementAlign) {
    this.snackBar.open(text, '', { duration: 2000, verticalPosition: placementFrom,
      horizontalPosition: placementAlign, panelClass: colorName });
  }

  datosAdicionales() {
    let data: any;
    this.advanceTableService.initService('DatosAdicionalesCompañias')
    this.advanceTableService.create<_datosAdicionalesCompañias>().subscribe(result => {
      data = result;
      console.log(this.advanceTable)
      const dialogRef = this.dialog.open(DatosAdicionalesComponent, {
        data: { title: 'Referencias', disableClose: true, data: data, action: 'Agregar' }
      });
      dialogRef.afterClosed().subscribe((result) => {
        if (!result) { return }
        this.advanceTableService.initService('DatosAdicionalesCompañias')
        this.advanceTableService.save<string>(result).subscribe(data => {
          this.showNotification( 'snackbar-success', 'Referencia Agregada', 'bottom', 'center' );
        }, error => {
          if (error._embedded !== undefined) {
            this.showNotification( 'snackbar-danger', '¡¡Error al guardar!!', 'bottom', 'center' );
            Object.entries(error._embedded.errors).forEach(([key, value]) => { });
          }
        })
      });
      this.advanceTableService.initService('CreditoSimple')
    });
  }
}
