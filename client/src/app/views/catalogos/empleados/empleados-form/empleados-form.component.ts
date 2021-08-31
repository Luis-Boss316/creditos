import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _sucursales} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {EmpleadosComponent} from "../empleados.component";

@Component({
  selector: 'app-empleados-form',
  templateUrl: './empleados-form.component.html',
  styleUrls: ['./empleados-form.component.sass']
})
export class EmpleadosFormComponent implements OnInit {
  action: string;
  _empleadosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _sucursales;
  public sucursalCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<EmpleadosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._empleadosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Sucursales'}, 'comboController').subscribe(result =>
      this.sucursalCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._empleadosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        numeroEmpleado: [this.data.data.numeroEmpleado, Validators.required],
        nombre: [this.data.data.nombre, Validators.required],
        puesto: [this.data.data.puesto, Validators.required],
        sucursal: [this.data.data.sucursal.id, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._empleadosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        numeroEmpleado: [this.data.data.numeroEmpleado, Validators.required],
        nombre: [this.data.data.nombre, Validators.required],
        puesto: [this.data.data.puesto, Validators.required],
        sucursal: [this.data.data.sucursal, Validators.required],
      });
    }
  }
}
