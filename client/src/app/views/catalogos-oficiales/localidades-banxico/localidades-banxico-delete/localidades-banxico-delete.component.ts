import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-localidades-banxico-delete',
  templateUrl: './localidades-banxico-delete.component.html',
  styleUrls: ['./localidades-banxico-delete.component.sass']
})
export class LocalidadesBanxicoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<LocalidadesBanxicoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
