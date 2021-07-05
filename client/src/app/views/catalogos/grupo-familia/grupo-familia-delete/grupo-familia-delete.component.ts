import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-grupo-familia-delete',
  templateUrl: './grupo-familia-delete.component.html',
  styleUrls: ['./grupo-familia-delete.component.sass']
})
export class GrupoFamiliaDeleteComponent {

  constructor(public dialogRef: MatDialogRef<GrupoFamiliaDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
