import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_estados} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-estados-form',
  templateUrl: './estados-form.component.html',
  styleUrls: ['./estados-form.component.sass']
})
export class EstadosFormComponent implements OnInit {
  action: string;
  _estadosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _estados;

  constructor(public dialogRef: MatDialogRef<EstadosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._estadosForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._estadosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveEstado: [this.data.data.claveEstado, Validators.required],
        numeroPais: [this.data.data.numeroPais, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._estadosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveEstado: [this.data.data.claveEstado, Validators.required],
        numeroPais: [this.data.data.numeroPais, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
