import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _contactos, _contactosNegocios} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-contactos-negocios-form',
  templateUrl: './contactos-negocios-form.component.html',
  styleUrls: ['./contactos-negocios-form.component.sass']
})
export class ContactosNegociosFormComponent implements OnInit {
  action: string;
  _contactosNegociosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _contactosNegocios;
  public nombreCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<ContactosNegociosFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._contactosNegociosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'Negocios'}, 'comboController').subscribe(result =>
      this.nombreCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._contactosNegociosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre.id, Validators.required],
        relacion: [this.data.data.relacion.id, Validators.required],
        persona: [this.data.data.persona, Validators.required],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._contactosNegociosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        relacion: [this.data.data.relacion, Validators.required],
        persona: [this.data.data.persona, Validators.required],
      });
    }
  }
}
