import {Component, Inject, OnInit} from '@angular/core';
import {_tipoSeguro} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipo-seguro-form',
  templateUrl: './tipo-seguro-form.component.html',
  styleUrls: ['./tipo-seguro-form.component.sass']
})
export class TipoSeguroFormComponent implements OnInit {
  action: string;
  _tipoSeguroForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tipoSeguro;

  constructor(public dialogRef: MatDialogRef<TipoSeguroFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tipoSeguroForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tipoSeguroForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        tipoSeguro: [this.data.data.tipoSeguro, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tipoSeguroForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        tipoSeguro: [this.data.data.tipoSeguro, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
