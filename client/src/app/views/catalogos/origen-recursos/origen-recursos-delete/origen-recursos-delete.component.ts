import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-origen-recursos-delete',
  templateUrl: './origen-recursos-delete.component.html',
  styleUrls: ['./origen-recursos-delete.component.sass']
})
export class OrigenRecursosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<OrigenRecursosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
