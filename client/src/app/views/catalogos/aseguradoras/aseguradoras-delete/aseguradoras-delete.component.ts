import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-aseguradoras-delete',
  templateUrl: './aseguradoras-delete.component.html',
  styleUrls: ['./aseguradoras-delete.component.sass']
})
export class AseguradorasDeleteComponent {

  constructor( public dialogRef: MatDialogRef<AseguradorasDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any ) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
