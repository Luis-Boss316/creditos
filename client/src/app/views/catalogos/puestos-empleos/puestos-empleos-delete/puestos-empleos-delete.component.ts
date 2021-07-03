import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-puestos-empleos-delete',
  templateUrl: './puestos-empleos-delete.component.html',
  styleUrls: ['./puestos-empleos-delete.component.sass']
})
export class PuestosEmpleosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<PuestosEmpleosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
