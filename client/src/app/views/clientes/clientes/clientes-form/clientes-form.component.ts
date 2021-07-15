import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup, Validators} from "@angular/forms";
import {_clientes, _combo} from "../../../../shared/interfaces/Creditos.interface";
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {AdvanceRestService} from "../../../../shared/services/advance-rest.service";

@Component({
  selector: 'app-clientes-form',
  templateUrl: './clientes-form.component.html',
  styleUrls: ['./clientes-form.component.sass']
})
export class ClientesFormComponent implements OnInit {
  isLinear = false;
  action: string;
  _titularForm: FormGroup;
  _cotitularForm: FormGroup;
  dialogTitle: string;
  advanceTable: _clientes;
  public grupoFamiliaCombo: _combo[];
  public promotorCombo: _combo[];
  public tipoInversionistasCombo: _combo[];
  public estadosCombo: _combo[];
  public profesionesCombo: _combo[];
  public actVulnerableCombo: _combo[];
  public nacionalidadesCombo: _combo[];
  public nacionalidades2Combo: _combo[];
  public paisesCombo: _combo[];
  public nacionalidades3Combo: _combo[];
  public nacionalidades4Combo: _combo[];

  constructor(public dialogRef: MatDialogRef<ClientesFormComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              public advanceTableService: AdvanceRestService,) {
  }

  submit() {
  }

  onNoClick(): void {
    this.dialogRef.close();
  }

  public confirmAdd(): void {
    this.dialogRef.close(this._titularForm.value);
  }


  ngOnInit(): void {
    this.advanceTableService.combo<_combo[]>({id: 'GrupoFamilia'}, 'comboController').subscribe(result =>
      this.grupoFamiliaCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Promotor'}, 'comboController').subscribe(result =>
      this.promotorCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'TipoInversionistas'}, 'comboController').subscribe(result =>
      this.tipoInversionistasCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Estados'}, 'comboController').subscribe(result =>
      this.estadosCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Profesiones'}, 'comboController').subscribe(result =>
      this.profesionesCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'ActVulnerable'}, 'comboController').subscribe(result =>
      this.actVulnerableCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidadesCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidades2Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paisesCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidades3Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidades4Combo = result);


    this.dialogTitle = this.data.data.alias;

    this._titularForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id : ''],
      titularNombre: [this.data.data.titularNombre ? this.data.data.titularNombre: ''],
      apellidoPaterno: [this.data.data.apellidoPaterno ? this.data.data.apellidoPaterno: ''],
      apellidoMaterno: [this.data.data.apellidoMaterno ? this.data.data.apellidoMaterno: ''],
      grupoFamilia: [this.data.data.grupoFamilia ? this.data.data.grupoFamilia: ''],
      promotor: [this.data.data.promotor ? this.data.data.promotor: ''],
      tipoInversionista: [this.data.data.tipoInversionista ? this.data.data.tipoInversionista: ''],
      excentoIsr: [this.data.data.excentoIsr ? this.data.data.excentoIsr: ''],
      excentoIva: [this.data.data.excentoIva ? this.data.data.excentoIva: ''],
      fechaNacimiento: [this.data.data.fechaNacimiento ? this.data.data.fechaNacimiento: ''],
      entidadFederativaNacimiento: [this.data.data.entidadFederativaNacimiento ? this.data.data.entidadFederativaNacimiento: ''],
      fechaInicioOperaciones: [this.data.data.fechaInicioOperaciones ? this.data.data.fechaInicioOperaciones: ''],
      estadoCivil: [this.data.data.estadoCivil ? this.data.data.estadoCivil: ''],
      profesion: [this.data.data.profesion ? this.data.data.profesion: ''],
      nombreEmpresaPrestaServicios: [this.data.data.nombreEmpresaPrestaServicios ? this.data.data.nombreEmpresaPrestaServicios: ''],
      nombrePuesto: [this.data.data.nombrePuesto ? this.data.data.nombrePuesto: ''],
      funcionesGeneralesDirectivas: [this.data.data.funcionesGeneralesDirectivas ? this.data.data.funcionesGeneralesDirectivas: ''],
      nivelJerarquico: [this.data.data.nivelJerarquico ? this.data.data.nivelJerarquico: ''],
      antiguedadEmpleo: [this.data.data.antiguedadEmpleo ? this.data.data.antiguedadEmpleo: ''],
      sectorEmpresa: [this.data.data.sectorEmpresa ? this.data.data.sectorEmpresa: ''],
      giroEmpresa: [this.data.data.giroEmpresa ? this.data.data.giroEmpresa: ''],
      tipoIngreso: [this.data.data.tipoIngreso ? this.data.data.tipoIngreso: ''],
      ingresoAdicional: [this.data.data.ingresoAdicional ? this.data.data.ingresoAdicional: ''],
      sectorPrestaServicio: [this.data.data.sectorPrestaServicio ? this.data.data.sectorPrestaServicio: ''],
      giroEspecificoServicios: [this.data.data.giroEspecificoServicios ? this.data.data.giroEspecificoServicios: ''],
      sectorEmpresa2: [this.data.data.sectorEmpresa2 ? this.data.data.sectorEmpresa2: ''],
      razonSocialEmpresa: [this.data.data.razonSocialEmpresa ? this.data.data.razonSocialEmpresa: ''],
      actividadEmpresa: [this.data.data.actividadEmpresa ? this.data.data.actividadEmpresa: ''],
      ingresoAdicional2: [this.data.data.ingresoAdicional2 ? this.data.data.ingresoAdicional2: ''],
      ocupacionActual: [this.data.data.ocupacionActual ? this.data.data.ocupacionActual: ''],
      fuenteIngresos: [this.data.data.fuenteIngresos ? this.data.data.fuenteIngresos: ''],
      sociedadesAsociacionesRFCEmpresa: [this.data.data.sociedadesAsociacionesRFCEmpresa ? this.data.data.sociedadesAsociacionesRFCEmpresa: ''],
      nacionalidadEmpresa: [this.data.data.nacionalidadEmpresa ? this.data.data.nacionalidadEmpresa: ''],
      telefonoEmpresa: [this.data.data.telefonoEmpresa ? this.data.data.telefonoEmpresa: ''],
      sectorEmpresa3: [this.data.data.sectorEmpresa3 ? this.data.data.sectorEmpresa3: ''],
      actividadGiroEspecificoEmpresa: [this.data.data.actividadGiroEspecificoEmpresa ? this.data.data.actividadGiroEspecificoEmpresa: ''],
      porcentajeCapitalSocial: [this.data.data.porcentajeCapitalSocial ? this.data.data.porcentajeCapitalSocial: ''],
      consejeroEmpresaRFCEmpresa: [this.data.data.consejeroEmpresaRFCEmpresa ? this.data.data.consejeroEmpresaRFCEmpresa: ''],
      nacionalidadEmpresa2: [this.data.data.nacionalidadEmpresa2 ? this.data.data.nacionalidadEmpresa2: ''],
      telefonoEmpresa2: [this.data.data.telefonoEmpresa2 ? this.data.data.telefonoEmpresa2: ''],
      sectorEmpresa4: [this.data.data.sectorEmpresa4 ? this.data.data.sectorEmpresa4: ''],
      actividadGiroEmpresa3: [this.data.data.actividadGiroEmpresa3 ? this.data.data.actividadGiroEmpresa3: ''],
      vinculoPatrimonial: [this.data.data.vinculoPatrimonial ? this.data.data.vinculoPatrimonial: ''],
      consejeroEmpresa: [this.data.data.consejeroEmpresa ? this.data.data.consejeroEmpresa: ''],
      cargoDesempeno: [this.data.data.cargoDesempeno ? this.data.data.cargoDesempeno: ''],
      nombreInstitucion: [this.data.data.nombreInstitucion ? this.data.data.nombreInstitucion: ''],
      institucionCargoExtranjero: [this.data.data.institucionCargoExtranjero ? this.data.data.institucionCargoExtranjero: ''],
      pais: [this.data.data.pais ? this.data.data.pais: ''],
      cargo: [this.data.data.cargo ? this.data.data.cargo: ''],
      relacionPersonaNacionalExtranjera: [this.data.data.relacionPersonaNacionalExtranjera ? this.data.data.relacionPersonaNacionalExtranjera: ''],
      cargo2: [this.data.data.cargo2 ? this.data.data.cargo2: ''],
      institucionDesempenaCargo: [this.data.data.institucionDesempenaCargo ? this.data.data.institucionDesempenaCargo: ''],
    });

    this._cotitularForm = this.advanceTableService.buildForm({
      nombreCotitular: [this.data.data.nombreCotitular ? this.data.data.nombreCotitular: ''],
      apellidoPaternoC: [this.data.data.apellidoPaternoC ? this.data.data.apellidoPaternoC: ''],
      apellidoMaternoC: [this.data.data.apellidoMaternoC ? this.data.data.apellidoMaternoC: ''],
      estadoCivilC: [this.data.data.estadoCivilC ? this.data.data.estadoCivilC: ''],
      lugarPrestaServicios: [this.data.data.lugarPrestaServicios ? this.data.data.lugarPrestaServicios: ''],
      nombrePuestoC: [this.data.data.nombrePuestoC ? this.data.data.nombrePuestoC: ''],
      funcionesGeneralesDirectivasC: [this.data.data.funcionesGeneralesDirectivasC ? this.data.data.funcionesGeneralesDirectivasC: ''],
      nivelJerarquicoC: [this.data.data.nivelJerarquicoC ? this.data.data.nivelJerarquicoC: ''],
      antiguedadEmpleoC: [this.data.data.antiguedadEmpleoC ? this.data.data.antiguedadEmpleoC: ''],
      sectorEmpresaC: [this.data.data.sectorEmpresaC ? this.data.data.sectorEmpresaC: ''],
      tipoIngresoC: [this.data.data.tipoIngresoC ? this.data.data.tipoIngresoC: ''],
      ingresoAdicionalC: [this.data.data.ingresoAdicionalC ? this.data.data.ingresoAdicionalC: ''],
      formasProporcionaServicios: [this.data.data.formasProporcionaServicios ? this.data.data.formasProporcionaServicios: ''],
      sectorPrestaServicios: [this.data.data.sectorPrestaServicios ? this.data.data.sectorPrestaServicios: ''],
      actividadGiroEEmpresaC: [this.data.data.actividadGiroEEmpresaC ? this.data.data.actividadGiroEEmpresaC: ''],
      rfcEmpresa: [this.data.data.rfcEmpresa ? this.data.data.rfcEmpresa: ''],
      sectorDEmpresaC: [this.data.data.sectorDEmpresaC ? this.data.data.sectorDEmpresaC: ''],
      actividadGiroEmpresaC: [this.data.data.actividadGiroEmpresaC ? this.data.data.actividadGiroEmpresaC: ''],
      cingresoAdicionalC: [this.data.data.cingresoAdicionalC ? this.data.data.cingresoAdicionalC: ''],
      ocupacionActualC: [this.data.data.ocupacionActualC ? this.data.data.ocupacionActualC: ''],
      fuenteIngresoC: [this.data.data.fuenteIngresoC ? this.data.data.fuenteIngresoC: ''],
      razonSocialEmpresaC: [this.data.data.razonSocialEmpresaC ? this.data.data.razonSocialEmpresaC: ''],
      rfc: [this.data.data.rfc ? this.data.data.rfc: ''],
      nacionalidadEmpresaC: [this.data.data.nacionalidadEmpresaC ? this.data.data.nacionalidadEmpresaC: ''],
      telefonoEmpresaC: [this.data.data.telefonoEmpresaC ? this.data.data.telefonoEmpresaC: ''],
      sectorDeEmpresaC: [this.data.data.sectorDeEmpresaC ? this.data.data.sectorDeEmpresaC: ''],
      actividadDeEmpresaC: [this.data.data.actividadDeEmpresaC ? this.data.data.actividadDeEmpresaC: ''],
      porcentajeEmpresaC: [this.data.data.porcentajeEmpresaC ? this.data.data.porcentajeEmpresaC: ''],
      esConsejero: [this.data.data.esConsejero ? this.data.data.esConsejero: ''],
      razonSocialC: [this.data.data.razonSocialC ? this.data.data.razonSocialC: ''],
      rfcC: [this.data.data.rfcC ? this.data.data.rfcC: ''],
      nacionalidadDEmpresaC: [this.data.data.nacionalidadDEmpresaC ? this.data.data.nacionalidadDEmpresaC: ''],
      telefonoDEmpresaC: [this.data.data.telefonoDEmpresaC ? this.data.data.telefonoDEmpresaC: ''],
      sectorDLEmpresaC: [this.data.data.sectorDLEmpresaC ? this.data.data.sectorDLEmpresaC: ''],
      actividadDEEmpresaC: [this.data.data.actividadDEEmpresaC ? this.data.data.actividadDEEmpresaC: ''],
      porcentajeEmpresaPertenece: [this.data.data.porcentajeEmpresaPertenece ? this.data.data.porcentajeEmpresaPertenece: ''],
      consejeroEmpresaC: [this.data.data.consejeroEmpresaC ? this.data.data.consejeroEmpresaC: ''],
    });
    }
  }

