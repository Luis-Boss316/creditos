import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-denominaciones-delete',
  templateUrl: './denominaciones-delete.component.html',
  styleUrls: ['./denominaciones-delete.component.sass']
})
export class DenominacionesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<DenominacionesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
