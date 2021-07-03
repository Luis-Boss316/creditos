import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-giro-empresarial-delete',
  templateUrl: './giro-empresarial-delete.component.html',
  styleUrls: ['./giro-empresarial-delete.component.sass']
})
export class GiroEmpresarialDeleteComponent {

  constructor(public dialogRef: MatDialogRef<GiroEmpresarialDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
