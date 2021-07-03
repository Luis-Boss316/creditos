import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-valores-tasa-referencia-delete',
  templateUrl: './valores-tasa-referencia-delete.component.html',
  styleUrls: ['./valores-tasa-referencia-delete.component.sass']
})
export class ValoresTasaReferenciaDeleteComponent {

  constructor(public dialogRef: MatDialogRef<ValoresTasaReferenciaDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
