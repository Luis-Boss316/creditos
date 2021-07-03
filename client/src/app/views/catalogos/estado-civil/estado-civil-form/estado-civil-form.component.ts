import {Component, Inject, OnInit} from '@angular/core';
import {_estadoCivil} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-estado-civil-form',
  templateUrl: './estado-civil-form.component.html',
  styleUrls: ['./estado-civil-form.component.sass']
})
export class EstadoCivilFormComponent implements OnInit {
  action: string;
  _estadoCivilForm: FormGroup;
  dialogTitle: string;
  advanceTable: _estadoCivil;

  constructor(public dialogRef: MatDialogRef<EstadoCivilFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._estadoCivilForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.nombre;
      this._estadoCivilForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveEstadoCivil: [this.data.data.claveEstadoCivil, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        casado: [this.data.data.casado],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._estadoCivilForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveEstadoCivil: [this.data.data.claveEstadoCivil, Validators.required],
        descripcionCorta: [this.data.data.descripcionCorta, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
        casado: [this.data.data.casado],
      });
    }
  }
}
