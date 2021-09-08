import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-frecuencia-pago-delete',
  templateUrl: './frecuencia-pago-delete.component.html',
  styleUrls: ['./frecuencia-pago-delete.component.sass']
})
export class FrecuenciaPagoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<FrecuenciaPagoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
