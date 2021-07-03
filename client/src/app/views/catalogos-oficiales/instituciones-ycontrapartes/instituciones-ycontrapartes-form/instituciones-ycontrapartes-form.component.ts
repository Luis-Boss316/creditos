import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_institucionesYcontrapartes} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-instituciones-ycontrapartes-form',
  templateUrl: './instituciones-ycontrapartes-form.component.html',
  styleUrls: ['./instituciones-ycontrapartes-form.component.sass']
})
export class InstitucionesYcontrapartesFormComponent implements OnInit {
  action: string;
  _institucionesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _institucionesYcontrapartes;

  constructor(public dialogRef: MatDialogRef<InstitucionesYcontrapartesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._institucionesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._institucionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveInstitucionFinanciera: [this.data.data.claveInstitucionFinanciera, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._institucionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveInstitucionFinanciera: [this.data.data.claveInstitucionFinanciera, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
