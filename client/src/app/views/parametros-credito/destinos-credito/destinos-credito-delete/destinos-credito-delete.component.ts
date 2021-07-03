import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-destinos-credito-delete',
  templateUrl: './destinos-credito-delete.component.html',
  styleUrls: ['./destinos-credito-delete.component.sass']
})
export class DestinosCreditoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<DestinosCreditoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
