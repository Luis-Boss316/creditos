import {Component, Inject, OnInit} from '@angular/core';
import {_giroEmpresarial} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-giro-empresarial-form',
  templateUrl: './giro-empresarial-form.component.html',
  styleUrls: ['./giro-empresarial-form.component.sass']
})
export class GiroEmpresarialFormComponent implements OnInit {
  action: string;
  _giroEmpresarialForm: FormGroup;
  dialogTitle: string;
  advanceTable: _giroEmpresarial;

  constructor(public dialogRef: MatDialogRef<GiroEmpresarialFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._giroEmpresarialForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._giroEmpresarialForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveGiroEmpresarial: [this.data.data.claveGiroEmpresarial, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._giroEmpresarialForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveGiroEmpresarial: [this.data.data.claveGiroEmpresarial, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
