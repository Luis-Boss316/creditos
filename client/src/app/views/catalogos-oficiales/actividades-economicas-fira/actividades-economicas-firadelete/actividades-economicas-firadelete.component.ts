import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-actividades-economicas-firadelete',
  templateUrl: './actividades-economicas-firadelete.component.html',
  styleUrls: ['./actividades-economicas-firadelete.component.sass']
})
export class ActividadesEconomicasFIRADeleteComponent {

  constructor(public dialogRef: MatDialogRef<ActividadesEconomicasFIRADeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
