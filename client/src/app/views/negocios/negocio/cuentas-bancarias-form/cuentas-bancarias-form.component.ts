import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _cuentasBancariasNegocios, _datosBancarios} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-cuentas-bancarias-form',
  templateUrl: './cuentas-bancarias-form.component.html',
  styleUrls: ['./cuentas-bancarias-form.component.sass']
})
export class CuentasBancariasFormComponent implements OnInit {
  action: string;
  _cuentasBancariasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _cuentasBancariasNegocios;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<CuentasBancariasFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._cuentasBancariasForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Negocios'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._cuentasBancariasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre.id, Validators.required],
        banco: [this.data.data.banco, Validators.required],
        cuenta: [this.data.data.cuenta],
        clabe: [this.data.data.clabe, Validators.required],
        noTarjeta: [this.data.data.noTarjeta, Validators.required],

      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._cuentasBancariasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        banco: [this.data.data.banco, Validators.required],
        cuenta: [this.data.data.cuenta],
        clabe: [this.data.data.clabe, Validators.required],
        noTarjeta: [this.data.data.noTarjeta, Validators.required],
      });
    }
  }
}
