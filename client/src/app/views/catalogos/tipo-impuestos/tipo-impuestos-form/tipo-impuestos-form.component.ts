import {Component, Inject, OnInit} from '@angular/core';
import {_tipoImpuestos} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipo-impuestos-form',
  templateUrl: './tipo-impuestos-form.component.html',
  styleUrls: ['./tipo-impuestos-form.component.sass']
})
export class TipoImpuestosFormComponent implements OnInit {
  action: string;
  _tipoImpuestosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tipoImpuestos;

  constructor(public dialogRef: MatDialogRef<TipoImpuestosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tipoImpuestosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tipoImpuestosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveImpuesto: [this.data.data.claveImpuesto, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        base: [this.data.data.base, Validators.required],
        tasa: [this.data.data.tasa, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tipoImpuestosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveImpuesto: [this.data.data.claveImpuesto, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        base: [this.data.data.base, Validators.required],
        tasa: [this.data.data.tasa, Validators.required],
      });
    }
  }
}
