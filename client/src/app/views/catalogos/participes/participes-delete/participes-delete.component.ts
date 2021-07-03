import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-participes-delete',
  templateUrl: './participes-delete.component.html',
  styleUrls: ['./participes-delete.component.sass']
})
export class ParticipesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<ParticipesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
