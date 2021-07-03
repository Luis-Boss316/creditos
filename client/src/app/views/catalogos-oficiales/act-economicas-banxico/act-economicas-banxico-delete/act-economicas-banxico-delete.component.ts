import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-act-economicas-banxico-delete',
  templateUrl: './act-economicas-banxico-delete.component.html',
  styleUrls: ['./act-economicas-banxico-delete.component.sass']
})
export class ActEconomicasBanxicoDeleteComponent {

  constructor(public dialogRef: MatDialogRef<ActEconomicasBanxicoDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
