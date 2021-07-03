import {Component, Inject, OnInit} from '@angular/core';
import {_peritos} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-peritos-form',
  templateUrl: './peritos-form.component.html',
  styleUrls: ['./peritos-form.component.sass']
})
export class PeritosFormComponent implements OnInit {
  action: string;
  _peritosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _peritos;

  constructor(public dialogRef: MatDialogRef<PeritosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._peritosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._peritosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroPerito: [this.data.data.numeroPerito, Validators.required],
        numeroRegistroPerito: [this.data.data.numeroRegistroPerito, Validators.required],
        apellidoPaternoPeritoTitular: [this.data.data.apellidoPaternoPeritoTitular, Validators.required],
        apellidoMaternoPeritoTitular: [this.data.data.apellidoMaternoPeritoTitular],
        primerNombrePeritoTitular: [this.data.data.primerNombrePeritoTitular, Validators.required],
        segundoNombrePeritoTitular: [this.data.data.segundoNombrePeritoTitular],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._peritosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroPerito: [this.data.data.numeroPerito, Validators.required],
        numeroRegistroPerito: [this.data.data.numeroRegistroPerito, Validators.required],
        apellidoPaternoPeritoTitular: [this.data.data.apellidoPaternoPeritoTitular, Validators.required],
        apellidoMaternoPeritoTitular: [this.data.data.apellidoMaternoPeritoTitular],
        primerNombrePeritoTitular: [this.data.data.primerNombrePeritoTitular, Validators.required],
        segundoNombrePeritoTitular: [this.data.data.segundoNombrePeritoTitular],
      });
    }
  }
}
