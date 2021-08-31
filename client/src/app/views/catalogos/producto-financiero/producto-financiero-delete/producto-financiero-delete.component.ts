import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-producto-financiero-delete',
  templateUrl: './producto-financiero-delete.component.html',
  styleUrls: ['./producto-financiero-delete.component.sass']
})
export class ProductoFinancieroDeleteComponent {

  constructor( public dialogRef: MatDialogRef<ProductoFinancieroDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any ) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
