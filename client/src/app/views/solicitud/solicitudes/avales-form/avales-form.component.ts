import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_coacreditados, _combo} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-avales-form',
  templateUrl: './avales-form.component.html',
  styleUrls: ['./avales-form.component.sass']
})
export class AvalesFormComponent implements OnInit {
  action: string;
  _avalesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _coacreditados;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<AvalesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public dialog: MatDialog,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._avalesForm.value);
  }

  ngOnInit(): void {
    this.dialogTitle = this.data.data.alias;
    this._avalesForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      tipo: [this.data.data.tipo ? this.data.data.tipo: ''],
      nombre: [this.data.data.nombre ? this.data.data.nombre: ''],
      relacion: [this.data.data.relacion ? this.data.data.relacion: ''],
    });

    if (this.data.data.tipo != undefined){
      this.cargarCombo(this.data.data.tipo)
      this._avalesForm.patchValue({nombre: Number(this.data.data.nombre)})
    }
  }

  cargarCombo(value: any) {
    this.advanceTableService.combo<_combo[]>({id: value}, 'comboController').subscribe(result =>
      this.nombreCombo = result);
  }
}
