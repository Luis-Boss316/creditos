import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-identificaciones-delete',
  templateUrl: './tipos-identificaciones-delete.component.html',
  styleUrls: ['./tipos-identificaciones-delete.component.sass']
})
export class TiposIdentificacionesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposIdentificacionesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
