import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _datosAlternos} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-datos-form',
  templateUrl: './datos-form.component.html',
  styleUrls: ['./datos-form.component.sass']
})
export class DatosFormComponent implements OnInit {
  action: string;
  _datosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _datosAlternos;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<DatosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._datosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Personas'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._datosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre.id, Validators.required],
        primerNombre: [this.data.data.primerNombre, Validators.required],
        segundoNombre: [this.data.data.segundoNombre],
        apellidoPaterno: [this.data.data.apellidoPaterno, Validators.required],
        apellidoMaterno: [this.data.data.apellidoMaterno, Validators.required],

      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._datosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        primerNombre: [this.data.data.primerNombre, Validators.required],
        segundoNombre: [this.data.data.segundoNombre],
        apellidoPaterno: [this.data.data.apellidoPaterno, Validators.required],
        apellidoMaterno: [this.data.data.apellidoMaterno, Validators.required],
      });
    }
  }
}
