import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-monedas-delete',
  templateUrl: './monedas-delete.component.html',
  styleUrls: ['./monedas-delete.component.sass']
})
export class MonedasDeleteComponent {

  constructor(public dialogRef: MatDialogRef<MonedasDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
