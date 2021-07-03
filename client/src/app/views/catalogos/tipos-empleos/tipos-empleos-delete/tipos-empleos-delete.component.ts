import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-empleos-delete',
  templateUrl: './tipos-empleos-delete.component.html',
  styleUrls: ['./tipos-empleos-delete.component.sass']
})
export class TiposEmpleosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposEmpleosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
