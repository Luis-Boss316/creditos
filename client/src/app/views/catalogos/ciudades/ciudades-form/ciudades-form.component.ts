import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_ciudades} from "../../../../shared/interfaces/Creditos.interface";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-ciudades-form',
  templateUrl: './ciudades-form.component.html',
  styleUrls: ['./ciudades-form.component.sass']
})
export class CiudadesFormComponent implements OnInit {
  action: string;
  _ciudadesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _ciudades;

  constructor(public dialogRef: MatDialogRef<CiudadesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._ciudadesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._ciudadesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroCiudad: [this.data.data.numeroCiudad, Validators.required],
        numeroEstado: [this.data.data.numeroEstado, Validators.required],
        numeroPais: [this.data.data.numeroPais, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._ciudadesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroCiudad: [this.data.data.numeroCiudad, Validators.required],
        numeroEstado: [this.data.data.numeroEstado, Validators.required],
        numeroPais: [this.data.data.numeroPais, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
