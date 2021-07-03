import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_tiposGarantia} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-tipos-garantia-form',
  templateUrl: './tipos-garantia-form.component.html',
  styleUrls: ['./tipos-garantia-form.component.sass']
})
export class TiposGarantiaFormComponent implements OnInit {
  action: string;
  _tiposGarantiaForm: FormGroup;
  dialogTitle: string;
  advanceTable: _tiposGarantia;

  constructor(public dialogRef: MatDialogRef<TiposGarantiaFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._tiposGarantiaForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._tiposGarantiaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveTipoGarantia: [this.data.data.claveTipoGarantia, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        contabiliza: [this.data.data.contabiliza, Validators.required],
        fega: [this.data.data.fega],
        fonaga: [this.data.data.fonaga],
        deudor: [this.data.data.deudor],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._tiposGarantiaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveTipoGarantia: [this.data.data.claveTipoGarantia, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        contabiliza: [this.data.data.contabiliza, Validators.required],
        fega: [this.data.data.fega],
        fonaga: [this.data.data.fonaga],
        deudor: [this.data.data.deudor],
      });
    }
  }
}
