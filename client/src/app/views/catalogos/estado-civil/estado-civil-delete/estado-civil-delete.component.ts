import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-estado-civil-delete',
  templateUrl: './estado-civil-delete.component.html',
  styleUrls: ['./estado-civil-delete.component.sass']
})
export class EstadoCivilDeleteComponent {

  constructor(public dialogRef: MatDialogRef<EstadoCivilDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
