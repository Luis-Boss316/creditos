import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-sociedad-delete',
  templateUrl: './tipos-sociedad-delete.component.html',
  styleUrls: ['./tipos-sociedad-delete.component.sass']
})
export class TiposSociedadDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposSociedadDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
