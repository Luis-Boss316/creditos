import {Component, Inject, OnInit} from '@angular/core';
import {_tipoAsentamientos} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipo-asentamientos-form',
  templateUrl: './tipo-asentamientos-form.component.html',
  styleUrls: ['./tipo-asentamientos-form.component.sass']
})
export class TipoAsentamientosFormComponent implements OnInit {
  action: string;
  _tipoAsentamientosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tipoAsentamientos;

  constructor(public dialogRef: MatDialogRef<TipoAsentamientosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tipoAsentamientosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tipoAsentamientosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoAsentamiento: [this.data.data.claveTipoAsentamiento, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tipoAsentamientosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoAsentamiento: [this.data.data.claveTipoAsentamiento, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
