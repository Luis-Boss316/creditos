import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-circulo-credito-delete',
  templateUrl: './circulo-credito-delete.component.html',
  styleUrls: ['./circulo-credito-delete.component.sass']
})
export class CirculoCreditoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<CirculoCreditoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
