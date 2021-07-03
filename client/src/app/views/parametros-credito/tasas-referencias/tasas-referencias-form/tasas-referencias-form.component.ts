import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_tasasReferencia} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tasas-referencias-form',
  templateUrl: './tasas-referencias-form.component.html',
  styleUrls: ['./tasas-referencias-form.component.sass']
})
export class TasasReferenciasFormComponent implements OnInit {
  action: string;
  _tasasReferenciasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tasasReferencia;

  constructor(public dialogRef: MatDialogRef<TasasReferenciasFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tasasReferenciasForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tasasReferenciasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTasa: [this.data.data.claveTasa, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tasasReferenciasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTasa: [this.data.data.claveTasa, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
