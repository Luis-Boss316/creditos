import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_ciudades, _frecuenciaPago} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-frecuencia-pago-form',
  templateUrl: './frecuencia-pago-form.component.html',
  styleUrls: ['./frecuencia-pago-form.component.sass']
})
export class FrecuenciaPagoFormComponent implements OnInit {
  action: string;
  _frecuenciaForm: FormGroup;
  dialogTitle: string;
  advanceTable: _frecuenciaPago;

  constructor(public dialogRef: MatDialogRef<FrecuenciaPagoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._frecuenciaForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._frecuenciaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        dias: [this.data.data.dias, Validators.required],
        frecuenciaPago: [this.data.data.frecuenciaPago, Validators.required],
        cnbv: [this.data.data.cnbv],
        bc: [this.data.data.bc],
        cc: [this.data.data.cc],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._frecuenciaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        dias: [this.data.data.dias, Validators.required],
        frecuenciaPago: [this.data.data.frecuenciaPago, Validators.required],
        cnbv: [this.data.data.cnbv],
        bc: [this.data.data.bc],
        cc: [this.data.data.cc],
      });
    }
  }
}
