import {Component, Inject} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-negocio-delete',
  templateUrl: './negocio-delete.component.html',
  styleUrls: ['./negocio-delete.component.sass']
})
export class NegocioDeleteComponent {

  constructor(public dialogRef: MatDialogRef<NegocioDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
