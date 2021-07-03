import {Component, Inject, OnInit} from '@angular/core';
import {_profesiones} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-profesiones-form',
  templateUrl: './profesiones-form.component.html',
  styleUrls: ['./profesiones-form.component.sass']
})
export class ProfesionesFormComponent implements OnInit {
  action: string;
  _profesionesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _profesiones;

  constructor(public dialogRef: MatDialogRef<ProfesionesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._profesionesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._profesionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveProfesion: [this.data.data.claveProfesion, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._profesionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveProfesion: [this.data.data.claveProfesion, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
