import {Component, Inject, OnInit} from '@angular/core';
import {_tiposEmpleos} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-empleos-form',
  templateUrl: './tipos-empleos-form.component.html',
  styleUrls: ['./tipos-empleos-form.component.sass']
})
export class TiposEmpleosFormComponent implements OnInit {
  action: string;
  _tiposEmpleosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposEmpleos;

  constructor(public dialogRef: MatDialogRef<TiposEmpleosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposEmpleosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposEmpleosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoEmpleo: [this.data.data.claveTipoEmpleo, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposEmpleosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoEmpleo: [this.data.data.claveTipoEmpleo, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
