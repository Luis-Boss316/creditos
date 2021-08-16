import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _telefonos} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-telefonos-form',
  templateUrl: './telefonos-form.component.html',
  styleUrls: ['./telefonos-form.component.sass']
})
export class TelefonosFormComponent implements OnInit {
  action: string;
  _telefonosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _telefonos;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<TelefonosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._telefonosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Personas'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._telefonosForm = this.advanceTableService.buildForm({
        id: [this.data.data.nombre, Validators.required],
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
      this._telefonosForm = this.advanceTableService.buildForm({
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
