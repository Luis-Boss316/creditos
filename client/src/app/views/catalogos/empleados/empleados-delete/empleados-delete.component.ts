import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-empleados-delete',
  templateUrl: './empleados-delete.component.html',
  styleUrls: ['./empleados-delete.component.sass']
})
export class EmpleadosDeleteComponent {

  constructor( public dialogRef: MatDialogRef<EmpleadosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any ) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
