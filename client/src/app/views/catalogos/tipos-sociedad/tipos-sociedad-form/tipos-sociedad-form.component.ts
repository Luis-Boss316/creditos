import {Component, Inject, OnInit} from '@angular/core';
import {_tiposSociedad} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-sociedad-form',
  templateUrl: './tipos-sociedad-form.component.html',
  styleUrls: ['./tipos-sociedad-form.component.sass']
})
export class TiposSociedadFormComponent implements OnInit {
  action: string;
  _tiposSociedadForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposSociedad;

  constructor(public dialogRef: MatDialogRef<TiposSociedadFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposSociedadForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposSociedadForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoSociedad: [this.data.data.claveTipoSociedad, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        descripcionLarga: [this.data.data.descripcionLarga, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposSociedadForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoSociedad: [this.data.data.claveTipoSociedad, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        descripcionLarga: [this.data.data.descripcionLarga, Validators.required],
      });
    }
  }
}
