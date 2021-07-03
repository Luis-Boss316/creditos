import {Component, Inject, OnInit} from '@angular/core';
import {_tipoPersona} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipo-persona-form',
  templateUrl: './tipo-persona-form.component.html',
  styleUrls: ['./tipo-persona-form.component.sass']
})
export class TipoPersonaFormComponent implements OnInit {
  action: string;
  _tipoPersonaForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tipoPersona;

  constructor(public dialogRef: MatDialogRef<TipoPersonaFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tipoPersonaForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tipoPersonaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoPersona: [this.data.data.claveTipoPersona, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tipoPersonaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoPersona: [this.data.data.claveTipoPersona, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
