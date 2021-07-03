import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_tiposIdentificaciones} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-identificaciones-form',
  templateUrl: './tipos-identificaciones-form.component.html',
  styleUrls: ['./tipos-identificaciones-form.component.sass']
})
export class TiposIdentificacionesFormComponent implements OnInit {
  action: string;
  _tiposIdentificacionesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposIdentificaciones;

  constructor(public dialogRef: MatDialogRef<TiposIdentificacionesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposIdentificacionesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposIdentificacionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoIdentificacion: [this.data.data.claveTipoIdentificacion, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposIdentificacionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoIdentificacion: [this.data.data.claveTipoIdentificacion, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
