import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-titulos-delete',
  templateUrl: './titulos-delete.component.html',
  styleUrls: ['./titulos-delete.component.sass']
})
export class TitulosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TitulosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
