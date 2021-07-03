import {Component, Inject, OnInit} from '@angular/core';
import {_tiposRelaciones} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-relaciones-form',
  templateUrl: './tipos-relaciones-form.component.html',
  styleUrls: ['./tipos-relaciones-form.component.sass']
})
export class TiposRelacionesFormComponent implements OnInit {
  action: string;
  _tiposRelacionesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposRelaciones;

  constructor(public dialogRef: MatDialogRef<TiposRelacionesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposRelacionesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposRelacionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoRelacion: [this.data.data.claveTipoRelacion, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposRelacionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoRelacion: [this.data.data.claveTipoRelacion, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
