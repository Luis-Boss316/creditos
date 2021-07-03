import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _monedas} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-monedas-form',
  templateUrl: './monedas-form.component.html',
  styleUrls: ['./monedas-form.component.sass']
})
export class MonedasFormComponent implements OnInit {
  action: string;
  _monedasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _monedas;
  public paisesCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<MonedasFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._monedasForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paisesCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.alias;
      this._monedasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveMoneda: [this.data.data.claveMoneda, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        numeroPais: [this.data.data.numeroPais.id, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._monedasForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveMoneda: [this.data.data.claveMoneda, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        numeroPais: [this.data.data.numeroPais, Validators.required],
      });
    }
  }
}
