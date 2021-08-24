import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_combo, _negocios} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-negocio-form',
  templateUrl: './negocio-form.component.html',
  styleUrls: ['./negocio-form.component.scss']
})
export class NegocioFormComponent implements OnInit {
  isLinear: false;
  action: string;
  _datosGeneralesNegociosForm: FormGroup;
  _telefonosNegociosForm: FormGroup;
  _correosNegociosForm: FormGroup;
  _participantesForm: FormGroup;
  _contactosNegociosForm: FormGroup;
  _cuentasBancariasForm: FormGroup;
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
    this.parchar();
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

    this.dialogTitle = this.data.data.alias;

    this._datosGeneralesNegociosForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: null],
      idDatosGenerales: [this.data.data.idDatosGenerales ? this.data.data.idDatosGenerales: null],
      nombre: [this.data.data.nombre ? this.data.data.nombre: null],
      tipoPersona: [this.data.data.tipoPersona ? this.data.data.tipoPersona: null],
      tipoSociedad: [this.data.data.tipoSociedad ? this.data.data.tipoSociedad.id: null],
      tipoOperacion: [this.data.data.tipoOperacion ? this.data.data.tipoOperacion: null],
      fechaInicioOperaciones: [this.data.data.fechaInicioOperaciones ? this.data.data.fechaInicioOperaciones: null],
      fechaInicioRegistro: [this.data.data.fechaInicioRegistro ? this.data.data.fechaInicioRegistro: null],
      actividad: [this.data.data.actividad ? this.data.data.actividad.id: null],
      giro: [this.data.data.giro ? this.data.data.giro.id: null],
      establecimiento: [this.data.data.establecimiento ? this.data.data.establecimiento: null],
      nacionalidad: [this.data.data.nacionalidad ? this.data.data.nacionalidad.id: null],
      paginaWeb: [this.data.data.paginaWeb ? this.data.data.paginaWeb: null],
    });

    this._telefonosNegociosForm = this.advanceTableService.buildForm({
      idTelefonos: [this.data.data.idTelefonos ? this.data.data.idTelefonos: null],
      activo: [this.data.data.activo ? this.data.data.activo: null],
      principal: [this.data.data.principal ? this.data.data.principal: null],
      tipo: [this.data.data.tipo ? this.data.data.tipo: null],
      compania: [this.data.data.compania ? this.data.data.compania: null],
      lada: [this.data.data.lada ? this.data.data.lada: null],
      telefono: [this.data.data.telefono ? this.data.data.telefono: null],
      extencion: [this.data.data.extencion ? this.data.data.extencion: null],
      observaciones: [this.data.data.observaciones ? this.data.data.observaciones: null],
    });

    this._correosNegociosForm = this.advanceTableService.buildForm({
      idCorreos: [this.data.data.idCorreos ? this.data.data.idCorreos: null],
      activo1: [this.data.data.activo1 ? this.data.data.activo1: null],
      principal1: [this.data.data.principal1 ? this.data.data.principal1: null],
      tipo1: [this.data.data.tipo1 ? this.data.data.tipo1: null],
      correo: [this.data.data.correo ? this.data.data.correo: null],
    });

    this._participantesForm = this.advanceTableService.buildForm({
      idParticipantes: [this.data.data.idParticipantes ? this.data.data.idParticipantes: null],
      participante: [this.data.data.participante ? this.data.data.participante: null],
      puesto: [this.data.data.puesto ? this.data.data.puesto: null],
      porcentajeParticipacion: [this.data.data.porcentajeParticipacion ? this.data.data.porcentajeParticipacion: null],
      apoderado: [this.data.data.apoderado ? this.data.data.apoderado: null],
      poder: [this.data.data.poder ? this.data.data.poder: null],
      firma: [this.data.data.firma ? this.data.data.firma: null],
    });

    this._contactosNegociosForm = this.advanceTableService.buildForm({
      idContactos: [this.data.data.idContactos ? this.data.data.idContactos: null],
      relacion: [this.data.data.relacion ? this.data.data.relacion: null],
      persona: [this.data.data.persona ? this.data.data.persona: null],
    });

    this._cuentasBancariasForm = this.advanceTableService.buildForm({
      idCuentas: [this.data.data.idCuentas ? this.data.data.idCuentas: null],
      banco: [this.data.data.banco ? this.data.data.banco: null],
      cuenta: [this.data.data.cuenta ? this.data.data.cuenta: null],
      clabe: [this.data.data.clabe ? this.data.data.clabe: null],
      noTarjeta: [this.data.data.noTarjeta ? this.data.data.noTarjeta: null],
    });

    this._negociosForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id: null],
      idDatosGenerales: [this.data.data.idDatosGenerales ? this.data.data.idDatosGenerales: null],
      nombre: [this.data.data.nombre ? this.data.data.nombre: null],
      tipoPersona: [this.data.data.tipoPersona ? this.data.data.tipoPersona: null],
      tipoSociedad: [this.data.data.tipoSociedad ? this.data.data.tipoSociedad: null],
      tipoOperacion: [this.data.data.tipoOperacion ? this.data.data.tipoOperacion: null],
      fechaInicioOperaciones: [this.data.data.fechaInicioOperaciones ? this.data.data.fechaInicioOperaciones: null],
      fechaInicioRegistro: [this.data.data.fechaInicioRegistro ? this.data.data.fechaInicioRegistro: null],
      actividad: [this.data.data.actividad ? this.data.data.actividad: null],
      giro: [this.data.data.giro ? this.data.data.giro: null],
      establecimiento: [this.data.data.establecimiento ? this.data.data.establecimiento: null],
      nacionalidad: [this.data.data.nacionalidad ? this.data.data.nacionalidad: null],
      paginaWeb: [this.data.data.paginaWeb ? this.data.data.paginaWeb: null],

      idTelefonos: [this.data.data.idTelefonos ? this.data.data.idTelefonos: null],
      activo: [this.data.data.activo ? this.data.data.activo: null],
      principal: [this.data.data.principal ? this.data.data.principal: null],
      tipo: [this.data.data.tipo ? this.data.data.tipo: null],
      compania: [this.data.data.compania ? this.data.data.compania: null],
      lada: [this.data.data.lada ? this.data.data.lada: null],
      telefono: [this.data.data.telefono ? this.data.data.telefono: null],
      extencion: [this.data.data.extencion ? this.data.data.extencion: null],
      observaciones: [this.data.data.observaciones ? this.data.data.observaciones: null],

      idCorreos: [this.data.data.idCorreos ? this.data.data.idCorreos: null],
      activo1: [this.data.data.activo1 ? this.data.data.activo1: null],
      principal1: [this.data.data.principal1 ? this.data.data.principal1: null],
      tipo1: [this.data.data.tipo1 ? this.data.data.tipo1: null],
      correo: [this.data.data.correo ? this.data.data.correo: null],

      idParticipantes: [this.data.data.idParticipantes ? this.data.data.idParticipantes: null],
      participante: [this.data.data.participante ? this.data.data.participante: null],
      puesto: [this.data.data.puesto ? this.data.data.puesto: null],
      porcentajeParticipacion: [this.data.data.porcentajeParticipacion ? this.data.data.porcentajeParticipacion: null],
      apoderado: [this.data.data.apoderado ? this.data.data.apoderado: null],
      poder: [this.data.data.poder ? this.data.data.poder: null],
      firma: [this.data.data.firma ? this.data.data.firma: null],

      idContactos: [this.data.data.idContactos ? this.data.data.idContactos: null],
      relacion: [this.data.data.relacion ? this.data.data.relacion: null],
      persona: [this.data.data.persona ? this.data.data.persona: null],

      idCuentas: [this.data.data.idCuentas ? this.data.data.idCuentas: null],
      banco: [this.data.data.banco ? this.data.data.banco: null],
      cuenta: [this.data.data.cuenta ? this.data.data.cuenta: null],
      clabe: [this.data.data.clabe ? this.data.data.clabe: null],
      noTarjeta: [this.data.data.noTarjeta ? this.data.data.noTarjeta: null],
    });
  }

  parchar(){
    this._negociosForm.patchValue({
      idDatosGenerales: this._datosGeneralesNegociosForm.get('idDatosGenerales').value,
      nombre: this._datosGeneralesNegociosForm.get('nombre').value,
      tipoPersona: this._datosGeneralesNegociosForm.get('tipoPersona').value,
      tipoSociedad: this._datosGeneralesNegociosForm.get('tipoSociedad').value,
      tipoOperacion: this._datosGeneralesNegociosForm.get('tipoOperacion').value,
      fechaInicioOperaciones: this._datosGeneralesNegociosForm.get('fechaInicioOperaciones').value,
      fechaInicioRegistro: this._datosGeneralesNegociosForm.get('fechaInicioRegistro').value,
      actividad: this._datosGeneralesNegociosForm.get('actividad').value,
      giro: this._datosGeneralesNegociosForm.get('giro').value,
      establecimiento: this._datosGeneralesNegociosForm.get('establecimiento').value,
      nacionalidad: this._datosGeneralesNegociosForm.get('nacionalidad').value,
      paginaWeb: this._datosGeneralesNegociosForm.get('paginaWeb').value,

      idTelefonos: this._telefonosNegociosForm.get('idTelefonos').value,
      activo: this._telefonosNegociosForm.get('activo').value,
      principal: this._telefonosNegociosForm.get('principal').value,
      tipo: this._telefonosNegociosForm.get('tipo').value,
      compania: this._telefonosNegociosForm.get('compania').value,
      lada: this._telefonosNegociosForm.get('lada').value,
      telefono: this._telefonosNegociosForm.get('telefono').value,
      extencion: this._telefonosNegociosForm.get('extencion').value,
      observaciones: this._telefonosNegociosForm.get('observaciones').value,

      idCorreos: this._correosNegociosForm.get('idCorreos').value,
      activo1: this._correosNegociosForm.get('activo1').value,
      principal1: this._correosNegociosForm.get('principal1').value,
      tipo1: this._correosNegociosForm.get('tipo1').value,
      correo: this._correosNegociosForm.get('correo').value,

      idParticipantes: this._participantesForm.get('idParticipantes').value,
      participante: this._participantesForm.get('participante').value,
      puesto: this._participantesForm.get('puesto').value,
      porcentajeParticipacion: this._participantesForm.get('porcentajeParticipacion').value,
      apoderado: this._participantesForm.get('apoderado').value,
      poder: this._participantesForm.get('poder').value,
      firma: this._participantesForm.get('firma').value,

      idContactos: this._contactosNegociosForm.get('idContactos').value,
      relacion: this._contactosNegociosForm.get('relacion').value,
      persona: this._contactosNegociosForm.get('persona').value,

      idCuentas: this._cuentasBancariasForm.get('idCuentas').value,
      banco: this._cuentasBancariasForm.get('banco').value,
      cuenta: this._cuentasBancariasForm.get('cuenta').value,
      clabe: this._cuentasBancariasForm.get('clabe').value,
      noTarjeta: this._cuentasBancariasForm.get('noTarjeta').value,
    });
  }
}
