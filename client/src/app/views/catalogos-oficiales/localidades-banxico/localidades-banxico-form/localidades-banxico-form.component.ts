import {Component, Inject, OnInit} from '@angular/core';
import {_localidadesBanxico} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-localidades-banxico-form',
  templateUrl: './localidades-banxico-form.component.html',
  styleUrls: ['./localidades-banxico-form.component.sass']
})
export class LocalidadesBanxicoFormComponent implements OnInit {
  action: string;
  _localidadesBanxicoForm: FormGroup;
  dialogTitle: string;
  advanceTable: _localidadesBanxico;

  constructor(public dialogRef: MatDialogRef<LocalidadesBanxicoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._localidadesBanxicoForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._localidadesBanxicoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveLocalidadBanxico: [this.data.data.claveLocalidadBanxico, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        numeroEstado: [this.data.data.numeroEstado, Validators.required],
        descripcionEstado: [this.data.data.descripcionEstado, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._localidadesBanxicoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveLocalidadBanxico: [this.data.data.claveLocalidadBanxico, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        numeroEstado: [this.data.data.numeroEstado, Validators.required],
        descripcionEstado: [this.data.data.descripcionEstado, Validators.required],
      });
    }
  }
}
