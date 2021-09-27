import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-formas-pago-delete',
  templateUrl: './formas-pago-delete.component.html',
  styleUrls: ['./formas-pago-delete.component.sass']
})
export class FormasPagoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<FormasPagoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
