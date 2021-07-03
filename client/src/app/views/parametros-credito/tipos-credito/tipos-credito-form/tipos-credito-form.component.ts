import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_tiposCredito} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-credito-form',
  templateUrl: './tipos-credito-form.component.html',
  styleUrls: ['./tipos-credito-form.component.sass']
})
export class TiposCreditoFormComponent implements OnInit {
  action: string;
  _tiposCreditoForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposCredito;

  constructor(public dialogRef: MatDialogRef<TiposCreditoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposCreditoForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposCreditoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoCredito: [this.data.data.claveTipoCredito, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposCreditoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoCredito: [this.data.data.claveTipoCredito, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
