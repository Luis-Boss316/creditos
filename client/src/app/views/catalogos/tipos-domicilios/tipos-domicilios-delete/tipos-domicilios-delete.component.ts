import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";

@Component({
  selector: 'app-tipos-domicilios-delete',
  templateUrl: './tipos-domicilios-delete.component.html',
  styleUrls: ['./tipos-domicilios-delete.component.sass']
})
export class TiposDomiciliosDeleteComponent {

  constructor(public dialogRef: MatDialogRef<TiposDomiciliosDeleteComponent>, @Inject(MAT_DIALOG_DATA) public data: any) { }

  onNoClick(): void { this.dialogRef.close(); }

  confirmDelete(): void { this.dialogRef.close(true); }

}
