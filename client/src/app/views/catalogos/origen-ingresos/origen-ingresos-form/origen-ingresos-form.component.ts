import {Component, Inject, OnInit} from '@angular/core';
import {_origenIngresos} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-origen-ingresos-form',
  templateUrl: './origen-ingresos-form.component.html',
  styleUrls: ['./origen-ingresos-form.component.sass']
})
export class OrigenIngresosFormComponent implements OnInit {
  action: string;
  _origenIngresosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _origenIngresos;

  constructor(public dialogRef: MatDialogRef<OrigenIngresosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._origenIngresosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._origenIngresosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveOrigenIngresos: [this.data.data.claveOrigenIngresos, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._origenIngresosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveOrigenIngresos: [this.data.data.claveOrigenIngresos, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
