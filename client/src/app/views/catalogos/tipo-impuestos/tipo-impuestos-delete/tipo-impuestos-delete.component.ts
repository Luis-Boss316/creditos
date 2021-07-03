import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipo-impuestos-delete',
  templateUrl: './tipo-impuestos-delete.component.html',
  styleUrls: ['./tipo-impuestos-delete.component.sass']
})
export class TipoImpuestosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TipoImpuestosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
