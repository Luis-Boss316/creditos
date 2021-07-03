import {Component, Inject, OnInit} from '@angular/core';
import {ProfesionesFormComponent} from "../profesiones-form/profesiones-form.component";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-profesiones-delete',
  templateUrl: './profesiones-delete.component.html',
  styleUrls: ['./profesiones-delete.component.sass']
})
export class ProfesionesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<ProfesionesFormComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
