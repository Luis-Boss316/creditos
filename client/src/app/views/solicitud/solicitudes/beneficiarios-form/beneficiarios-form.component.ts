import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_beneficiarios, _coacreditados, _combo} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-beneficiarios-form',
  templateUrl: './beneficiarios-form.component.html',
  styleUrls: ['./beneficiarios-form.component.sass']
})
export class BeneficiariosFormComponent implements OnInit {
  action: string;
  _beneficiariosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _beneficiarios;
  public nombreCombo: _combo[];
  public relacionCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<BeneficiariosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public dialog: MatDialog,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._beneficiariosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'TiposRelaciones'}, 'comboController').subscribe(result =>
      this.relacionCombo = result);

    this.dialogTitle = this.data.data.alias;
    this._beneficiariosForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      tipo: [this.data.data.tipo ? this.data.data.tipo: ''],
      nombre: [this.data.data.nombre ? this.data.data.nombre: ''],
      relacion: [this.data.data.relacion ? this.data.data.relacion.id: ''],
    });

    if (this.data.data.tipo != undefined){
      this.cargarCombo(this.data.data.tipo)
      this._beneficiariosForm.patchValue({nombre: Number(this.data.data.nombre)})
    }
  }

  cargarCombo(value: any) {
    this.advanceTableService.combo<_combo[]>({id: value}, 'comboController').subscribe(result =>
      this.nombreCombo = result);
  }
}
