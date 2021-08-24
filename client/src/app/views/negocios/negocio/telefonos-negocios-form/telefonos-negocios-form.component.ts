import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _telefonos, _telefonosNegocios} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-telefonos-negocios-form',
  templateUrl: './telefonos-negocios-form.component.html',
  styleUrls: ['./telefonos-negocios-form.component.sass']
})
export class TelefonosNegociosFormComponent implements OnInit {
  action: string;
  _telefonosNegociosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _telefonosNegocios;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<TelefonosNegociosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._telefonosNegociosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Negocios'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._telefonosNegociosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre.id, Validators.required],
        activo: [this.data.data.activo],
        principal: [this.data.data.principal],
        tipo: [this.data.data.tipo, Validators.required],
        compania: [this.data.data.compania, Validators.required],
        lada: [this.data.data.lada, Validators.required],
        telefono: [this.data.data.telefono, Validators.required],
        extencion: [this.data.data.extencion],
        observaciones: [this.data.data.observaciones, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._telefonosNegociosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        activo: [this.data.data.activo],
        principal: [this.data.data.principal],
        tipo: [this.data.data.tipo, Validators.required],
        compania: [this.data.data.compania, Validators.required],
        lada: [this.data.data.lada, Validators.required],
        telefono: [this.data.data.telefono, Validators.required],
        extencion: [this.data.data.extencion],
        observaciones: [this.data.data.observaciones, Validators.required],
      });
    }
  }
}
