import {Component, Inject, OnInit} from '@angular/core';
import {_coberturasGeograficas} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-coberturas-geograficas-form',
  templateUrl: './coberturas-geograficas-form.component.html',
  styleUrls: ['./coberturas-geograficas-form.component.sass']
})
export class CoberturasGeograficasFormComponent implements OnInit {
  action: string;
  _coberturasGeograficasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _coberturasGeograficas;

  constructor( public dialogRef: MatDialogRef<CoberturasGeograficasFormComponent>,
               @Inject(MAT_DIALOG_DATA) public data: any,
               public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._coberturasGeograficasForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._coberturasGeograficasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveCobertura: [this.data.data.claveCobertura, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._coberturasGeograficasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveCobertura: [this.data.data.claveCobertura, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
