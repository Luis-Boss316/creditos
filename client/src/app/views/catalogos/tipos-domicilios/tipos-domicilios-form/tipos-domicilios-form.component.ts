import {Component, Inject, OnInit} from '@angular/core';
import {_tiposDomicilios} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-domicilios-form',
  templateUrl: './tipos-domicilios-form.component.html',
  styleUrls: ['./tipos-domicilios-form.component.sass']
})
export class TiposDomiciliosFormComponent implements OnInit {
  action: string;
  _tiposDomiciliosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposDomicilios;

  constructor(public dialogRef: MatDialogRef<TiposDomiciliosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposDomiciliosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposDomiciliosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoDomicilio: [this.data.data.claveTipoDomicilio, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposDomiciliosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoDomicilio: [this.data.data.claveTipoDomicilio, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
