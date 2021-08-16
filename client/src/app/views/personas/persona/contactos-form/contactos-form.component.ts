import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _contactos, _datosAlternos} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-contactos-form',
  templateUrl: './contactos-form.component.html',
  styleUrls: ['./contactos-form.component.sass']
})
export class ContactosFormComponent implements OnInit {
  action: string;
  _contactosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _contactos;
  public nombreCombo: _combo[];
  public relacionCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<ContactosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._contactosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Personas'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'TiposRelaciones'}, 'comboController').subscribe(result =>
      this.relacionCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._contactosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre.id, Validators.required],
        relacion: [this.data.data.relacion.id, Validators.required],
        persona: [this.data.data.persona, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._contactosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        relacion: [this.data.data.relacion, Validators.required],
        persona: [this.data.data.persona, Validators.required],
      });
    }
  }
}
