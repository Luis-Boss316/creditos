import {Component, Inject, OnInit} from '@angular/core';
import {_fuentesFondeo} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-fuentes-fondeo-form',
  templateUrl: './fuentes-fondeo-form.component.html',
  styleUrls: ['./fuentes-fondeo-form.component.sass']
})
export class FuentesFondeoFormComponent implements OnInit {
  action: string;
  _fuentesFondeoForm: FormGroup;
  dialogTitle: string;
  advanceTable: _fuentesFondeo;

  constructor(public dialogRef: MatDialogRef<FuentesFondeoFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._fuentesFondeoForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._fuentesFondeoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveInstitucionFondeadora: [this.data.data.claveInstitucionFondeadora, Validators.required],
        nombreInstitucionFondeadora: [this.data.data.nombreInstitucionFondeadora, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._fuentesFondeoForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveInstitucionFondeadora: [this.data.data.claveInstitucionFondeadora, Validators.required],
        nombreInstitucionFondeadora: [this.data.data.nombreInstitucionFondeadora, Validators.required],
      });
    }
  }
}
