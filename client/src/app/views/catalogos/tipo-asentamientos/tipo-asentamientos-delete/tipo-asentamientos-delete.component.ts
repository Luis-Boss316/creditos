import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipo-asentamientos-delete',
  templateUrl: './tipo-asentamientos-delete.component.html',
  styleUrls: ['./tipo-asentamientos-delete.component.sass']
})
export class TipoAsentamientosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TipoAsentamientosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
