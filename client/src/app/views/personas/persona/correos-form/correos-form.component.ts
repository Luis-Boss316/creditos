import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _correos, _datosAlternos} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-correos-form',
  templateUrl: './correos-form.component.html',
  styleUrls: ['./correos-form.component.sass']
})
export class CorreosFormComponent implements OnInit {
  action: string;
  _correosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _correos;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<CorreosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._correosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Personas'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._correosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre.id, Validators.required],
        activo: [this.data.data.activo],
        principal: [this.data.data.principal],
        tipo: [this.data.data.tipo, Validators.required],
        correo: [this.data.data.correo, Validators.required],

      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._correosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        activo: [this.data.data.activo],
        principal: [this.data.data.principal],
        tipo: [this.data.data.tipo, Validators.required],
        correo: [this.data.data.correo, Validators.required],
      });
    }
  }
}
