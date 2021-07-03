import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-origen-ingresos-delete',
  templateUrl: './origen-ingresos-delete.component.html',
  styleUrls: ['./origen-ingresos-delete.component.sass']
})
export class OrigenIngresosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<OrigenIngresosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
