import {Component, Inject, OnInit} from '@angular/core';
import {FormGroup} from "@angular/forms";
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
  _procedenciaForm: FormGroup;
  _proveedorRecursosForm: FormGroup;
  _propietarioForm: FormGroup;
  _usoCuentaForm: FormGroup;
  _generalesForm: FormGroup;
  _formulario: FormGroup;
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

  public nacionalidades5Combo: _combo[];
  public municipiosCombo: _combo[];
  public ciudadesCombo: _combo[];
  public estados2Combo: _combo[];
  public paises2Combo: _combo[];
  public nacionalidades6Combo: _combo[];
  public municipios2Combo: _combo[];
  public ciudades2Combo: _combo[];
  public estados3Combo: _combo[];
  public paises3Combo: _combo[];

  public paises4Combo: _combo[];
  public estados4Combo: _combo[];
  public nacionalidades7Combo: _combo[];
  public paises5Combo: _combo[];
  public municipios3Combo: _combo[];
  public ciudades3Combo: _combo[];
  public estados5Combo: _combo[];
  public paises6Combo: _combo[];

  public tipoClienteCombo: _combo[];

  public nacionalidades8Combo: _combo[];
  public paises7Combo: _combo[];
  public municipios4Combo: _combo[];
  public ciudades4Combo: _combo[];
  public estados6Combo: _combo[];



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
    this.parchar();
    console.log(this._formulario.value);
    this.dialogRef.close(this._formulario.value);
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
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidades5Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Municipios'}, 'comboController').subscribe(result =>
      this.municipiosCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Ciudades'}, 'comboController').subscribe(result =>
      this.ciudadesCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Estados'}, 'comboController').subscribe(result =>
      this.estados2Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paises2Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidades6Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Municipios'}, 'comboController').subscribe(result =>
      this.municipios2Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Ciudades'}, 'comboController').subscribe(result =>
      this.ciudades2Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Estados'}, 'comboController').subscribe(result =>
      this.estados3Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paises3Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paises4Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Estados'}, 'comboController').subscribe(result =>
      this.estados4Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidades7Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paises5Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Municipios'}, 'comboController').subscribe(result =>
      this.municipios3Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Ciudades'}, 'comboController').subscribe(result =>
      this.ciudades3Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Estados'}, 'comboController').subscribe(result =>
      this.estados5Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paises6Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'TipoCliente'}, 'comboController').subscribe(result =>
      this.tipoClienteCombo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Nacionalidades'}, 'comboController').subscribe(result =>
      this.nacionalidades8Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Paises'}, 'comboController').subscribe(result =>
      this.paises7Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Municipios'}, 'comboController').subscribe(result =>
      this.municipios4Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Ciudades'}, 'comboController').subscribe(result =>
      this.ciudades4Combo = result);
    this.advanceTableService.combo<_combo[]>({id: 'Estados'}, 'comboController').subscribe(result =>
      this.estados6Combo = result);



    this.dialogTitle = this.data.data.alias;

    this._titularForm = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id : null],
      idTitular: [this.data.data.idTitular ? this.data.data.idTitular:null],
      titularNombre: [this.data.data.titularNombre ? this.data.data.titularNombre: null],
      apellidoPaterno: [this.data.data.apellidoPaterno ? this.data.data.apellidoPaterno: null],
      apellidoMaterno: [this.data.data.apellidoMaterno ? this.data.data.apellidoMaterno: null],
      grupoFamilia: [this.data.data.grupoFamilia ? this.data.data.grupoFamilia.clave: null],
      promotor: [this.data.data.promotor ? this.data.data.promotor.id: null],
      tipoInversionista: [this.data.data.tipoInversionista ? this.data.data.tipoInversionista: null],
      excentoIsr: [this.data.data.excentoIsr ? this.data.data.excentoIsr: null],
      excentoIva: [this.data.data.excentoIva ? this.data.data.excentoIva: null],
      fechaNacimiento: [this.data.data.fechaNacimiento ? this.data.data.fechaNacimiento: null],
      entidadFederativaNacimiento: [this.data.data.entidadFederativaNacimiento ? this.data.data.entidadFederativaNacimiento: null],
      fechaInicioOperaciones: [this.data.data.fechaInicioOperaciones ? this.data.data.fechaInicioOperaciones: null],
      estadoCivil: [this.data.data.estadoCivil ? this.data.data.estadoCivil: null],
      profesion: [this.data.data.profesion ? this.data.data.profesion: null],
      nombreEmpresaPrestaServicios: [this.data.data.nombreEmpresaPrestaServicios ? this.data.data.nombreEmpresaPrestaServicios: null],
      nombrePuesto: [this.data.data.nombrePuesto ? this.data.data.nombrePuesto: null],
      funcionesGeneralesDirectivas: [this.data.data.funcionesGeneralesDirectivas ? this.data.data.funcionesGeneralesDirectivas: null],
      nivelJerarquico: [this.data.data.nivelJerarquico ? this.data.data.nivelJerarquico: null],
      antiguedadEmpleo: [this.data.data.antiguedadEmpleo ? this.data.data.antiguedadEmpleo: null],
      sectorEmpresa: [this.data.data.sectorEmpresa ? this.data.data.sectorEmpresa: null],
      giroEmpresa: [this.data.data.giroEmpresa ? this.data.data.giroEmpresa: null],
      tipoIngreso: [this.data.data.tipoIngreso ? this.data.data.tipoIngreso: null],
      ingresoAdicional: [this.data.data.ingresoAdicional ? this.data.data.ingresoAdicional: null],
      sectorPrestaServicio: [this.data.data.sectorPrestaServicio ? this.data.data.sectorPrestaServicio: null],
      giroEspecificoServicios: [this.data.data.giroEspecificoServicios ? this.data.data.giroEspecificoServicios: null],
      sectorEmpresa2: [this.data.data.sectorEmpresa2 ? this.data.data.sectorEmpresa2: null],
      razonSocialEmpresa: [this.data.data.razonSocialEmpresa ? this.data.data.razonSocialEmpresa: null],
      actividadEmpresa: [this.data.data.actividadEmpresa ? this.data.data.actividadEmpresa: null],
      ingresoAdicional2: [this.data.data.ingresoAdicional2 ? this.data.data.ingresoAdicional2: null],
      ocupacionActual: [this.data.data.ocupacionActual ? this.data.data.ocupacionActual: null],
      fuenteIngresos: [this.data.data.fuenteIngresos ? this.data.data.fuenteIngresos: null],
      sociedadesAsociacionesRFCEmpresa: [this.data.data.sociedadesAsociacionesRFCEmpresa ? this.data.data.sociedadesAsociacionesRFCEmpresa: null],
      nacionalidadEmpresa: [this.data.data.nacionalidadEmpresa ? this.data.data.nacionalidadEmpresa: null],
      telefonoEmpresa: [this.data.data.telefonoEmpresa ? this.data.data.telefonoEmpresa: null],
      sectorEmpresa3: [this.data.data.sectorEmpresa3 ? this.data.data.sectorEmpresa3: null],
      actividadGiroEspecificoEmpresa: [this.data.data.actividadGiroEspecificoEmpresa ? this.data.data.actividadGiroEspecificoEmpresa: null],
      porcentajeCapitalSocial: [this.data.data.porcentajeCapitalSocial ? this.data.data.porcentajeCapitalSocial: null],
      consejeroEmpresaRFCEmpresa: [this.data.data.consejeroEmpresaRFCEmpresa ? this.data.data.consejeroEmpresaRFCEmpresa: null],
      nacionalidadEmpresa2: [this.data.data.nacionalidadEmpresa2 ? this.data.data.nacionalidadEmpresa2: null],
      telefonoEmpresa2: [this.data.data.telefonoEmpresa2 ? this.data.data.telefonoEmpresa2: null],
      sectorEmpresa4: [this.data.data.sectorEmpresa4 ? this.data.data.sectorEmpresa4: null],
      actividadGiroEmpresa3: [this.data.data.actividadGiroEmpresa3 ? this.data.data.actividadGiroEmpresa3: null],
      vinculoPatrimonial: [this.data.data.vinculoPatrimonial ? this.data.data.vinculoPatrimonial: null],
      consejeroEmpresa: [this.data.data.consejeroEmpresa ? this.data.data.consejeroEmpresa: null],
      cargoDesempeno: [this.data.data.cargoDesempeno ? this.data.data.cargoDesempeno: null],
      nombreInstitucion: [this.data.data.nombreInstitucion ? this.data.data.nombreInstitucion: null],
      institucionCargoExtranjero: [this.data.data.institucionCargoExtranjero ? this.data.data.institucionCargoExtranjero: null],
      pais: [this.data.data.pais ? this.data.data.pais: null],
      cargo: [this.data.data.cargo ? this.data.data.cargo: null],
      relacionPersonaNacionalExtranjera: [this.data.data.relacionPersonaNacionalExtranjera ? this.data.data.relacionPersonaNacionalExtranjera: null],
      cargo2: [this.data.data.cargo2 ? this.data.data.cargo2: null],
      institucionDesempenaCargo: [this.data.data.institucionDesempenaCargo ? this.data.data.institucionDesempenaCargo: null],
    });

    this._cotitularForm = this.advanceTableService.buildForm({
      idCotitular: [this.data.data.idCotitular ? this.data.data.idCotitular:null],
      nombreCotitular: [this.data.data.nombreCotitular ? this.data.data.nombreCotitular: null],
      apellidoPaternoC: [this.data.data.apellidoPaternoC ? this.data.data.apellidoPaternoC: null],
      apellidoMaternoC: [this.data.data.apellidoMaternoC ? this.data.data.apellidoMaternoC: null],
      estadoCivilC: [this.data.data.estadoCivilC ? this.data.data.estadoCivilC: null],
      lugarPrestaServicios: [this.data.data.lugarPrestaServicios ? this.data.data.lugarPrestaServicios: null],
      nombrePuestoC: [this.data.data.nombrePuestoC ? this.data.data.nombrePuestoC: null],
      funcionesGeneralesDirectivasC: [this.data.data.funcionesGeneralesDirectivasC ? this.data.data.funcionesGeneralesDirectivasC: null],
      nivelJerarquicoC: [this.data.data.nivelJerarquicoC ? this.data.data.nivelJerarquicoC: null],
      antiguedadEmpleoC: [this.data.data.antiguedadEmpleoC ? this.data.data.antiguedadEmpleoC: null],
      sectorEmpresaC: [this.data.data.sectorEmpresaC ? this.data.data.sectorEmpresaC: null],
      tipoIngresoC: [this.data.data.tipoIngresoC ? this.data.data.tipoIngresoC: null],
      ingresoAdicionalC: [this.data.data.ingresoAdicionalC ? this.data.data.ingresoAdicionalC: null],
      formasProporcionaServicios: [this.data.data.formasProporcionaServicios ? this.data.data.formasProporcionaServicios: null],
      sectorPrestaServicios: [this.data.data.sectorPrestaServicios ? this.data.data.sectorPrestaServicios: null],
      actividadGiroEEmpresaC: [this.data.data.actividadGiroEEmpresaC ? this.data.data.actividadGiroEEmpresaC: null],
      rfcEmpresa: [this.data.data.rfcEmpresa ? this.data.data.rfcEmpresa: null],
      sectorDEmpresaC: [this.data.data.sectorDEmpresaC ? this.data.data.sectorDEmpresaC: null],
      actividadGiroEmpresaC: [this.data.data.actividadGiroEmpresaC ? this.data.data.actividadGiroEmpresaC: null],
      cingresoAdicionalC: [this.data.data.cingresoAdicionalC ? this.data.data.cingresoAdicionalC: null],
      ocupacionActualC: [this.data.data.ocupacionActualC ? this.data.data.ocupacionActualC: null],
      fuenteIngresoC: [this.data.data.fuenteIngresoC ? this.data.data.fuenteIngresoC: null],
      razonSocialEmpresaC: [this.data.data.razonSocialEmpresaC ? this.data.data.razonSocialEmpresaC: null],
      rfc: [this.data.data.rfc ? this.data.data.rfc: null],
      nacionalidadEmpresaC: [this.data.data.nacionalidadEmpresaC ? this.data.data.nacionalidadEmpresaC: null],
      telefonoEmpresaC: [this.data.data.telefonoEmpresaC ? this.data.data.telefonoEmpresaC: null],
      sectorDeEmpresaC: [this.data.data.sectorDeEmpresaC ? this.data.data.sectorDeEmpresaC: null],
      actividadEmpresaC1: [this.data.data.actividadEmpresaC1 ? this.data.data.actividadEmpresaC1: null],
      porcentajeEmpresaC: [this.data.data.porcentajeEmpresaC ? this.data.data.porcentajeEmpresaC: null],
      esConsejero: [this.data.data.esConsejero ? this.data.data.esConsejero: null],
      razonSocialC: [this.data.data.razonSocialC ? this.data.data.razonSocialC: null],
      rfcC: [this.data.data.rfcC ? this.data.data.rfcC: null],
      nacionalidadDEmpresaC: [this.data.data.nacionalidadDEmpresaC ? this.data.data.nacionalidadDEmpresaC: null],
      telefonoDEmpresaC: [this.data.data.telefonoDEmpresaC ? this.data.data.telefonoDEmpresaC: null],
      sectorDLEmpresaC: [this.data.data.sectorDLEmpresaC ? this.data.data.sectorDLEmpresaC: null],
      actividadEmpresaC2: [this.data.data.actividadEmpresaC2 ? this.data.data.actividadEmpresaC2: null],
      porcentajeEmpresaPertenece: [this.data.data.porcentajeEmpresaPertenece ? this.data.data.porcentajeEmpresaPertenece: null],
      consejeroEmpresaC: [this.data.data.consejeroEmpresaC ? this.data.data.consejeroEmpresaC: null],
      institucionesCargosPublicosRelacion: [this.data.data.institucionesCargosPublicosRelacion ? this.data.data.institucionesCargosPublicosRelacion: null],
      institucionDesempenaCargoC: [this.data.data.institucionDesempenaCargoC ? this.data.data.institucionDesempenaCargoC: null],
      relacionPersonaNacionalExtranjeraC: [this.data.data.relacionPersonaNacionalExtranjeraC ? this.data.data.relacionPersonaNacionalExtranjeraC: null],
    });

    this._procedenciaForm = this.advanceTableService.buildForm({
      idProcedencia: [this.data.data.idProcedencia ? this.data.data.idProcedencia:null],
      procedenciaRecurso: [this.data.data.procedenciaRecurso ? this.data.data.procedenciaRecurso: null],
      detalleRecurso: [this.data.data.detalleRecurso ? this.data.data.detalleRecurso: null],
    });

    this._proveedorRecursosForm = this.advanceTableService.buildForm({
      idProveedor: [this.data.data.idProveedor ? this.data.data.idProveedor:null],
      proveedorrecursoNombre: [this.data.data.proveedorrecursoNombre ? this.data.data.proveedorrecursoNombre: null],
      apellidoPaternoP: [this.data.data.apellidoPaternoP ? this.data.data.apellidoPaternoP: null],
      apellidoMaternoP: [this.data.data.apellidoMaternoP ? this.data.data.apellidoMaternoP: null],
      nacionalidadP: [this.data.data.nacionalidadP ? this.data.data.nacionalidadP: null],
      fechaNacimientoP: [this.data.data.fechaNacimientoP ? this.data.data.fechaNacimientoP: null],
      curp: [this.data.data.curp ? this.data.data.curp: null],
      rfcP: [this.data.data.rfcP ? this.data.data.rfcP: null],
      firmaElectronica: [this.data.data.firmaElectronica ? this.data.data.firmaElectronica: null],
      tipoVialidad: [this.data.data.tipoVialidad ? this.data.data.tipoVialidad: null],
      nombreVialidad: [this.data.data.nombreVialidad ? this.data.data.nombreVialidad: null],
      noExterior: [this.data.data.noExterior ? this.data.data.noExterior: null],
      noInterior: [this.data.data.noInterior ? this.data.data.noInterior: null],
      colonia: [this.data.data.colonia ? this.data.data.colonia: null],
      municipio: [this.data.data.municipio ? this.data.data.municipio: null],
      ciudad: [this.data.data.ciudad ? this.data.data.ciudad: null],
      estado: [this.data.data.estado ? this.data.data.estado: null],
      cp: [this.data.data.cp ? this.data.data.cp: null],
      paisP: [this.data.data.paisP ? this.data.data.paisP: null],
      personaMoralRazonSocial: [this.data.data.personaMoralRazonSocial ? this.data.data.personaMoralRazonSocial: null],
      nacionalidad: [this.data.data.nacionalidad ? this.data.data.nacionalidad: null],
      rfcPR: [this.data.data.rfcPR ? this.data.data.rfcPR: null],
      firmaElectronicaP: [this.data.data.firmaElectronicaP ? this.data.data.firmaElectronicaP: null],
      domicilio: [this.data.data.domicilio ? this.data.data.domicilio: null],
      tipoVialidadP: [this.data.data.tipoVialidadP ? this.data.data.tipoVialidadP: null],
      nombreVialidadP: [this.data.data.nombreVialidadP ? this.data.data.nombreVialidadP: null],
      noExteriorP: [this.data.data.noExteriorP ? this.data.data.noExteriorP: null],
      noInteriorP: [this.data.data.noInteriorP ? this.data.data.noInteriorP: null],
      coloniaP: [this.data.data.coloniaP ? this.data.data.coloniaP: null],
      delegacion: [this.data.data.delegacion ? this.data.data.delegacion: null],
      ciudadP: [this.data.data.ciudadP ? this.data.data.ciudadP: null],
      estadoP: [this.data.data.estadoP ? this.data.data.estadoP: null],
      codigoPostal: [this.data.data.codigoPostal ? this.data.data.codigoPostal: null],
      paisPR: [this.data.data.paisPR ? this.data.data.paisPR: null],
    })

    this._propietarioForm = this.advanceTableService.buildForm({
      idPropietario: [this.data.data.idPropietario ? this.data.data.idPropietario:null],
      propietarioRealNombre: [this.data.data.propietarioRealNombre ? this.data.data.propietarioRealNombre: null],
      apellidoPaternoPRE: [this.data.data.apellidoPaternoPRE ? this.data.data.apellidoPaternoPRE: null],
      apellidoMaternoPRE: [this.data.data.apellidoMaternoPRE ? this.data.data.apellidoMaternoPRE: null],
      genero: [this.data.data.genero ? this.data.data.genero: null],
      fechaNacimientoPRE: [this.data.data.fechaNacimientoPRE ? this.data.data.fechaNacimientoPRE: null],
      curpPRE: [this.data.data.curpPRE ? this.data.data.curpPRE: null],
      paisNacimiento: [this.data.data.paisNacimiento ? this.data.data.paisNacimiento: null],
      estadoNacimiento: [this.data.data.estadoNacimiento ? this.data.data.estadoNacimiento: null],
      nacionalidadPRE: [this.data.data.nacionalidadPRE ? this.data.data.nacionalidadPRE: null],
      calidadMigratoria: [this.data.data.calidadMigratoria ? this.data.data.calidadMigratoria: null],
      paisResidencia: [this.data.data.paisResidencia ? this.data.data.paisResidencia: null],
      regimenFiscal: [this.data.data.regimenFiscal ? this.data.data.regimenFiscal: null],
      rfcPRE: [this.data.data.rfcPRE ? this.data.data.rfcPRE: null],
      firmaElectronicaAvanzada: [this.data.data.firmaElectronicaAvanzada ? this.data.data.firmaElectronicaAvanzada: null],
      telefonoParticular: [this.data.data.telefonoParticular ? this.data.data.telefonoParticular: null],
      telefonoCelular: [this.data.data.telefonoCelular ? this.data.data.telefonoCelular: null],
      correoElectronico: [this.data.data.correoElectronico ? this.data.data.correoElectronico: null],
      domicilioPropietario: [this.data.data.domicilioPropietario ? this.data.data.domicilioPropietario: null],
      tipoVialidadPRE: [this.data.data.tipoVialidadPRE ? this.data.data.tipoVialidadPRE: null],
      nombreVialidadPRE: [this.data.data.nombreVialidadPRE ? this.data.data.nombreVialidadPRE: null],
      noExteriorPRE: [this.data.data.noExteriorPRE ? this.data.data.noExteriorPRE: null],
      noInteriorPRE: [this.data.data.noInteriorPRE ? this.data.data.noInteriorPRE: null],
      coloniaPRE: [this.data.data.coloniaPRE ? this.data.data.coloniaPRE: null],
      delegacionPRE: [this.data.data.delegacionPRE ? this.data.data.delegacionPRE: null],
      ciudadPRE: [this.data.data.ciudadPRE ? this.data.data.ciudadPRE: null],
      estadoPRE: [this.data.data.estadoPRE ? this.data.data.estadoPRE: null],
      paisPRE: [this.data.data.paisPRE ? this.data.data.paisPRE: null],
      codigo: [this.data.data.codigo ? this.data.data.codigo: null],
    })

    this._usoCuentaForm = this.advanceTableService.buildForm({
      idUso: [this.data.data.idUso ? this.data.data.idUso:null],
      tipoCliente: [this.data.data.tipoCliente ? this.data.data.tipoCliente: null],
      uso: [this.data.data.uso ? this.data.data.uso: null],
      montoDepositoInicial: [this.data.data.montoDepositoInicial ? this.data.data.montoDepositoInicial: null],
      numeroAproxDepoMensualesMin: [this.data.data.numeroAproxDepoMensualesMin ? this.data.data.numeroAproxDepoMensualesMin: null],
      numeroAproxDepoMensualesMax: [this.data.data.numeroAproxDepoMensualesMax ? this.data.data.numeroAproxDepoMensualesMax: null],
      porccentajePromedioMensualDepositosMin: [this.data.data.porccentajePromedioMensualDepositosMin ? this.data.data.porccentajePromedioMensualDepositosMin: null],
      porccentajePromedioMensualDepositosMax: [this.data.data.porccentajePromedioMensualDepositosMax ? this.data.data.porccentajePromedioMensualDepositosMax: null],
      numeroAproxRetirosMensualesMin: [this.data.data.numeroAproxRetirosMensualesMin ? this.data.data.numeroAproxRetirosMensualesMin: null],
      numeroAproxRetirosMensualesMax: [this.data.data.numeroAproxRetirosMensualesMax ? this.data.data.numeroAproxRetirosMensualesMax: null],
      montoAproxMensualRetirosMin: [this.data.data.montoAproxMensualRetirosMin ? this.data.data.montoAproxMensualRetirosMin: null],
      montoAproxMensualRetirosMax: [this.data.data.montoAproxMensualRetirosMax ? this.data.data.montoAproxMensualRetirosMax: null],
      fechaBaja: [this.data.data.fechaBaja ? this.data.data.fechaBaja: null],
      liqVSsaldo: [this.data.data.liqVSsaldo ? this.data.data.liqVSsaldo: null],
      manejaCust: [this.data.data.manejaCust ? this.data.data.manejaCust: null],
      cortoEfectivo: [this.data.data.cortoEfectivo ? this.data.data.cortoEfectivo: null],
    })

    this._generalesForm = this.advanceTableService.buildForm({
      idGenerales: [this.data.data.idGenerales ? this.data.data.idGenerales:null],
      nacionalidadG: [this.data.data.nacionalidadG ? this.data.data.nacionalidadG: null],
      paisG: [this.data.data.paisG ? this.data.data.paisG: null],
      calleG: [this.data.data.calleG ? this.data.data.calleG: null],
      noExteriorG: [this.data.data.noExteriorG ? this.data.data.noExteriorG: null],
      noInteriorG: [this.data.data.noInteriorG ? this.data.data.noInteriorG: null],
      coloniaG: [this.data.data.coloniaG ? this.data.data.coloniaG: null],
      alcaldia: [this.data.data.alcaldia ? this.data.data.alcaldia: null],
      ciudadG: [this.data.data.ciudadG ? this.data.data.ciudadG: null],
      estadosG: [this.data.data.estadosG ? this.data.data.estadosG: null],
      cpG: [this.data.data.cpG ? this.data.data.cpG: null],
      telefonoParticularG: [this.data.data.telefonoParticularG ? this.data.data.telefonoParticularG: null],
      telefonoCelularG: [this.data.data.telefonoCelularG ? this.data.data.telefonoCelularG: null],
      email: [this.data.data.email ? this.data.data.email: null],
      rfcG: [this.data.data.rfcG ? this.data.data.rfcG: null],
      curpG: [this.data.data.curpG ? this.data.data.curpG: null],
      fiel: [this.data.data.fiel ? this.data.data.fiel: null],
    })


    this._formulario = this.advanceTableService.buildForm({
      id: [this.data.data.id ? this.data.data.id : null],
      idTitular: [this.data.data.idTitular ? this.data.data.idTitular:null],
      titularNombre: [this.data.data.titularNombre ? this.data.data.titularNombre: null],
      apellidoPaterno: [this.data.data.apellidoPaterno ? this.data.data.apellidoPaterno: null],
      apellidoMaterno: [this.data.data.apellidoMaterno ? this.data.data.apellidoMaterno: null],
      grupoFamilia: [this.data.data.grupoFamilia ? this.data.data.grupoFamilia: null],
      promotor: [this.data.data.promotor ? this.data.data.promotor: null],
      tipoInversionista: [this.data.data.tipoInversionista ? this.data.data.tipoInversionista: null],
      excentoIsr: [this.data.data.excentoIsr ? this.data.data.excentoIsr: null],
      excentoIva: [this.data.data.excentoIva ? this.data.data.excentoIva: null],
      fechaNacimiento: [this.data.data.fechaNacimiento ? this.data.data.fechaNacimiento: null],
      entidadFederativaNacimiento: [this.data.data.entidadFederativaNacimiento ? this.data.data.entidadFederativaNacimiento: null],
      fechaInicioOperaciones: [this.data.data.fechaInicioOperaciones ? this.data.data.fechaInicioOperaciones: null],
      estadoCivil: [this.data.data.estadoCivil ? this.data.data.estadoCivil: null],
      profesion: [this.data.data.profesion ? this.data.data.profesion: null],
      nombreEmpresaPrestaServicios: [this.data.data.nombreEmpresaPrestaServicios ? this.data.data.nombreEmpresaPrestaServicios: null],
      nombrePuesto: [this.data.data.nombrePuesto ? this.data.data.nombrePuesto: null],
      funcionesGeneralesDirectivas: [this.data.data.funcionesGeneralesDirectivas ? this.data.data.funcionesGeneralesDirectivas: null],
      nivelJerarquico: [this.data.data.nivelJerarquico ? this.data.data.nivelJerarquico: null],
      antiguedadEmpleo: [this.data.data.antiguedadEmpleo ? this.data.data.antiguedadEmpleo: null],
      sectorEmpresa: [this.data.data.sectorEmpresa ? this.data.data.sectorEmpresa: null],
      giroEmpresa: [this.data.data.giroEmpresa ? this.data.data.giroEmpresa: null],
      tipoIngreso: [this.data.data.tipoIngreso ? this.data.data.tipoIngreso: null],
      ingresoAdicional: [this.data.data.ingresoAdicional ? this.data.data.ingresoAdicional: null],
      sectorPrestaServicio: [this.data.data.sectorPrestaServicio ? this.data.data.sectorPrestaServicio: null],
      giroEspecificoServicios: [this.data.data.giroEspecificoServicios ? this.data.data.giroEspecificoServicios: null],
      sectorEmpresa2: [this.data.data.sectorEmpresa2 ? this.data.data.sectorEmpresa2: null],
      razonSocialEmpresa: [this.data.data.razonSocialEmpresa ? this.data.data.razonSocialEmpresa: null],
      actividadEmpresa: [this.data.data.actividadEmpresa ? this.data.data.actividadEmpresa: null],
      ingresoAdicional2: [this.data.data.ingresoAdicional2 ? this.data.data.ingresoAdicional2: null],
      ocupacionActual: [this.data.data.ocupacionActual ? this.data.data.ocupacionActual: null],
      fuenteIngresos: [this.data.data.fuenteIngresos ? this.data.data.fuenteIngresos: null],
      sociedadesAsociacionesRFCEmpresa: [this.data.data.sociedadesAsociacionesRFCEmpresa ? this.data.data.sociedadesAsociacionesRFCEmpresa: null],
      nacionalidadEmpresa: [this.data.data.nacionalidadEmpresa ? this.data.data.nacionalidadEmpresa: null],
      telefonoEmpresa: [this.data.data.telefonoEmpresa ? this.data.data.telefonoEmpresa: null],
      sectorEmpresa3: [this.data.data.sectorEmpresa3 ? this.data.data.sectorEmpresa3: null],
      actividadGiroEspecificoEmpresa: [this.data.data.actividadGiroEspecificoEmpresa ? this.data.data.actividadGiroEspecificoEmpresa: null],
      porcentajeCapitalSocial: [this.data.data.porcentajeCapitalSocial ? this.data.data.porcentajeCapitalSocial: null],
      consejeroEmpresaRFCEmpresa: [this.data.data.consejeroEmpresaRFCEmpresa ? this.data.data.consejeroEmpresaRFCEmpresa: null],
      nacionalidadEmpresa2: [this.data.data.nacionalidadEmpresa2 ? this.data.data.nacionalidadEmpresa2: null],
      telefonoEmpresa2: [this.data.data.telefonoEmpresa2 ? this.data.data.telefonoEmpresa2: null],
      sectorEmpresa4: [this.data.data.sectorEmpresa4 ? this.data.data.sectorEmpresa4: null],
      actividadGiroEmpresa3: [this.data.data.actividadGiroEmpresa3 ? this.data.data.actividadGiroEmpresa3: null],
      vinculoPatrimonial: [this.data.data.vinculoPatrimonial ? this.data.data.vinculoPatrimonial: null],
      consejeroEmpresa: [this.data.data.consejeroEmpresa ? this.data.data.consejeroEmpresa: null],
      cargoDesempeno: [this.data.data.cargoDesempeno ? this.data.data.cargoDesempeno: null],
      nombreInstitucion: [this.data.data.nombreInstitucion ? this.data.data.nombreInstitucion: null],
      institucionCargoExtranjero: [this.data.data.institucionCargoExtranjero ? this.data.data.institucionCargoExtranjero: null],
      pais: [this.data.data.pais ? this.data.data.pais: null],
      cargo: [this.data.data.cargo ? this.data.data.cargo: null],
      relacionPersonaNacionalExtranjera: [this.data.data.relacionPersonaNacionalExtranjera ? this.data.data.relacionPersonaNacionalExtranjera: null],
      cargo2: [this.data.data.cargo2 ? this.data.data.cargo2: null],
      institucionDesempenaCargo: [this.data.data.institucionDesempenaCargo ? this.data.data.institucionDesempenaCargo: null],

      idCotitular: [this.data.data.idCotitular ? this.data.data.idCotitular:null],
      nombreCotitular: [this.data.data.nombreCotitular ? this.data.data.nombreCotitular: null],
      apellidoPaternoC: [this.data.data.apellidoPaternoC ? this.data.data.apellidoPaternoC: null],
      apellidoMaternoC: [this.data.data.apellidoMaternoC ? this.data.data.apellidoMaternoC: null],
      estadoCivilC: [this.data.data.estadoCivilC ? this.data.data.estadoCivilC: null],
      lugarPrestaServicios: [this.data.data.lugarPrestaServicios ? this.data.data.lugarPrestaServicios: null],
      nombrePuestoC: [this.data.data.nombrePuestoC ? this.data.data.nombrePuestoC: null],
      funcionesGeneralesDirectivasC: [this.data.data.funcionesGeneralesDirectivasC ? this.data.data.funcionesGeneralesDirectivasC: null],
      nivelJerarquicoC: [this.data.data.nivelJerarquicoC ? this.data.data.nivelJerarquicoC: null],
      antiguedadEmpleoC: [this.data.data.antiguedadEmpleoC ? this.data.data.antiguedadEmpleoC: null],
      sectorEmpresaC: [this.data.data.sectorEmpresaC ? this.data.data.sectorEmpresaC: null],
      tipoIngresoC: [this.data.data.tipoIngresoC ? this.data.data.tipoIngresoC: null],
      ingresoAdicionalC: [this.data.data.ingresoAdicionalC ? this.data.data.ingresoAdicionalC: null],
      formasProporcionaServicios: [this.data.data.formasProporcionaServicios ? this.data.data.formasProporcionaServicios: null],
      sectorPrestaServicios: [this.data.data.sectorPrestaServicios ? this.data.data.sectorPrestaServicios: null],
      actividadGiroEEmpresaC: [this.data.data.actividadGiroEEmpresaC ? this.data.data.actividadGiroEEmpresaC: null],
      rfcEmpresa: [this.data.data.rfcEmpresa ? this.data.data.rfcEmpresa: null],
      sectorDEmpresaC: [this.data.data.sectorDEmpresaC ? this.data.data.sectorDEmpresaC: null],
      actividadGiroEmpresaC: [this.data.data.actividadGiroEmpresaC ? this.data.data.actividadGiroEmpresaC: null],
      cingresoAdicionalC: [this.data.data.cingresoAdicionalC ? this.data.data.cingresoAdicionalC: null],
      ocupacionActualC: [this.data.data.ocupacionActualC ? this.data.data.ocupacionActualC: null],
      fuenteIngresoC: [this.data.data.fuenteIngresoC ? this.data.data.fuenteIngresoC: null],
      razonSocialEmpresaC: [this.data.data.razonSocialEmpresaC ? this.data.data.razonSocialEmpresaC: null],
      rfc: [this.data.data.rfc ? this.data.data.rfc: null],
      nacionalidadEmpresaC: [this.data.data.nacionalidadEmpresaC ? this.data.data.nacionalidadEmpresaC: null],
      telefonoEmpresaC: [this.data.data.telefonoEmpresaC ? this.data.data.telefonoEmpresaC: null],
      sectorDeEmpresaC: [this.data.data.sectorDeEmpresaC ? this.data.data.sectorDeEmpresaC: null],
      actividadEmpresaC1: [this.data.data.actividadEmpresaC1 ? this.data.data.actividadEmpresaC1: null],
      porcentajeEmpresaC: [this.data.data.porcentajeEmpresaC ? this.data.data.porcentajeEmpresaC: null],
      esConsejero: [this.data.data.esConsejero ? this.data.data.esConsejero: null],
      razonSocialC: [this.data.data.razonSocialC ? this.data.data.razonSocialC: null],
      rfcC: [this.data.data.rfcC ? this.data.data.rfcC: null],
      nacionalidadDEmpresaC: [this.data.data.nacionalidadDEmpresaC ? this.data.data.nacionalidadDEmpresaC: null],
      telefonoDEmpresaC: [this.data.data.telefonoDEmpresaC ? this.data.data.telefonoDEmpresaC: null],
      sectorDLEmpresaC: [this.data.data.sectorDLEmpresaC ? this.data.data.sectorDLEmpresaC: null],
      actividadEmpresaC2: [this.data.data.actividadEmpresaC2 ? this.data.data.actividadEmpresaC2: null],
      porcentajeEmpresaPertenece: [this.data.data.porcentajeEmpresaPertenece ? this.data.data.porcentajeEmpresaPertenece: null],
      consejeroEmpresaC: [this.data.data.consejeroEmpresaC ? this.data.data.consejeroEmpresaC: null],
      institucionesCargosPublicosRelacion: [this.data.data.institucionesCargosPublicosRelacion ? this.data.data.institucionesCargosPublicosRelacion: null],
      institucionDesempenaCargoC: [this.data.data.institucionDesempenaCargoC ? this.data.data.institucionDesempenaCargoC: null],
      relacionPersonaNacionalExtranjeraC: [this.data.data.relacionPersonaNacionalExtranjeraC ? this.data.data.relacionPersonaNacionalExtranjeraC: null],

      idProcedencia: [this.data.data.idProcedencia ? this.data.data.idProcedencia:null],
      procedenciaRecurso: [this.data.data.procedenciaRecurso ? this.data.data.procedenciaRecurso: null],
      detalleRecurso: [this.data.data.detalleRecurso ? this.data.data.detalleRecurso: null],

      idProveedor: [this.data.data.idProveedor ? this.data.data.idProveedor:null],
      proveedorrecursoNombre: [this.data.data.proveedorrecursoNombre ? this.data.data.proveedorrecursoNombre: null],
      apellidoPaternoP: [this.data.data.apellidoPaternoP ? this.data.data.apellidoPaternoP: null],
      apellidoMaternoP: [this.data.data.apellidoMaternoP ? this.data.data.apellidoMaternoP: null],
      nacionalidadP: [this.data.data.nacionalidadP ? this.data.data.nacionalidadP: null],
      fechaNacimientoP: [this.data.data.fechaNacimientoP ? this.data.data.fechaNacimientoP: null],
      curp: [this.data.data.curp ? this.data.data.curp: null],
      rfcP: [this.data.data.rfcP ? this.data.data.rfcP: null],
      firmaElectronica: [this.data.data.firmaElectronica ? this.data.data.firmaElectronica: null],
      tipoVialidad: [this.data.data.tipoVialidad ? this.data.data.tipoVialidad: null],
      nombreVialidad: [this.data.data.nombreVialidad ? this.data.data.nombreVialidad: null],
      noExterior: [this.data.data.noExterior ? this.data.data.noExterior: null],
      noInterior: [this.data.data.noInterior ? this.data.data.noInterior: null],
      colonia: [this.data.data.colonia ? this.data.data.colonia: null],
      municipio: [this.data.data.municipio ? this.data.data.municipio: null],
      ciudad: [this.data.data.ciudad ? this.data.data.ciudad: null],
      estado: [this.data.data.estado ? this.data.data.estado: null],
      cp: [this.data.data.cp ? this.data.data.cp: null],
      paisP: [this.data.data.paisP ? this.data.data.paisP: null],
      personaMoralRazonSocial: [this.data.data.personaMoralRazonSocial ? this.data.data.personaMoralRazonSocial: null],
      nacionalidad: [this.data.data.nacionalidad ? this.data.data.nacionalidad: null],
      rfcPR: [this.data.data.rfcPR ? this.data.data.rfcPR: null],
      firmaElectronicaP: [this.data.data.firmaElectronicaP ? this.data.data.firmaElectronicaP: null],
      domicilio: [this.data.data.domicilio ? this.data.data.domicilio: null],
      tipoVialidadP: [this.data.data.tipoVialidadP ? this.data.data.tipoVialidadP: null],
      nombreVialidadP: [this.data.data.nombreVialidadP ? this.data.data.nombreVialidadP: null],
      noExteriorP: [this.data.data.noExteriorP ? this.data.data.noExteriorP: null],
      noInteriorP: [this.data.data.noInteriorP ? this.data.data.noInteriorP: null],
      coloniaP: [this.data.data.coloniaP ? this.data.data.coloniaP: null],
      delegacion: [this.data.data.delegacion ? this.data.data.delegacion: null],
      ciudadP: [this.data.data.ciudadP ? this.data.data.ciudadP: null],
      estadoP: [this.data.data.estadoP ? this.data.data.estadoP: null],
      codigoPostal: [this.data.data.codigoPostal ? this.data.data.codigoPostal: null],
      paisPR: [this.data.data.paisPR ? this.data.data.paisPR: null],

      idPropietario: [this.data.data.idPropietario ? this.data.data.idPropietario:null],
      propietarioRealNombre: [this.data.data.propietarioRealNombre ? this.data.data.propietarioRealNombre: null],
      apellidoPaternoPRE: [this.data.data.apellidoPaternoPRE ? this.data.data.apellidoPaternoPRE: null],
      apellidoMaternoPRE: [this.data.data.apellidoMaternoPRE ? this.data.data.apellidoMaternoPRE: null],
      genero: [this.data.data.genero ? this.data.data.genero: null],
      fechaNacimientoPRE: [this.data.data.fechaNacimientoPRE ? this.data.data.fechaNacimientoPRE: null],
      curpPRE: [this.data.data.curpPRE ? this.data.data.curpPRE: null],
      paisNacimiento: [this.data.data.paisNacimiento ? this.data.data.paisNacimiento: null],
      estadoNacimiento: [this.data.data.estadoNacimiento ? this.data.data.estadoNacimiento: null],
      nacionalidadPRE: [this.data.data.nacionalidadPRE ? this.data.data.nacionalidadPRE: null],
      calidadMigratoria: [this.data.data.calidadMigratoria ? this.data.data.calidadMigratoria: null],
      paisResidencia: [this.data.data.paisResidencia ? this.data.data.paisResidencia: null],
      regimenFiscal: [this.data.data.regimenFiscal ? this.data.data.regimenFiscal: null],
      rfcPRE: [this.data.data.rfcPRE ? this.data.data.rfcPRE: null],
      firmaElectronicaAvanzada: [this.data.data.firmaElectronicaAvanzada ? this.data.data.firmaElectronicaAvanzada: null],
      telefonoParticular: [this.data.data.telefonoParticular ? this.data.data.telefonoParticular: null],
      telefonoCelular: [this.data.data.telefonoCelular ? this.data.data.telefonoCelular: null],
      correoElectronico: [this.data.data.correoElectronico ? this.data.data.correoElectronico: null],
      domicilioPropietario: [this.data.data.domicilioPropietario ? this.data.data.domicilioPropietario: null],
      tipoVialidadPRE: [this.data.data.tipoVialidadPRE ? this.data.data.tipoVialidadPRE: null],
      nombreVialidadPRE: [this.data.data.nombreVialidadPRE ? this.data.data.nombreVialidadPRE: null],
      noExteriorPRE: [this.data.data.noExteriorPRE ? this.data.data.noExteriorPRE: null],
      noInteriorPRE: [this.data.data.noInteriorPRE ? this.data.data.noInteriorPRE: null],
      coloniaPRE: [this.data.data.coloniaPRE ? this.data.data.coloniaPRE: null],
      delegacionPRE: [this.data.data.delegacionPRE ? this.data.data.delegacionPRE: null],
      ciudadPRE: [this.data.data.ciudadPRE ? this.data.data.ciudadPRE: null],
      estadoPRE: [this.data.data.estadoPRE ? this.data.data.estadoPRE: null],
      paisPRE: [this.data.data.paisPRE ? this.data.data.paisPRE: null],
      codigo: [this.data.data.codigo ? this.data.data.codigo: null],

      idUso: [this.data.data.idUso ? this.data.data.idUso:null],
      tipoCliente: [this.data.data.tipoCliente ? this.data.data.tipoCliente: null],
      uso: [this.data.data.uso ? this.data.data.uso: null],
      montoDepositoInicial: [this.data.data.montoDepositoInicial ? this.data.data.montoDepositoInicial: null],
      numeroAproxDepoMensualesMin: [this.data.data.numeroAproxDepoMensualesMin ? this.data.data.numeroAproxDepoMensualesMin: null],
      numeroAproxDepoMensualesMax: [this.data.data.numeroAproxDepoMensualesMax ? this.data.data.numeroAproxDepoMensualesMax: null],
      porccentajePromedioMensualDepositosMin: [this.data.data.porccentajePromedioMensualDepositosMin ? this.data.data.porccentajePromedioMensualDepositosMin: null],
      porccentajePromedioMensualDepositosMax: [this.data.data.porccentajePromedioMensualDepositosMax ? this.data.data.porccentajePromedioMensualDepositosMax: null],
      numeroAproxRetirosMensualesMin: [this.data.data.numeroAproxRetirosMensualesMin ? this.data.data.numeroAproxRetirosMensualesMin: null],
      numeroAproxRetirosMensualesMax: [this.data.data.numeroAproxRetirosMensualesMax ? this.data.data.numeroAproxRetirosMensualesMax: null],
      montoAproxMensualRetirosMin: [this.data.data.montoAproxMensualRetirosMin ? this.data.data.montoAproxMensualRetirosMin: null],
      montoAproxMensualRetirosMax: [this.data.data.montoAproxMensualRetirosMax ? this.data.data.montoAproxMensualRetirosMax: null],
      fechaBaja: [this.data.data.fechaBaja ? this.data.data.fechaBaja: null],
      liqVSsaldo: [this.data.data.liqVSsaldo ? this.data.data.liqVSsaldo: null],
      manejaCust: [this.data.data.manejaCust ? this.data.data.manejaCust: null],
      cortoEfectivo: [this.data.data.cortoEfectivo ? this.data.data.cortoEfectivo: null],

      idGenerales: [this.data.data.idGenerales ? this.data.data.idGenerales:null],
      nacionalidadG: [this.data.data.nacionalidadG ? this.data.data.nacionalidadG: null],
      paisG: [this.data.data.paisG ? this.data.data.paisG: null],
      calleG: [this.data.data.calleG ? this.data.data.calleG: null],
      noExteriorG: [this.data.data.noExteriorG ? this.data.data.noExteriorG: null],
      noInteriorG: [this.data.data.noInteriorG ? this.data.data.noInteriorG: null],
      coloniaG: [this.data.data.coloniaG ? this.data.data.coloniaG: null],
      alcaldia: [this.data.data.alcaldia ? this.data.data.alcaldia: null],
      ciudadG: [this.data.data.ciudadG ? this.data.data.ciudadG: null],
      estadosG: [this.data.data.estadosG ? this.data.data.estadosG: null],
      cpG: [this.data.data.cpG ? this.data.data.cpG: null],
      telefonoParticularG: [this.data.data.telefonoParticularG ? this.data.data.telefonoParticularG: null],
      telefonoCelularG: [this.data.data.telefonoCelularG ? this.data.data.telefonoCelularG: null],
      email: [this.data.data.email ? this.data.data.email: null],
      rfcG: [this.data.data.rfcG ? this.data.data.rfcG: null],
      curpG: [this.data.data.curpG ? this.data.data.curpG: null],
      fiel: [this.data.data.fiel ? this.data.data.fiel: null],
    })
    }

    parchar() {
    this._formulario.patchValue({
      idTitular: this._titularForm.get('idTitular').value,
      titularNombre: this._titularForm.get('titularNombre').value,
      apellidoPaterno: this._titularForm.get('apellidoPaterno').value,
      apellidoMaterno: this._titularForm.get('apellidoMaterno').value,
      grupoFamilia: this._titularForm.get('grupoFamilia').value,
      promotor: this._titularForm.get('promotor').value,
      tipoInversionista: this._titularForm.get('tipoInversionista').value,
      excentoIsr: this._titularForm.get('excentoIsr').value,
      excentoIva: this._titularForm.get('excentoIva').value,
      fechaNacimiento: this._titularForm.get('fechaNacimiento').value,
      entidadFederativaNacimiento: this._titularForm.get('entidadFederativaNacimiento').value,
      fechaInicioOperaciones: this._titularForm.get('fechaInicioOperaciones').value,
      estadoCivil: this._titularForm.get('estadoCivil').value,
      profesion: this._titularForm.get('profesion').value,
      nombreEmpresaPrestaServicios: this._titularForm.get('nombreEmpresaPrestaServicios').value,
      nombrePuesto: this._titularForm.get('nombrePuesto').value,
      funcionesGeneralesDirectivas: this._titularForm.get('funcionesGeneralesDirectivas').value,
      nivelJerarquico: this._titularForm.get('nivelJerarquico').value,
      antiguedadEmpleo: this._titularForm.get('antiguedadEmpleo').value,
      sectorEmpresa: this._titularForm.get('sectorEmpresa').value,
      giroEmpresa: this._titularForm.get('giroEmpresa').value,
      tipoIngreso: this._titularForm.get('tipoIngreso').value,
      ingresoAdicional: this._titularForm.get('ingresoAdicional').value,
      sectorPrestaServicio: this._titularForm.get('sectorPrestaServicio').value,
      giroEspecificoServicios: this._titularForm.get('giroEspecificoServicios').value,
      sectorEmpresa2: this._titularForm.get('sectorEmpresa2').value,
      razonSocialEmpresa: this._titularForm.get('razonSocialEmpresa').value,
      actividadEmpresa: this._titularForm.get('actividadEmpresa').value,
      ingresoAdicional2: this._titularForm.get('ingresoAdicional2').value,
      ocupacionActual: this._titularForm.get('ocupacionActual').value,
      fuenteIngresos: this._titularForm.get('fuenteIngresos').value,
      sociedadesAsociacionesRFCEmpresa: this._titularForm.get('sociedadesAsociacionesRFCEmpresa').value,
      nacionalidadEmpresa: this._titularForm.get('nacionalidadEmpresa').value,
      telefonoEmpresa: this._titularForm.get('telefonoEmpresa').value,
      sectorEmpresa3: this._titularForm.get('sectorEmpresa3').value,
      actividadGiroEspecificoEmpresa: this._titularForm.get('actividadGiroEspecificoEmpresa').value,
      porcentajeCapitalSocial: this._titularForm.get('porcentajeCapitalSocial').value,
      consejeroEmpresaRFCEmpresa: this._titularForm.get('consejeroEmpresaRFCEmpresa').value,
      nacionalidadEmpresa2: this._titularForm.get('nacionalidadEmpresa2').value,
      telefonoEmpresa2: this._titularForm.get('telefonoEmpresa2').value,
      sectorEmpresa4: this._titularForm.get('sectorEmpresa4').value,
      actividadGiroEmpresa3: this._titularForm.get('actividadGiroEmpresa3').value,
      vinculoPatrimonial: this._titularForm.get('vinculoPatrimonial').value,
      consejeroEmpresa: this._titularForm.get('consejeroEmpresa').value,
      cargoDesempeno: this._titularForm.get('cargoDesempeno').value,
      nombreInstitucion: this._titularForm.get('nombreInstitucion').value,
      institucionCargoExtranjero: this._titularForm.get('institucionCargoExtranjero').value,
      pais: this._titularForm.get('pais').value,
      cargo: this._titularForm.get('cargo').value,
      relacionPersonaNacionalExtranjera: this._titularForm.get('relacionPersonaNacionalExtranjera').value,
      cargo2: this._titularForm.get('cargo2').value,
      institucionDesempenaCargo: this._titularForm.get('institucionDesempenaCargo').value,

      idCotitular: this._cotitularForm.get('idCotitular').value,
      nombreCotitular: this._cotitularForm.get('nombreCotitular').value,
      apellidoPaternoC: this._cotitularForm.get('apellidoPaternoC').value,
      apellidoMaternoC: this._cotitularForm.get('apellidoMaternoC').value,
      estadoCivilC: this._cotitularForm.get('estadoCivilC').value,
      lugarPrestaServicios: this._cotitularForm.get('lugarPrestaServicios').value,
      nombrePuestoC: this._cotitularForm.get('nombrePuestoC').value,
      funcionesGeneralesDirectivasC: this._cotitularForm.get('funcionesGeneralesDirectivasC').value,
      nivelJerarquicoC: this._cotitularForm.get('nivelJerarquicoC').value,
      antiguedadEmpleoC: this._cotitularForm.get('antiguedadEmpleoC').value,
      sectorEmpresaC: this._cotitularForm.get('sectorEmpresaC').value,
      tipoIngresoC: this._cotitularForm.get('tipoIngresoC').value,
      ingresoAdicionalC: this._cotitularForm.get('ingresoAdicionalC').value,
      formasProporcionaServicios: this._cotitularForm.get('formasProporcionaServicios').value,
      sectorPrestaServicios: this._cotitularForm.get('sectorPrestaServicios').value,
      actividadGiroEEmpresaC: this._cotitularForm.get('actividadGiroEEmpresaC').value,
      rfcEmpresa: this._cotitularForm.get('rfcEmpresa').value,
      sectorDEmpresaC: this._cotitularForm.get('sectorDEmpresaC').value,
      actividadGiroEmpresaC: this._cotitularForm.get('actividadGiroEmpresaC').value,
      cingresoAdicionalC: this._cotitularForm.get('cingresoAdicionalC').value,
      ocupacionActualC: this._cotitularForm.get('ocupacionActualC').value,
      fuenteIngresoC: this._cotitularForm.get('fuenteIngresoC').value,
      razonSocialEmpresaC: this._cotitularForm.get('razonSocialEmpresaC').value,
      rfc: this._cotitularForm.get('rfc').value,
      nacionalidadEmpresaC: this._cotitularForm.get('nacionalidadEmpresaC').value,
      telefonoEmpresaC: this._cotitularForm.get('telefonoEmpresaC').value,
      sectorDeEmpresaC: this._cotitularForm.get('sectorDeEmpresaC').value,
      actividadEmpresaC1: this._cotitularForm.get('actividadEmpresaC1').value,
      porcentajeEmpresaC: this._cotitularForm.get('porcentajeEmpresaC').value,
      esConsejero: this._cotitularForm.get('esConsejero').value,
      razonSocialC: this._cotitularForm.get('razonSocialC').value,
      rfcC: this._cotitularForm.get('rfcC').value,
      nacionalidadDEmpresaC: this._cotitularForm.get('nacionalidadDEmpresaC').value,
      telefonoDEmpresaC: this._cotitularForm.get('telefonoDEmpresaC').value,
      sectorDLEmpresaC: this._cotitularForm.get('sectorDLEmpresaC').value,
      actividadEmpresaC2: this._cotitularForm.get('actividadEmpresaC2').value,
      porcentajeEmpresaPertenece: this._cotitularForm.get('porcentajeEmpresaPertenece').value,
      consejeroEmpresaC: this._cotitularForm.get('consejeroEmpresaC').value,
      institucionesCargosPublicosRelacion: this._cotitularForm.get('institucionesCargosPublicosRelacion').value,
      institucionDesempenaCargoC: this._cotitularForm.get('institucionDesempenaCargoC').value,
      relacionPersonaNacionalExtranjeraC: this._cotitularForm.get('relacionPersonaNacionalExtranjeraC').value,

      idProcedencia: this._procedenciaForm.get('idProcedencia').value,
      procedenciaRecurso: this._procedenciaForm.get('procedenciaRecurso').value,
      detalleRecurso: this._procedenciaForm.get('detalleRecurso').value,

      idProveedor: this._proveedorRecursosForm.get('idProveedor').value,
      proveedorrecursoNombre: this._proveedorRecursosForm.get('proveedorrecursoNombre').value,
      apellidoPaternoP: this._proveedorRecursosForm.get('apellidoPaternoP').value,
      apellidoMaternoP: this._proveedorRecursosForm.get('apellidoMaternoP').value,
      nacionalidadP: this._proveedorRecursosForm.get('nacionalidadP').value,
      fechaNacimientoP: this._proveedorRecursosForm.get('fechaNacimientoP').value,
      curp: this._proveedorRecursosForm.get('curp').value,
      rfcP: this._proveedorRecursosForm.get('rfcP').value,
      firmaElectronica: this._proveedorRecursosForm.get('firmaElectronica').value,
      tipoVialidad: this._proveedorRecursosForm.get('tipoVialidad').value,
      nombreVialidad: this._proveedorRecursosForm.get('nombreVialidad').value,
      noExterior: this._proveedorRecursosForm.get('noExterior').value,
      noInterior: this._proveedorRecursosForm.get('noInterior').value,
      colonia: this._proveedorRecursosForm.get('colonia').value,
      municipio: this._proveedorRecursosForm.get('municipio').value,
      ciudad: this._proveedorRecursosForm.get('ciudad').value,
      estado: this._proveedorRecursosForm.get('estado').value,
      cp: this._proveedorRecursosForm.get('cp').value,
      paisP: this._proveedorRecursosForm.get('paisP').value,
      personaMoralRazonSocial: this._proveedorRecursosForm.get('personaMoralRazonSocial').value,
      nacionalidad: this._proveedorRecursosForm.get('nacionalidad').value,
      rfcPR: this._proveedorRecursosForm.get('rfcPR').value,
      firmaElectronicaP: this._proveedorRecursosForm.get('firmaElectronicaP').value,
      domicilio: this._proveedorRecursosForm.get('domicilio').value,
      tipoVialidadP: this._proveedorRecursosForm.get('tipoVialidadP').value,
      nombreVialidadP: this._proveedorRecursosForm.get('nombreVialidadP').value,
      noExteriorP: this._proveedorRecursosForm.get('noExteriorP').value,
      noInteriorP: this._proveedorRecursosForm.get('noInteriorP').value,
      coloniaP: this._proveedorRecursosForm.get('coloniaP').value,
      delegacion: this._proveedorRecursosForm.get('delegacion').value,
      ciudadP: this._proveedorRecursosForm.get('ciudadP').value,
      estadoP: this._proveedorRecursosForm.get('estadoP').value,
      codigoPostal: this._proveedorRecursosForm.get('codigoPostal').value,
      paisPR: this._proveedorRecursosForm.get('paisPR').value,

      idPropietario: this._propietarioForm.get('idPropietario').value,
      propietarioRealNombre: this._propietarioForm.get('propietarioRealNombre').value,
      apellidoPaternoPRE: this._propietarioForm.get('apellidoPaternoPRE').value,
      apellidoMaternoPRE: this._propietarioForm.get('apellidoMaternoPRE').value,
      genero: this._propietarioForm.get('genero').value,
      fechaNacimientoPRE: this._propietarioForm.get('fechaNacimientoPRE').value,
      curpPRE: this._propietarioForm.get('curpPRE').value,
      paisNacimiento: this._propietarioForm.get('paisNacimiento').value,
      estadoNacimiento: this._propietarioForm.get('estadoNacimiento').value,
      nacionalidadPRE: this._propietarioForm.get('nacionalidadPRE').value,
      calidadMigratoria: this._propietarioForm.get('calidadMigratoria').value,
      paisResidencia: this._propietarioForm.get('paisResidencia').value,
      regimenFiscal: this._propietarioForm.get('regimenFiscal').value,
      rfcPRE: this._propietarioForm.get('rfcPRE').value,
      firmaElectronicaAvanzada: this._propietarioForm.get('firmaElectronicaAvanzada').value,
      telefonoParticular: this._propietarioForm.get('telefonoParticular').value,
      telefonoCelular: this._propietarioForm.get('telefonoCelular').value,
      correoElectronico: this._propietarioForm.get('correoElectronico').value,
      domicilioPropietario: this._propietarioForm.get('domicilioPropietario').value,
      tipoVialidadPRE: this._propietarioForm.get('tipoVialidadPRE').value,
      nombreVialidadPRE: this._propietarioForm.get('nombreVialidadPRE').value,
      noExteriorPRE: this._propietarioForm.get('noExteriorPRE').value,
      noInteriorPRE: this._propietarioForm.get('noInteriorPRE').value,
      coloniaPRE: this._propietarioForm.get('coloniaPRE').value,
      delegacionPRE: this._propietarioForm.get('delegacionPRE').value,
      ciudadPRE: this._propietarioForm.get('ciudadPRE').value,
      estadoPRE: this._propietarioForm.get('estadoPRE').value,
      paisPRE: this._propietarioForm.get('paisPRE').value,
      codigo: this._propietarioForm.get('codigo').value,

      idUso: this._usoCuentaForm.get('idUso').value,
      tipoCliente: this._usoCuentaForm.get('tipoCliente').value,
      uso: this._usoCuentaForm.get('uso').value,
      montoDepositoInicial: this._usoCuentaForm.get('montoDepositoInicial').value,
      numeroAproxDepoMensualesMin: this._usoCuentaForm.get('numeroAproxDepoMensualesMin').value,
      numeroAproxDepoMensualesMax: this._usoCuentaForm.get('numeroAproxDepoMensualesMax').value,
      porccentajePromedioMensualDepositosMin: this._usoCuentaForm.get('porccentajePromedioMensualDepositosMin').value,
      porccentajePromedioMensualDepositosMax: this._usoCuentaForm.get('porccentajePromedioMensualDepositosMax').value,
      numeroAproxRetirosMensualesMin: this._usoCuentaForm.get('numeroAproxRetirosMensualesMin').value,
      numeroAproxRetirosMensualesMax: this._usoCuentaForm.get('numeroAproxRetirosMensualesMax').value,
      montoAproxMensualRetirosMin: this._usoCuentaForm.get('montoAproxMensualRetirosMin').value,
      montoAproxMensualRetirosMax: this._usoCuentaForm.get('montoAproxMensualRetirosMax').value,
      fechaBaja: this._usoCuentaForm.get('fechaBaja').value,
      liqVSsaldo: this._usoCuentaForm.get('liqVSsaldo').value,
      manejaCust: this._usoCuentaForm.get('manejaCust').value,
      cortoEfectivo: this._usoCuentaForm.get('cortoEfectivo').value,

      idGenerales: this._generalesForm.get('idGenerales').value,
      nacionalidadG: this._generalesForm.get('nacionalidadG').value,
      paisG: this._generalesForm.get('paisG').value,
      calleG: this._generalesForm.get('calleG').value,
      noExteriorG: this._generalesForm.get('noExteriorG').value,
      noInteriorG: this._generalesForm.get('noInteriorG').value,
      coloniaG: this._generalesForm.get('coloniaG').value,
      alcaldia: this._generalesForm.get('alcaldia').value,
      ciudadG: this._generalesForm.get('ciudadG').value,
      estadosG: this._generalesForm.get('estadosG').value,
      cpG: this._generalesForm.get('cpG').value,
      telefonoParticularG: this._generalesForm.get('telefonoParticularG').value,
      telefonoCelularG: this._generalesForm.get('telefonoCelularG').value,
      email: this._generalesForm.get('email').value,
      rfcG: this._generalesForm.get('rfcG').value,
      curpG: this._generalesForm.get('curpG').value,
      fiel: this._generalesForm.get('fiel').value,
    })
    }
  }

