import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-notarios-delete',
  templateUrl: './notarios-delete.component.html',
  styleUrls: ['./notarios-delete.component.sass']
})
export class NotariosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<NotariosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
