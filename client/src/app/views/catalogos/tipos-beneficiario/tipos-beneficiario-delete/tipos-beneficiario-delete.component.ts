import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-beneficiario-delete',
  templateUrl: './tipos-beneficiario-delete.component.html',
  styleUrls: ['./tipos-beneficiario-delete.component.sass']
})
export class TiposBeneficiarioDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposBeneficiarioDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
