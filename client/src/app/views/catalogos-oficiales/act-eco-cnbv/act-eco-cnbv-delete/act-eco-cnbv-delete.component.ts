import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-act-eco-cnbv-delete',
  templateUrl: './act-eco-cnbv-delete.component.html',
  styleUrls: ['./act-eco-cnbv-delete.component.sass']
})
export class ActEcoCnbvDeleteComponent {

  constructor(public dialogRef: MatDialogRef<ActEcoCnbvDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
