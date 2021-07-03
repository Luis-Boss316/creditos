import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-relaciones-delete',
  templateUrl: './tipos-relaciones-delete.component.html',
  styleUrls: ['./tipos-relaciones-delete.component.sass']
})
export class TiposRelacionesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposRelacionesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
