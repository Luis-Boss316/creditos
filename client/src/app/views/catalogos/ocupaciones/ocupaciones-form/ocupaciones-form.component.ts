import {Component, Inject, OnInit} from '@angular/core';
import {_ocupaciones} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-ocupaciones-form',
  templateUrl: './ocupaciones-form.component.html',
  styleUrls: ['./ocupaciones-form.component.sass']
})
export class OcupacionesFormComponent implements OnInit {
  action: string;
  _ocupacionesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _ocupaciones;

  constructor(public dialogRef: MatDialogRef<OcupacionesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._ocupacionesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._ocupacionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveOcupacion: [this.data.data.claveOcupacion, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._ocupacionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveOcupacion: [this.data.data.claveOcupacion, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
