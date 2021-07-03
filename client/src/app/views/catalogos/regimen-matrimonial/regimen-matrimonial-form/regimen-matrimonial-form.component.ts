import {Component, Inject, OnInit} from '@angular/core';
import {_regimenMatrimonial} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-regimen-matrimonial-form',
  templateUrl: './regimen-matrimonial-form.component.html',
  styleUrls: ['./regimen-matrimonial-form.component.sass']
})
export class RegimenMatrimonialFormComponent implements OnInit {
  action: string;
  _regimenMatrimonialForm: FormGroup;
  dialogTitle: string;
  advanceTable: _regimenMatrimonial;

  constructor(public dialogRef: MatDialogRef<RegimenMatrimonialFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._regimenMatrimonialForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._regimenMatrimonialForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveRegimenMatrimonial: [this.data.data.claveRegimenMatrimonial, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._regimenMatrimonialForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveRegimenMatrimonial: [this.data.data.claveRegimenMatrimonial, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
