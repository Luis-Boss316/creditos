import {Component, Inject, OnInit} from '@angular/core';
import {_actEcoCNBV} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-act-eco-cnbv-form',
  templateUrl: './act-eco-cnbv-form.component.html',
  styleUrls: ['./act-eco-cnbv-form.component.sass']
})
export class ActEcoCnbvFormComponent implements OnInit {
  action: string;
  _actEcoCNBVForm: FormGroup;
  dialogTitle: string;
  advanceTable: _actEcoCNBV;

  constructor(public dialogRef: MatDialogRef<ActEcoCnbvFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._actEcoCNBVForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcion;
      this._actEcoCNBVForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveActividad: [this.data.data.claveActividad, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._actEcoCNBVForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveActividad: [this.data.data.claveActividad, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
