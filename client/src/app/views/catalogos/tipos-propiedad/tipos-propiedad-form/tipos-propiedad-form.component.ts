import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_tiposPropiedad} from "../../../../shared/interfaces/Creditos.interface";
import {TiposEmpleosComponent} from "../../tipos-empleos/tipos-empleos.component";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-propiedad-form',
  templateUrl: './tipos-propiedad-form.component.html',
  styleUrls: ['./tipos-propiedad-form.component.sass']
})
export class TiposPropiedadFormComponent implements OnInit {
  action: string;
  _tiposPropiedadForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposPropiedad;

  constructor(public dialogRef: MatDialogRef<TiposPropiedadFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposPropiedadForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposPropiedadForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoPropiedad: [this.data.data.claveTipoPropiedad, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposPropiedadForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoPropiedad: [this.data.data.claveTipoPropiedad, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
