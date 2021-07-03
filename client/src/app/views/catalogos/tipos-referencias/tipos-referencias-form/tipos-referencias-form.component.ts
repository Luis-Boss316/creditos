import {Component, Inject, OnInit} from '@angular/core';
import {_tiposReferencia} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-referencias-form',
  templateUrl: './tipos-referencias-form.component.html',
  styleUrls: ['./tipos-referencias-form.component.sass']
})
export class TiposReferenciasFormComponent implements OnInit {
  action: string;
  _tiposReferenciasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposReferencia;

  constructor(public dialogRef: MatDialogRef<TiposReferenciasFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposReferenciasForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposReferenciasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoReferencia: [this.data.data.claveTipoReferencia, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposReferenciasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoReferencia: [this.data.data.claveTipoReferencia, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
