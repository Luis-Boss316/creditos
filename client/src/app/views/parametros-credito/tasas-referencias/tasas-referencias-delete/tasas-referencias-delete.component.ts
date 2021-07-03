import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tasas-referencias-delete',
  templateUrl: './tasas-referencias-delete.component.html',
  styleUrls: ['./tasas-referencias-delete.component.sass']
})
export class TasasReferenciasDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TasasReferenciasDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
