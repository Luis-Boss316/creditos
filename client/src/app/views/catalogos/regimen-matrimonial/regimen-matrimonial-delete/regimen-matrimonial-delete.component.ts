import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-regimen-matrimonial-delete',
  templateUrl: './regimen-matrimonial-delete.component.html',
  styleUrls: ['./regimen-matrimonial-delete.component.sass']
})
export class RegimenMatrimonialDeleteComponent {

  constructor(public dialogRef: MatDialogRef<RegimenMatrimonialDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
