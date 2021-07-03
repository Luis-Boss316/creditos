import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-peritos-delete',
  templateUrl: './peritos-delete.component.html',
  styleUrls: ['./peritos-delete.component.sass']
})
export class PeritosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<PeritosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
