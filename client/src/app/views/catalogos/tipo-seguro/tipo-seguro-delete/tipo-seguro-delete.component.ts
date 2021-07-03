import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipo-seguro-delete',
  templateUrl: './tipo-seguro-delete.component.html',
  styleUrls: ['./tipo-seguro-delete.component.sass']
})
export class TipoSeguroDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TipoSeguroDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
