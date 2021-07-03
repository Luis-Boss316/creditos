import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-instituciones-ycontrapartes-delete',
  templateUrl: './instituciones-ycontrapartes-delete.component.html',
  styleUrls: ['./instituciones-ycontrapartes-delete.component.sass']
})
export class InstitucionesYcontrapartesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<InstitucionesYcontrapartesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
