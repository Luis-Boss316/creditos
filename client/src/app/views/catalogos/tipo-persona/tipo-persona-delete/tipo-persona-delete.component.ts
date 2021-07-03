import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipo-persona-delete',
  templateUrl: './tipo-persona-delete.component.html',
  styleUrls: ['./tipo-persona-delete.component.sass']
})
export class TipoPersonaDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TipoPersonaDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
