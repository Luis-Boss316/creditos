import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-credito-delete',
  templateUrl: './tipos-credito-delete.component.html',
  styleUrls: ['./tipos-credito-delete.component.sass']
})
export class TiposCreditoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposCreditoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
