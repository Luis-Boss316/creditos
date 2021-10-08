import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
import {_datosAdicionalesCompañias,} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialog, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-datos-adicionales',
  templateUrl: './datos-adicionales.component.html',
  styleUrls: ['./datos-adicionales.component.sass']
})
export class DatosAdicionalesComponent implements OnInit {
  action: string;
  _datosAdicionalesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _datosAdicionalesCompañias;

  constructor(public dialogRef: MatDialogRef<DatosAdicionalesComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public dialog: MatDialog,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._datosAdicionalesForm.value);
  }

  ngOnInit(): void {
    this.dialogTitle = this.data.data.alias;


    this._datosAdicionalesForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: ''],
      compañiaRetenedora: [this.data.data.compañiaRetenedora ? this.data.data.compañiaRetenedora: ''],
    });
  }
}
