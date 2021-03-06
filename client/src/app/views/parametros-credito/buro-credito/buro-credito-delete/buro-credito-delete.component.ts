import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-buro-credito-delete',
  templateUrl: './buro-credito-delete.component.html',
  styleUrls: ['./buro-credito-delete.component.sass']
})
export class BuroCreditoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<BuroCreditoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
