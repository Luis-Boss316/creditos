import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-coberturas-geograficas-delete',
  templateUrl: './coberturas-geograficas-delete.component.html',
  styleUrls: ['./coberturas-geograficas-delete.component.sass']
})
export class CoberturasGeograficasDeleteComponent {

  constructor(public dialogRef: MatDialogRef<CoberturasGeograficasDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
