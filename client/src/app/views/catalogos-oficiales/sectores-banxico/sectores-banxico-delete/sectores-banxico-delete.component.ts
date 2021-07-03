import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-sectores-banxico-delete',
  templateUrl: './sectores-banxico-delete.component.html',
  styleUrls: ['./sectores-banxico-delete.component.sass']
})
export class SectoresBanxicoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<SectoresBanxicoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
