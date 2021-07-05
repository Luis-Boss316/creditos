import {Component, Inject, OnInit} from '@angular/core';
import {_grupoFamilia} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-grupo-familia-form',
  templateUrl: './grupo-familia-form.component.html',
  styleUrls: ['./grupo-familia-form.component.sass']
})
export class GrupoFamiliaFormComponent implements OnInit {
  action: string;
  _grupoFamiliaForm: FormGroup;
  dialogTitle: string;
  advanceTable: _grupoFamilia;

  constructor(public dialogRef: MatDialogRef<GrupoFamiliaFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._grupoFamiliaForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._grupoFamiliaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        grupoFamilia: [this.data.data.grupoFamilia, Validators.required],

      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._grupoFamiliaForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        grupoFamilia: [this.data.data.grupoFamilia, Validators.required],

      });
    }
  }
}
