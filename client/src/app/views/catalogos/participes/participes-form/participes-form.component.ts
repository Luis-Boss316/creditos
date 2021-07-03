import {Component, Inject, OnInit} from '@angular/core';
import {_participes} from "../../../../shared/interfaces/Creditos.interface";
import {FormGroup, Validators} from "@angular/forms";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-participes-form',
  templateUrl: './participes-form.component.html',
  styleUrls: ['./participes-form.component.sass']
})
export class ParticipesFormComponent implements OnInit {
  action: string;
  _participesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _participes;

  constructor(public dialogRef: MatDialogRef<ParticipesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._participesForm.value);
  }

  ngOnInit(): void {
    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._participesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        claveParticipe: [this.data.data.claveParticipe, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._participesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        claveParticipe: [this.data.data.claveParticipe, Validators.required],
        descripcion: [this.data.data.descripcion, Validators.required],
      });
    }
  }
}
