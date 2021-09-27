import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-solicitudes-delete',
  templateUrl: './solicitudes-delete.component.html',
  styleUrls: ['./solicitudes-delete.component.sass']
})
export class SolicitudesDeleteComponent {

  constructor( public dialogRef: MatDialogRef<SolicitudesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any ) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }
}
