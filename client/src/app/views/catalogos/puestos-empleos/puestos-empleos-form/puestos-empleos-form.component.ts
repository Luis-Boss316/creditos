import {Component, Inject, OnInit} from '@angular/core';
import {_puestosEmpleos} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-puestos-empleos-form',
  templateUrl: './puestos-empleos-form.component.html',
  styleUrls: ['./puestos-empleos-form.component.sass']
})
export class PuestosEmpleosFormComponent implements OnInit {
  action: string;
  _puestosEmpleosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _puestosEmpleos;

  constructor(public dialogRef: MatDialogRef<PuestosEmpleosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._puestosEmpleosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._puestosEmpleosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        clavePuestoEmpleo: [this.data.data.clavePuestoEmpleo, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._puestosEmpleosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        clavePuestoEmpleo: [this.data.data.clavePuestoEmpleo, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
