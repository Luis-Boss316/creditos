import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_modoContacto, _sucursales} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-sucursales-form',
  templateUrl: './sucursales-form.component.html',
  styleUrls: ['./sucursales-form.component.sass']
})
export class SucursalesFormComponent implements OnInit {
  action: string;
  _sucursalesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _sucursales;

  constructor(public dialogRef: MatDialogRef<SucursalesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._sucursalesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._sucursalesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        sucursal: [this.data.data.sucursal, Validators.required],
        responsable: [this.data.data.responsable, Validators.required],
        puesto: [this.data.data.puesto, Validators.required],
        domicilio: [this.data.data.domicilio, Validators.required],
        telefono: [this.data.data.telefono, Validators.required],
        correo: [this.data.data.correo, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._sucursalesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        sucursal: [this.data.data.sucursal, Validators.required],
        responsable: [this.data.data.responsable, Validators.required],
        puesto: [this.data.data.puesto, Validators.required],
        domicilio: [this.data.data.domicilio, Validators.required],
        telefono: [this.data.data.telefono, Validators.required],
        correo: [this.data.data.correo, Validators.required],
      });
    }
  }
}
