import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _participantes, _telefonosNegocios} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-participantes-form',
  templateUrl: './participantes-form.component.html',
  styleUrls: ['./participantes-form.component.sass']
})
export class ParticipantesFormComponent implements OnInit {
  action: string;
  _participantesForm: FormGroup;
  dialogTitle: string;
  advanceTable: _participantes;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<ParticipantesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._participantesForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Negocios'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._participantesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre.id, Validators.required],
        participante: [this.data.data.participante],
        puesto: [this.data.data.puesto],
        porcentajeParticipacion: [this.data.data.porcentajeParticipacion, Validators.required],
        apoderado: [this.data.data.apoderado, Validators.required],
        poder: [this.data.data.poder, Validators.required],
        firma: [this.data.data.firma, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._participantesForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        participante: [this.data.data.participante],
        puesto: [this.data.data.puesto],
        porcentajeParticipacion: [this.data.data.porcentajeParticipacion, Validators.required],
        apoderado: [this.data.data.apoderado, Validators.required],
        poder: [this.data.data.poder, Validators.required],
        firma: [this.data.data.firma, Validators.required],
      });
    }
  }
}
