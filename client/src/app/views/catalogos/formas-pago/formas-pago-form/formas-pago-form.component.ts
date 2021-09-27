import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_ciudades, _formasPago} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-formas-pago-form',
  templateUrl: './formas-pago-form.component.html',
  styleUrls: ['./formas-pago-form.component.sass']
})
export class FormasPagoFormComponent implements OnInit {
  action: string;
  _formasPagoForm: FormGroup;
  dialogTitle: string;
  advanceTable: _formasPago;

  constructor(public dialogRef: MatDialogRef<FormasPagoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._formasPagoForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._formasPagoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        valor: [this.data.data.valor, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        operacion: [this.data.data.operacion],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._formasPagoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        valor: [this.data.data.valor, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        operacion: [this.data.data.operacion],
      });
    }
  }
}
