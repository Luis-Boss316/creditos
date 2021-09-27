import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_coacreditados, _combo, _prospectos} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-coacreditados-form',
  templateUrl: './coacreditados-form.component.html',
  styleUrls: ['./coacreditados-form.component.sass']
})
export class CoacreditadosFormComponent implements OnInit {
  action: string;
  _coacreditadosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _coacreditados;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<CoacreditadosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public dialog: MatDialog,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._coacreditadosForm.value);
  }

  ngOnInit(): void {
    this.dialogTitle = this.data.data.alias;
    this._coacreditadosForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      tipo: [this.data.data.tipo ? this.data.data.tipo: ''],
      nombre: [this.data.data.nombre ? this.data.data.nombre: ''],
      relacion: [this.data.data.relacion ? this.data.data.relacion: ''],
    });

    if (this.data.data.tipo != undefined){
      this.cargarCombo(this.data.data.tipo)
      this._coacreditadosForm.patchValue({nombre: Number(this.data.data.nombre)})
    }
  }

  cargarCombo(value: any) {
    this.advanceTableService.combo<_combo[]>({id: value}, 'comboController').subscribe(result =>
      this.nombreCombo = result);
  }
}
