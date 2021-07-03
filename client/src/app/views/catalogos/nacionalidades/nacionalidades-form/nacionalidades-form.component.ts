import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_nacionalidades} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-nacionalidades-form',
  templateUrl: './nacionalidades-form.component.html',
  styleUrls: ['./nacionalidades-form.component.sass']
})
export class NacionalidadesFormComponent implements OnInit {
  action: string;
  _nacionalidadesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _nacionalidades;

  constructor(public dialogRef: MatDialogRef<NacionalidadesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._nacionalidadesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._nacionalidadesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveNacionalidad: [this.data.data.claveNacionalidad, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._nacionalidadesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveNacionalidad: [this.data.data.claveNacionalidad, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
