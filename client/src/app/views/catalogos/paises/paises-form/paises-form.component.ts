import {Component, Inject, OnInit} from '@angular/core';
import {_paises} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-paises-form',
  templateUrl: './paises-form.component.html',
  styleUrls: ['./paises-form.component.sass']
})
export class PaisesFormComponent implements OnInit {
  action: string;
  _paisesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _paises;

  constructor(public dialogRef: MatDialogRef<PaisesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._paisesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._paisesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        clavePais: [this.data.data.clavePais, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._paisesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        clavePais: [this.data.data.clavePais, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
