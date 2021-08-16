import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _datosAlternos, _datosBancarios} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-datos-bancarios-form',
  templateUrl: './datos-bancarios-form.component.html',
  styleUrls: ['./datos-bancarios-form.component.sass']
})
export class DatosBancariosFormComponent implements OnInit {
  action: string;
  _datosBancariosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _datosBancarios;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<DatosBancariosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._datosBancariosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Personas'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._datosBancariosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre.id, Validators.required],
        banco: [this.data.data.banco, Validators.required],
        cuenta: [this.data.data.cuenta],
        clabe: [this.data.data.clabe, Validators.required],
        noTarjeta: [this.data.data.noTarjeta, Validators.required],

      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._datosBancariosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        banco: [this.data.data.banco, Validators.required],
        cuenta: [this.data.data.cuenta],
        clabe: [this.data.data.clabe, Validators.required],
        noTarjeta: [this.data.data.noTarjeta, Validators.required],
      });
    }
  }
}
