import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-nacionalidades-delete',
  templateUrl: './nacionalidades-delete.component.html',
  styleUrls: ['./nacionalidades-delete.component.sass']
})
export class NacionalidadesDeleteComponent {

  constructor(public dialogRef: MatDialogRef<NacionalidadesDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
