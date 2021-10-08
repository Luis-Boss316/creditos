import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_combo, _prospectos, _referencias} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-referencias-form',
  templateUrl: './referencias-form.component.html',
  styleUrls: ['./referencias-form.component.sass']
})
export class ReferenciasFormComponent implements OnInit {
  action: string;
  _referenciasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _referencias;
  public cuentasCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<ReferenciasFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public dialog: MatDialog,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._referenciasForm.value);
  }

  ngOnInit(): void {
    this.dialogTitle = this.data.data.alias;


    this._referenciasForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      tipo: [this.data.data.tipo ? this.data.data.tipo: ''],
      cuentaBancaria: [this.data.data.cuentaBancaria ? this.data.data.cuentaBancaria: ''],
      referencia: [this.data.data.referencia ? this.data.data.referencia: ''],
    });

    if (this.data.data.tipo != undefined){
      this.cargarCombo(this.data.data.tipo)
      this._referenciasForm.patchValue({cuentaBancaria: Number(this.data.data.cuentaBancaria)})
    }
  }

  cargarCombo(value: any) {
    this.advanceTableService.combo<_combo[]>({id: value}, 'comboController').subscribe(result =>
      this.cuentasCombo = result);
  }
}
