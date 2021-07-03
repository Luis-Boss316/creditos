import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-referencias-delete',
  templateUrl: './tipos-referencias-delete.component.html',
  styleUrls: ['./tipos-referencias-delete.component.sass']
})
export class TiposReferenciasDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposReferenciasDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
