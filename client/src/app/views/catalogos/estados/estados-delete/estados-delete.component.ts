import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-estados-delete',
  templateUrl: './estados-delete.component.html',
  styleUrls: ['./estados-delete.component.sass']
})
export class EstadosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<EstadosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
