import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-garantia-delete',
  templateUrl: './tipos-garantia-delete.component.html',
  styleUrls: ['./tipos-garantia-delete.component.sass']
})
export class TiposGarantiaDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposGarantiaDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
