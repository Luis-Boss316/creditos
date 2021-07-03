import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-propiedad-delete',
  templateUrl: './tipos-propiedad-delete.component.html',
  styleUrls: ['./tipos-propiedad-delete.component.sass']
})
export class TiposPropiedadDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposPropiedadDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
