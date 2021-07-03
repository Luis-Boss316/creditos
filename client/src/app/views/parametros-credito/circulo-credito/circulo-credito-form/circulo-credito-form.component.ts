import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_circuloCredito} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-circulo-credito-form',
  templateUrl: './circulo-credito-form.component.html',
  styleUrls: ['./circulo-credito-form.component.sass']
})
export class CirculoCreditoFormComponent implements OnInit {
  action: string;
  _circuloCreditoForm: FormGroup;
  dialogTitle: string;
  advanceTable: _circuloCredito;

  constructor(public dialogRef: MatDialogRef<CirculoCreditoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._circuloCreditoForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._circuloCreditoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroInstitucion: [this.data.data.numeroInstitucion, Validators.required],
        claveOtorgante: [this.data.data.claveOtorgante, Validators.required],
        nombreOtorgante: [this.data.data.nombreOtorgante, Validators.required],
        identificadorMedio: [this.data.data.identificadorMedio, Validators.required],
        domicilioDevolucion: [this.data.data.domicilioDevolucion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._circuloCreditoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroInstitucion: [this.data.data.numeroInstitucion, Validators.required],
        claveOtorgante: [this.data.data.claveOtorgante, Validators.required],
        nombreOtorgante: [this.data.data.nombreOtorgante, Validators.required],
        identificadorMedio: [this.data.data.identificadorMedio, Validators.required],
        domicilioDevolucion: [this.data.data.domicilioDevolucion, Validators.required],
      });
    }
  }
}
