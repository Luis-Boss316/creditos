import {Component, Inject, OnInit} from '@angular/core';
import {_buroCredito} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-buro-credito-form',
  templateUrl: './buro-credito-form.component.html',
  styleUrls: ['./buro-credito-form.component.sass']
})
export class BuroCreditoFormComponent implements OnInit {
  action: string;
  _buroCreditoForm: FormGroup;
  dialogTitle: string;
  advanceTable: _buroCredito;

  constructor(public dialogRef: MatDialogRef<BuroCreditoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._buroCreditoForm.value);
  }

  ngOnInit(): void {
      this.action = this.data.action;
      if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.nombre;
      this._buroCreditoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroInstitucion: [this.data.data.numeroInstitucion, Validators.required],
        claveOtorgante: [this.data.data.claveOtorgante, Validators.required],
        nombreOtorgante: [this.data.data.nombreOtorgante],
        claveVersion: [this.data.data.claveVersion, Validators.required],
        domicilioDevolucion: [this.data.data.domicilioDevolucion, Validators.required],
        generaLunes: [this.data.data.generaLunes, Validators.required],
        generaMartes: [this.data.data.generaMartes, Validators.required],
        generaMiercoles: [this.data.data.generaMiercoles, Validators.required],
        generaJueves: [this.data.data.generaJueves, Validators.required],
        generaViernes: [this.data.data.generaViernes, Validators.required],
        generaSabado: [this.data.data.generaSabado, Validators.required],
        generaDomingo: [this.data.data.generaDomingo, Validators.required],
        fechaUltimoReporteSemanal: [this.data.data.fechaUltimoReporteSemanal, Validators.required],
        fechaProximoReporteSemanal: [this.data.data.fechaProximoReporteSemanal],
        fechaUltimoReporteMensual: [this.data.data.fechaUltimoReporteMensual],
        tipoInstitucion: [this.data.data.tipoInstitucion],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._buroCreditoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroInstitucion: [this.data.data.numeroInstitucion, Validators.required],
        claveOtorgante: [this.data.data.claveOtorgante, Validators.required],
        nombreOtorgante: [this.data.data.nombreOtorgante],
        claveVersion: [this.data.data.claveVersion, Validators.required],
        domicilioDevolucion: [this.data.data.domicilioDevolucion, Validators.required],
        generaLunes: [this.data.data.generaLunes, Validators.required],
        generaMartes: [this.data.data.generaMartes, Validators.required],
        generaMiercoles: [this.data.data.generaMiercoles, Validators.required],
        generaJueves: [this.data.data.generaJueves, Validators.required],
        generaViernes: [this.data.data.generaViernes, Validators.required],
        generaSabado: [this.data.data.generaSabado, Validators.required],
        generaDomingo: [this.data.data.generaDomingo, Validators.required],
        fechaUltimoReporteSemanal: [this.data.data.fechaUltimoReporteSemanal, Validators.required],
        fechaProximoReporteSemanal: [this.data.data.fechaProximoReporteSemanal],
        fechaUltimoReporteMensual: [this.data.data.fechaUltimoReporteMensual],
        tipoInstitucion: [this.data.data.tipoInstitucion],
      });
    }
  }
}
