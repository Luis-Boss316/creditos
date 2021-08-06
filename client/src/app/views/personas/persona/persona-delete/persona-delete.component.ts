import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-persona-delete',
  templateUrl: './persona-delete.component.html',
  styleUrls: ['./persona-delete.component.sass']
})
export class PersonaDeleteComponent {

  constructor(public dialogRef: MatDialogRef<PersonaDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
