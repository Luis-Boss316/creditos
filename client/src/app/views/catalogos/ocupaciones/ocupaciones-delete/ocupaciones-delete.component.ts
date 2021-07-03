import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-ocupaciones-delete',
  templateUrl: './ocupaciones-delete.component.html',
  styleUrls: ['./ocupaciones-delete.component.sass']
})
export class OcupacionesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<OcupacionesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
