import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_origenRecursos} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-origen-recursos-form',
  templateUrl: './origen-recursos-form.component.html',
  styleUrls: ['./origen-recursos-form.component.sass']
})
export class OrigenRecursosFormComponent implements OnInit {
  action: string;
  _origenRecursosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _origenRecursos;

  constructor(public dialogRef: MatDialogRef<OrigenRecursosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._origenRecursosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._origenRecursosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveOrigenRecursosCuenta: [this.data.data.claveOrigenRecursosCuenta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._origenRecursosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveOrigenRecursosCuenta: [this.data.data.claveOrigenRecursosCuenta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
