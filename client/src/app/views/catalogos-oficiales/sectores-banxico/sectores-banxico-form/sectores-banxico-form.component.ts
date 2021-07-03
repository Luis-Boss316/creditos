import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_sectoresBanxico} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-sectores-banxico-form',
  templateUrl: './sectores-banxico-form.component.html',
  styleUrls: ['./sectores-banxico-form.component.sass']
})
export class SectoresBanxicoFormComponent implements OnInit {
  action: string;
  _sectoresForm: FormGroup;
  dialogTitle: string;
  advanceTable: _sectoresBanxico;

  constructor(public dialogRef: MatDialogRef<SectoresBanxicoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._sectoresForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._sectoresForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveSector: [this.data.data.claveSector, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._sectoresForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveSector: [this.data.data.claveSector, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
