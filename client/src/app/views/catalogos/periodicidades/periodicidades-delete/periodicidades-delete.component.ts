import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-periodicidades-delete',
  templateUrl: './periodicidades-delete.component.html',
  styleUrls: ['./periodicidades-delete.component.sass']
})
export class PeriodicidadesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<PeriodicidadesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
