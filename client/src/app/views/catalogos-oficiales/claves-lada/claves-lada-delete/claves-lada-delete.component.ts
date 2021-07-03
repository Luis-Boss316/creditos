import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-claves-lada-delete',
  templateUrl: './claves-lada-delete.component.html',
  styleUrls: ['./claves-lada-delete.component.sass']
})
export class ClavesLadaDeleteComponent {

  constructor(public dialogRef: MatDialogRef<ClavesLadaDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
