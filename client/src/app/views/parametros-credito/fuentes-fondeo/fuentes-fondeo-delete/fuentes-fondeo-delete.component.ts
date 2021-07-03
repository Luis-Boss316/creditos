import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-fuentes-fondeo-delete',
  templateUrl: './fuentes-fondeo-delete.component.html',
  styleUrls: ['./fuentes-fondeo-delete.component.sass']
})
export class FuentesFondeoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<FuentesFondeoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
