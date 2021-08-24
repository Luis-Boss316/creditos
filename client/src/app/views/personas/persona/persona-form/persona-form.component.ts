import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_aseguradoras, _combo, _personas} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-persona-form',
  templateUrl: './persona-form.component.html',
  styleUrls: ['./persona-form.component.scss']
})
export class PersonaFormComponent implements OnInit {
  isLinear = false;
  action: string;
  _datosGeneralesForm: FormGroup;
  _datosAlternosForm: FormGroup;
  _datosBancariosForm: FormGroup;
  _correosForm: FormGroup;
  _contactoForm: FormGroup;
  _telefonoForm: FormGroup;
  _personasForm: FormGroup;
  dialogTitle: string;
  advanceTable: _personas;

  public estadoCivilCombo: _combo[];
  public nacionalidadCombo: _combo[];
  public giroEmpresarialCombo: _combo[];
  public paisNacimientoCombo: _combo[];
  public estadoNacimientoCombo: _combo[];
  public tipoRelacionesCombo: _combo[];

  constructor(public dialogRef: MatDialogRef<PersonaFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) { }

  submit() {}

  onNoClick(): void {
    this.dialogRef.close();
  }
  public confirmAdd(): void {
    this.parchar();
    this.dialogRef.close(this._personasForm.value);
  }

  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'EstadoCivil'}, 'comboController').subscribe(result =>
      this.estadoCivilCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidadCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'GiroEmpresarial'}, 'comboController').subscribe(result =>
      this.giroEmpresarialCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paisNacimientoCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Estados'}, 'comboController').subscribe(result =>
      this.estadoNacimientoCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'TiposRelaciones'}, 'comboController').subscribe(result =>
      this.tipoRelacionesCombo = result);

    this.dialogTitle = this.data.data.alias;

    this._datosGeneralesForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: null],
      idDatosGenerales: [this.data.data.idDatosGenerales ? this.data.data.idDatosGenerales: null],
      primerNombre: [this.data.data.primerNombre ? this.data.data.primerNombre: null],
      segundoNombre: [this.data.data.segundoNombre ? this.data.data.segundoNombre: null],
      apellidoPaterno: [this.data.data.apellidoPaterno ? this.data.data.apellidoPaterno: null],
      apellidoMaterno: [this.data.data.apellidoMaterno ? this.data.data.apellidoMaterno: null],
      genero: [this.data.data.genero ? this.data.data.genero: null],
      estadoCivil: [this.data.data.estadoCivil ? this.data.data.estadoCivil.id: null],
      nacionalidad: [this.data.data.nacionalidad ? this.data.data.nacionalidad.id: null],
      fechaNacimiento: [this.data.data.fechaNacimiento ? this.data.data.fechaNacimiento: null],
      actividad: [this.data.data.actividad ? this.data.data.actividad: null],
      giro: [this.data.data.giro ? this.data.data.giro.id: null],
      paisNacimiento: [this.data.data.paisNacimiento ? this.data.data.paisNacimiento.id: null],
      estadoNacimiento: [this.data.data.estadoNacimiento ? this.data.data.estadoNacimiento.id: null],
    });

    this._datosAlternosForm = this.advanceTableService.buildForm({
      idDatosAlternos: [this.data.data.idDatosAlternos ? this.data.data.idDatosAlternos: null],
      primerNombreA: [this.data.data.primerNombreA ? this.data.data.primerNombreA: null],
      segundoNombreA: [this.data.data.segundoNombreA ? this.data.data.segundoNombreA: null],
      apellidoPaternoA: [this.data.data.apellidoPaternoA ? this.data.data.apellidoPaternoA: null],
      apellidoMaternoA: [this.data.data.apellidoMaternoA ? this.data.data.apellidoMaternoA: null],
    });

    this._datosBancariosForm = this.advanceTableService.buildForm({
      idDatosBancarios: [this.data.data.idDatosBancarios ? this.data.data.idDatosBancarios: null],
      banco: [this.data.data.banco ? this.data.data.banco: null],
      cuenta: [this.data.data.cuenta ? this.data.data.cuenta: null],
      clabe: [this.data.data.clabe ? this.data.data.clabe: null],
      noTarjeta: [this.data.data.noTarjeta ? this.data.data.noTarjeta: null],
    });

    this._correosForm = this.advanceTableService.buildForm({
      idCorreos: [this.data.data.idCorreos ? this.data.data.idCorreos: null],
      activo: [this.data.data.activo ? this.data.data.activo: null],
      principal: [this.data.data.principal ? this.data.data.principal: null],
      tipo: [this.data.data.tipo ? this.data.data.tipo: null],
      correo: [this.data.data.correo ? this.data.data.correo: null],
    });

    this._contactoForm = this.advanceTableService.buildForm({
      idContactos: [this.data.data.idContactos ? this.data.data.idContactos: null],
      relacion: [this.data.data.relacion ? this.data.data.relacion.id: null],
      persona: [this.data.data.persona ? this.data.data.persona: null],
    });

    this._telefonoForm = this.advanceTableService.buildForm({
      idTelefonos: [this.data.data.idTelefonos ? this.data.data.idTelefonos: null],
      activo1: [this.data.data.activo1 ? this.data.data.activo1: null],
      principal1: [this.data.data.principal1 ? this.data.data.principal1: null],
      tipo1: [this.data.data.tipo1 ? this.data.data.tipo1: null],
      compania: [this.data.data.compania ? this.data.data.compania: null],
      lada: [this.data.data.lada ? this.data.data.lada: null],
      telefono: [this.data.data.telefono ? this.data.data.telefono: null],
      extencion: [this.data.data.extencion ? this.data.data.extencion: null],
      observaciones: [this.data.data.observaciones ? this.data.data.observaciones: null],
    });

    this._personasForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: null],
      idDatosGenerales: [this.data.data.idDatosGenerales ? this.data.data.idDatosGenerales: null],
      primerNombre: [this.data.data.primerNombre ? this.data.data.primerNombre: null],
      segundoNombre: [this.data.data.segundoNombre ? this.data.data.segundoNombre: null],
      apellidoPaterno: [this.data.data.apellidoPaterno ? this.data.data.apellidoPaterno: null],
      apellidoMaterno: [this.data.data.apellidoMaterno ? this.data.data.apellidoMaterno: null],
      genero: [this.data.data.genero ? this.data.data.genero: null],
      estadoCivil: [this.data.data.estadoCivil ? this.data.data.estadoCivil: null],
      nacionalidad: [this.data.data.nacionalidad ? this.data.data.nacionalidad: null],
      fechaNacimiento: [this.data.data.fechaNacimiento ? this.data.data.fechaNacimiento: null],
      actividad: [this.data.data.actividad ? this.data.data.actividad: null],
      giro: [this.data.data.giro ? this.data.data.giro: null],
      paisNacimiento: [this.data.data.paisNacimiento ? this.data.data.paisNacimiento: null],
      estadoNacimiento: [this.data.data.estadoNacimiento ? this.data.data.estadoNacimiento: null],

      idDatosAlternos: [this.data.data.idDatosAlternos ? this.data.data.idDatosAlternos: null],
      primerNombreA: [this.data.data.primerNombreA ? this.data.data.primerNombreA: null],
      segundoNombreA: [this.data.data.segundoNombreA ? this.data.data.segundoNombreA: null],
      apellidoPaternoA: [this.data.data.apellidoPaternoA ? this.data.data.apellidoPaternoA: null],
      apellidoMaternoA: [this.data.data.apellidoMaternoA ? this.data.data.apellidoMaternoA: null],

      idDatosBancarios: [this.data.data.idDatosBancarios ? this.data.data.idDatosBancarios: null],
      banco: [this.data.data.banco ? this.data.data.banco: null],
      cuenta: [this.data.data.cuenta ? this.data.data.cuenta: null],
      clabe: [this.data.data.clabe ? this.data.data.clabe: null],
      noTarjeta: [this.data.data.noTarjeta ? this.data.data.noTarjeta: null],

      idCorreos: [this.data.data.idCorreos ? this.data.data.idCorreos: null],
      activo: [this.data.data.activo ? this.data.data.activo: null],
      principal: [this.data.data.principal ? this.data.data.principal: null],
      tipo: [this.data.data.tipo ? this.data.data.tipo: null],
      correo: [this.data.data.correo ? this.data.data.correo: null],

      idContactos: [this.data.data.idContactos ? this.data.data.idContactos: null],
      relacion: [this.data.data.relacion ? this.data.data.relacion: null],
      persona: [this.data.data.persona ? this.data.data.persona: null],

      idTelefonos: [this.data.data.idTelefonos ? this.data.data.idTelefonos: null],
      activo1: [this.data.data.activo1 ? this.data.data.activo1: null],
      principal1: [this.data.data.principal1 ? this.data.data.principal1: null],
      tipo1: [this.data.data.tipo1 ? this.data.data.tipo1: null],
      compania: [this.data.data.compania ? this.data.data.compania: null],
      lada: [this.data.data.lada ? this.data.data.lada: null],
      telefono: [this.data.data.telefono ? this.data.data.telefono: null],
      extencion: [this.data.data.extencion ? this.data.data.extencion: null],
      observaciones: [this.data.data.observaciones ? this.data.data.observaciones: null],
    });
  }

  parchar() {
    this._personasForm.patchValue({
      idDatosGenerales: this._datosGeneralesForm.get('idDatosGenerales').value,
      primerNombre: this._datosGeneralesForm.get('primerNombre').value,
      segundoNombre: this._datosGeneralesForm.get('segundoNombre').value,
      apellidoPaterno: this._datosGeneralesForm.get('apellidoPaterno').value,
      apellidoMaterno: this._datosGeneralesForm.get('apellidoMaterno').value,
      genero: this._datosGeneralesForm.get('genero').value,
      estadoCivil: this._datosGeneralesForm.get('estadoCivil').value,
      nacionalidad: this._datosGeneralesForm.get('nacionalidad').value,
      fechaNacimiento: this._datosGeneralesForm.get('fechaNacimiento').value,
      actividad: this._datosGeneralesForm.get('actividad').value,
      giro: this._datosGeneralesForm.get('giro').value,
      paisNacimiento: this._datosGeneralesForm.get('paisNacimiento').value,
      estadoNacimiento: this._datosGeneralesForm.get('estadoNacimiento').value,

      idDatosAlternos: this._datosAlternosForm.get('idDatosAlternos').value,
      primerNombreA: this._datosAlternosForm.get('primerNombreA').value,
      segundoNombreA: this._datosAlternosForm.get('segundoNombreA').value,
      apellidoPaternoA: this._datosAlternosForm.get('apellidoPaternoA').value,
      apellidoMaternoA: this._datosAlternosForm.get('apellidoMaternoA').value,

      idDatosBancarios: this._datosBancariosForm.get('idDatosBancarios').value,
      banco: this._datosBancariosForm.get('banco').value,
      cuenta: this._datosBancariosForm.get('cuenta').value,
      clabe: this._datosBancariosForm.get('clabe').value,
      noTarjeta: this._datosBancariosForm.get('noTarjeta').value,

      idCorreos: this._correosForm.get('idCorreos').value,
      activo: this._correosForm.get('activo').value,
      principal: this._correosForm.get('principal').value,
      tipo: this._correosForm.get('tipo').value,
      correo: this._correosForm.get('correo').value,

      idContactos: this._contactoForm.get('idContactos').value,
      relacion: this._contactoForm.get('relacion').value,
      persona: this._contactoForm.get('persona').value,

      idTelefonos: this._telefonoForm.get('idTelefonos').value,
      activo1: this._telefonoForm.get('activo1').value,
      principal1: this._telefonoForm.get('principal1').value,
      tipo1: this._telefonoForm.get('tipo1').value,
      compania: this._telefonoForm.get('compania').value,
      lada: this._telefonoForm.get('lada').value,
      telefono: this._telefonoForm.get('telefono').value,
      extencion: this._telefonoForm.get('extencion').value,
      observaciones: this._telefonoForm.get('observaciones').value,
    });
  }
}
