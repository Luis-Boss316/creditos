import {Component, Inject, OnInit} from '@angular/core';
import {_actEcoF} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-actividades-economicas-firaform',
  templateUrl: './actividades-economicas-firaform.component.html',
  styleUrls: ['./actividades-economicas-firaform.component.sass']
})
export class ActividadesEconomicasFIRAFormComponent implements OnInit {
  action: string;
  _actEcoFForm: FormGroup;
  dialogTitle: string;
  advanceTable: _actEcoF;

  constructor(public dialogRef: MatDialogRef<ActividadesEconomicasFIRAFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._actEcoFForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._actEcoFForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveActividad: [this.data.data.claveActividad, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._actEcoFForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveActividad: [this.data.data.claveActividad, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
