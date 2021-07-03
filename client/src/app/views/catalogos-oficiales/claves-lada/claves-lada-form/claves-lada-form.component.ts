import {Component, Inject, OnInit} from '@angular/core';
import {_clavesLada} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {ClavesLadaDeleteComponent} from "../claves-lada-delete/claves-lada-delete.component";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-claves-lada-form',
  templateUrl: './claves-lada-form.component.html',
  styleUrls: ['./claves-lada-form.component.sass']
})
export class ClavesLadaFormComponent implements OnInit {
  action: string;
  _clavesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _clavesLada;

  constructor(public dialogRef: MatDialogRef<ClavesLadaFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._clavesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._clavesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroClaveLada: [this.data.data.numeroClaveLada, Validators.required],
        claveLadaActual: [this.data.data.claveLadaActual, Validators.required],
        localidadTelmex: [this.data.data.localidadTelmex, Validators.required],
        claveLocalidad: [this.data.data.claveLocalidad],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._clavesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroClaveLada: [this.data.data.numeroClaveLada, Validators.required],
        claveLadaActual: [this.data.data.claveLadaActual, Validators.required],
        localidadTelmex: [this.data.data.localidadTelmex, Validators.required],
        claveLocalidad: [this.data.data.claveLocalidad],
      });
    }
  }
}
