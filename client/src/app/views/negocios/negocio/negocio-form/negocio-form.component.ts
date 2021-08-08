import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _negocios} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-negocio-form',
  templateUrl: './negocio-form.component.html',
  styleUrls: ['./negocio-form.component.sass']
})
export class NegocioFormComponent implements OnInit {
  action: string;
  _negociosForm: FormGroup;
  dialogTitle: string;
  advanceTable: _negocios;
  public tipoSociedadCombo: _combo[];
  public actividadCombo: _combo[];
  public giroCombo: _combo[];
  public nacionalidadCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<NegocioFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.dialogRef.close(this._negociosForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'TiposSociedad'}, 'comboController').subscribe(result =>
      this.tipoSociedadCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Ocupaciones'}, 'comboController').subscribe(result =>
      this.actividadCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'GiroEmpresarial'}, 'comboController').subscribe(result =>
      this.giroCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidadCombo = result);

    this.action = this.data.action;
    if (this.action === 'Editar') {
      this.dialogTitle = this.data.data.descripcionCorta;
      this._negociosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id, Validators.required],
        nombre: [this.data.data.nombre, Validators.required],
        tipoPersona: [this.data.data.tipoPersona],
        tipoSociedad: [this.data.data.tipoSociedad.id],
        tipoOperacion: [this.data.data.tipoOperacion],
        fechaInicioOperaciones: [this.data.data.fechaInicioOperaciones, Validators.required],
        fechaInicioRegistro: [this.data.data.fechaInicioRegistro, Validators.required],
        actividad: [this.data.data.actividad.id],
        giro: [this.data.data.giro.id],
        establecimiento: [this.data.data.establecimiento, Validators.required],
        nacionalidad: [this.data.data.nacionalidad.id, Validators.required],
        paginaWeb: [this.data.data.paginaWeb],
      });
    } else {
      this.dialogTitle = 'Crear ' + this.data.title;
      this._negociosForm = this.advanceTableService.buildForm({
        id: [this.data.data.id],
        nombre: [this.data.data.nombre, Validators.required],
        tipoPersona: [this.data.data.tipoPersona],
        tipoSociedad: [this.data.data.tipoSociedad],
        tipoOperacion: [this.data.data.tipoOperacion],
        fechaInicioOperaciones: [this.data.data.fechaInicioOperaciones, Validators.required],
        fechaInicioRegistro: [this.data.data.fechaInicioRegistro, Validators.required],
        actividad: [this.data.data.actividad],
        giro: [this.data.data.giro],
        establecimiento: [this.data.data.establecimiento, Validators.required],
        nacionalidad: [this.data.data.nacionalidad, Validators.required],
        paginaWeb: [this.data.data.paginaWeb],
      });
    }
  }
}
