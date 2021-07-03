import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-paises-delete',
  templateUrl: './paises-delete.component.html',
  styleUrls: ['./paises-delete.component.sass']
})
export class PaisesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<PaisesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
