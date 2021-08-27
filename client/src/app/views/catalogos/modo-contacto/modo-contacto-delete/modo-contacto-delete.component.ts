import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-modo-contacto-delete',
  templateUrl: './modo-contacto-delete.component.html',
  styleUrls: ['./modo-contacto-delete.component.sass']
})
export class ModoContactoDeleteComponent{

  constructor( public dialogRef: MatDialogRef<ModoContactoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any ) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
