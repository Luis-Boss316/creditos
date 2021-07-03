import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_municipios} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-municipios-form',
  templateUrl: './municipios-form.component.html',
  styleUrls: ['./municipios-form.component.sass']
})
export class MunicipiosFormComponent implements OnInit {
  action: string;
  _municipiosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _municipios;

  constructor( public dialogRef: MatDialogRef<MunicipiosFormComponent>,
               @Inject(MAT_DIALOG_DATA) public data: any,
               public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._municipiosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._municipiosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroMunicipio: [this.data.data.numeroMunicipio, Validators.required],
        numeroEstado: [this.data.data.numeroEstado, Validators.required],
        numeroPais: [this.data.data.numeroPais, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcionEstado: [this.data.data.descripcionEstado, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._municipiosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroMunicipio: [this.data.data.numeroMunicipio, Validators.required],
        numeroEstado: [this.data.data.numeroEstado, Validators.required],
        numeroPais: [this.data.data.numeroPais, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcionEstado: [this.data.data.descripcionEstado, Validators.required],
      });
    }
  }
}
