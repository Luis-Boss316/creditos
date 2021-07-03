import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-ciudades-delete',
  templateUrl: './ciudades-delete.component.html',
  styleUrls: ['./ciudades-delete.component.sass']
})
export class CiudadesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<CiudadesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
