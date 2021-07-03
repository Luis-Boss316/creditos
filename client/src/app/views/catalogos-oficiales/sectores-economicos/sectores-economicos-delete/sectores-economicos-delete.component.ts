import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-sectores-economicos-delete',
  templateUrl: './sectores-economicos-delete.component.html',
  styleUrls: ['./sectores-economicos-delete.component.sass']
})
export class SectoresEconomicosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<SectoresEconomicosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
