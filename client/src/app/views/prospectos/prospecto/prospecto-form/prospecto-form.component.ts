import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_ciudades, _prospectos} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

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

  constructor(public dialogRef: MatDialogRef<ProspectoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._prospectosForm.value);
  }

  ngOnInit(): void {
    this.dialogTitle = this.data.data.alias;
    this._prospectosForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      tipo: [this.data.data.tipo ? this.data.data.tipo: ''],
      nombre: [this.data.data.nombre ? this.data.data.nombre: ''],
      modoDeContacto: [this.data.data.modoDeContacto ? this.data.data.modoDeContacto: ''],
      comoSeEntero: [this.data.data.comoSeEntero ? this.data.data.comoSeEntero: ''],
      sucursal: [this.data.data.sucursal ? this.data.data.sucursal: ''],
      ejecutivo: [this.data.data.ejecutivo ? this.data.data.ejecutivo: ''],
      promotor: [this.data.data.promotor ? this.data.data.promotor: ''],
      producto: [this.data.data.producto ? this.data.data.producto: ''],
      monto: [this.data.data.monto ? this.data.data.monto: ''],
    });
  }
}
