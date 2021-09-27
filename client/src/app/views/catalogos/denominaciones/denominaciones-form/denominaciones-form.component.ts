import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_ciudades, _denominaciones} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-denominaciones-form',
  templateUrl: './denominaciones-form.component.html',
  styleUrls: ['./denominaciones-form.component.sass']
})
export class DenominacionesFormComponent implements OnInit {
  action: string;
  _denominacionesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _denominaciones;

  constructor(public dialogRef: MatDialogRef<DenominacionesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._denominacionesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._denominacionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        tipo: [this.data.data.tipo, Validators.required],
        valor: [this.data.data.valor, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._denominacionesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        tipo: [this.data.data.tipo, Validators.required],
        valor: [this.data.data.valor, Validators.required],
      });
    }
  }
}
