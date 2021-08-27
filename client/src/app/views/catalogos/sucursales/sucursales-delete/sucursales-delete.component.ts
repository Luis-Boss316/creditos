import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-sucursales-delete',
  templateUrl: './sucursales-delete.component.html',
  styleUrls: ['./sucursales-delete.component.sass']
})
export class SucursalesDeleteComponent {

  constructor( public dialogRef: MatDialogRef<SucursalesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any ) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
