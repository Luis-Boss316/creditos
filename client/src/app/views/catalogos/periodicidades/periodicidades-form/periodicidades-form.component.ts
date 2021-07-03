import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_periodicidades} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-periodicidades-form',
  templateUrl: './periodicidades-form.component.html',
  styleUrls: ['./periodicidades-form.component.sass']
})
export class PeriodicidadesFormComponent implements OnInit {
  action: string;
  _periodicidadesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _periodicidades;

  constructor(public dialogRef: MatDialogRef<PeriodicidadesFormComponent>,
               @Inject(MAT_DIALOG_DATA) public data: any,
               public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._periodicidadesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._periodicidadesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        clavePeriodicidad: [this.data.data.clavePeriodicidad, Validators.required],
        sistema: [this.data.data.sistema, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        periodo: [this.data.data.periodo, Validators.required],
        frecuencia: [this.data.data.frecuencia, Validators.required],
        dias: [this.data.data.dias, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._periodicidadesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        clavePeriodicidad: [this.data.data.clavePeriodicidad, Validators.required],
        sistema: [this.data.data.sistema, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        periodo: [this.data.data.periodo, Validators.required],
        frecuencia: [this.data.data.frecuencia, Validators.required],
        dias: [this.data.data.dias, Validators.required],
      });
    }
  }
}
