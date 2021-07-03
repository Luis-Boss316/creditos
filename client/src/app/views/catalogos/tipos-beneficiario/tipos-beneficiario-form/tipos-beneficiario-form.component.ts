import {Component, Inject, OnInit} from '@angular/core';
import {_tiposBeneficiario} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-beneficiario-form',
  templateUrl: './tipos-beneficiario-form.component.html',
  styleUrls: ['./tipos-beneficiario-form.component.sass']
})
export class TiposBeneficiarioFormComponent implements OnInit {
  action: string;
  _tiposBeneficiarioForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposBeneficiario;

  constructor(public dialogRef: MatDialogRef<TiposBeneficiarioFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposBeneficiarioForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposBeneficiarioForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoBeneficiario: [this.data.data.claveTipoBeneficiario, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposBeneficiarioForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoBeneficiario: [this.data.data.claveTipoBeneficiario, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
