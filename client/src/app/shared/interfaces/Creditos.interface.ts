// @ts-ignore
import {
  ChartComponent,
  ApexAxisChartSeries,
  ApexChart,
  ApexXAxis,
  ApexResponsive,
  ApexPlotOptions,
  ApexTitleSubtitle, ApexNonAxisChartSeries
} from 'ng-apexcharts';
// tslint:disable-next-line:class-name
export class _aseguradoras {
  id: number;
  claveAseguradoraSeguro: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _ciudades {
  id: number;
  numeroCiudad: number;
  numeroEstado: number;
  numeroPais: number;
  descripcion: string;
}

export class _coberturasGeograficas {
  id: number;
  claveCobertura: number;
  descripcion: string;
}

export class _estadoCivil {
  id: number;
  claveEstadoCivil: number
  descripcionCorta: string;
  descripcion: string;
  casado: boolean;
}

export class _estados {
  id: number;
  claveEstado: number;
  numeroPais: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _giroEmpresarial {
  id: number;
  claveGiroEmpresarial: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _monedas {
  id: number;
  claveMoneda: number;
  descripcionCorta: string;
  descripcion: string;
  numeroPais: _paises;
}

export class _municipios {
  id: number;
  numeroMunicipio: number;
  numeroEstado: number;
  numeroPais: number;
  descripcionCorta: string;
  descripcionEstado: string;
}

export class _nacionalidades {
  id: number;
  claveNacionalidad: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _ocupaciones {
  id: number;
  claveOcupacion: number;
  descripcion: string;
}

export class _origenIngresos {
  id: number;
  claveOrigenIngresos: number;
  descripcion: string;
}

export class _origenRecursos {
  id: number;
  claveOrigenRecursosCuenta: number;
  descripcion: string;
}

export class _paises {
  id: number;
  clavePais: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _participes {
  id: number;
  claveParticipe: number;
  descripcion: string;
}

export class _periodicidades {
  id: number;
  clavePeriodicidad: number;
  sistema: string;
  descripcion: string;
  periodo: string;
  frecuencia: number;
  dias: number;
}

export class _profesiones {
  id: number;
  claveProfesion: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _puestosEmpleos {
  id: number;
  clavePuestoEmpleo: number;
  descripcion: string;
}

export class _regimenMatrimonial {
  id: number
  claveRegimenMatrimonial: number
  descripcionCorta: string;
  descripcion: string;
}

export class _tipoImpuestos {
  id: number;
  claveImpuesto: number;
  descripcionCorta: string;
  descripcion: string;
  base: string;
  tasa: number;
}

export class _tipoPersona {
  id: number;
  claveTipoPersona: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _tipoAsentamientos {
  id: number;
  claveTipoAsentamiento: number;
  descripcion: string;
}

export class _tiposBeneficiario  {
  id: number;
  claveTipoBeneficiario: number;
  descripcion: string;
}

export class _tiposDomicilios {
  id: number;
  claveTipoDomicilio: number;
  descripcion: string;
}

export class _tipoSeguro {
  id: number;
  tipoSeguro: number;
  descripcion: string;
}

export class _tiposEmpleos {
  id: number;
  claveTipoEmpleo: number;
  descripcion: string;
}

export class _tiposIdentificaciones {
  id: number;
  claveTipoIdentificacion: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _tiposPropiedad {
  id: number;
  claveTipoPropiedad: number;
  descripcion: string;
}

export class _tiposReferencia {
  id: number;
  claveTipoReferencia: number;
  descripcion: string;
}

export class _tiposRelaciones {
  id: number;
  claveTipoRelacion: number;
  descripcion: string;
}

export class _tiposSociedad {
  id: number;
  claveTipoSociedad: number;
  descripcion: string;
  descripcionLarga: string;
}

export class _titulos {
  id: number;
  claveTipoPropiedad: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _usuario {
  id: number;
  username: string;
  password: string;
  password5: string;
  nombre: string;
  apellidoPaterno: string;
  apellidoMaterno: string;
  mail: string;
  avatar: string;
  desde: Date;
  nuevo: boolean;
  enabled: boolean;
  accountExpired: boolean;
  accountLocked: boolean;
  passwordExpired: boolean;
  role: string;
}

export class _roleDetalle {
  id: number;
  menu: string;
  habilitado: boolean;
  etiqueta: string;
  sistema: string;
  urlAjs: string;
}

export class _role {
  id: number;
  authority: string;
}

export class _combo {
  id: any;
  descripcion: any;
  cuenta?: any;
}

export class _actEcoB {
  id: number;
  numeroSector: _sectoresBanxico;
  indicadorActRiesgo: boolean;
}

export class _sectoresBanxico {
  id: number;
  claveSector: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _localidadesBanxico {
  id: number;
  claveLocalidadBanxico: number;
  descripcion: string;
  numeroEstado: number;
  descripcionEstado: string;
}

export class _actEcoF {
  id: number;
  claveActividad: number;
  descripcion: string;
}

export class _actEcoCNBV {
  id: number;
  claveActividad: number;
  descripcion: string;
}

export class _clavesLada {
  id: number;
  numeroClaveLada: number;
  claveLadaActual: number;
  localidadTelmex: string;
  claveLocalidad: number;
}

export class _institucionesYcontrapartes {
  id: number;
  claveInstitucionFinanciera: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _sectoresEconomicos {
  id: number;
  claveSectorEconomico: number;
  descripcion: string;
}

export class _destinosCredito {
  id: number;
  claveDestino: number;
  descripcion: string;
}

export class _tiposCredito {
  id: number;
  claveTipoCredito: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _tiposGarantia {
  id: number;
  claveTipoGarantia: number;
  descripcion: string;
  contabiliza: boolean;
  fega: string;
  fonaga: boolean;
  deudor: string;
}

export class _tasasReferencia {
  id: number;
  claveTasa: number;
  descripcionCorta: string;
  descripcion: string;
}

export class _valoresTasasReferencia {
  id: number;
  claveTasa: _tasasReferencia;
  fechaInicioVigencia: Date;
  valor: string;
}

export class _fuentesFondeo {
  id: number;
  claveInstitucionFondeadora: number;
  nombreInstitucionFondeadora: string;
}

export class _notarios {
  id: number;
  numeroNotario: number;
  apellidoPaternoNotarioTitular: string;
  apellidoMaternoNotarioTitular: string;
  primerNombreNotarioTitular: string;
  segundoNombreNotarioTitular: string;
  apellidoPaternoNotarioSuplente: string;
  apellidoMaternoNotarioSuplente: string;
  primerNombreNotarioSuplente: string;
  segundoNombreNotarioSuplente: string;
  codigoPostalNotario: number;
  calleDomicilioNotario: string;
  noExteriorNotario: number;
  noInteriorNotario: number;
  entreCalle: string;
  yCalle: string;
  claveColonia: number;
  otraColonia: string;
  tipoAsentamiento: number;
  referenciaDomicilio: string;
  claveLadaTelefono1: number;
  telefono1: string;
  extensionTelefono1: number;
  claveLadaTelefono2: number;
  telefono2: string;
  extensionTelefono2: number;
}

export class _peritos {
  id: number;
  numeroPerito: number;
  numeroRegistroPerito: string;
  apellidoPaternoPeritoTitular: string;
  apellidoMaternoPeritoTitular: string;
  primerNombrePeritoTitular: string;
  segundoNombrePeritoTitular: string;
}

export class _buroCredito {
  id: number;
  numeroInstitucion: number;
  claveOtorgante: string;
  nombreOtorgante: string;
  claveVersion: number;
  domicilioDevolucion: string;
  generaLunes: boolean;
  generaMartes: boolean;
  generaMiercoles: boolean;
  generaJueves: boolean;
  generaViernes: boolean;
  generaSabado: boolean;
  generaDomingo: boolean;
  fechaUltimoReporteSemanal: Date;
  fechaProximoReporteSemanal: Date;
  fechaUltimoReporteMensual: Date;
  tipoInstitucion: string;
}

export class _circuloCredito {
  id: number;
  numeroInstitucion: number;
  claveOtorgante: string;
  nombreOtorgante: string;
  identificadorMedio: string;
  domicilioDevolucion: string;
}

export class Kyc {
  id: number;
  ruta: string;
  tipoArchivo: string;
  nombre: _usuario;
  fecha: Date;
}

export class _grupoFamilia {
  id: string;
  clave: string;
  nombre: string;
  descripcion: string;
  ldefault: boolean;
}

export class _promotor {
  id: string;
  cvePromotor: string;
  ciudad: string;
  colonia: string;
  direccion: string;
  nombre: string;
}

export class _tipoInversionista {
  cveTipoInversionista: string;
  descripcion: string;
  prioridad: number;
  institucional: boolean;
  sector: string;
  cambioTasa: string;
  pJuridica: boolean;
}

export class _actVulnerable {
  id: string;
  cveActVulnerable: string;
  descripcion: string;
  vulnerable: boolean;
}

export class _clientes {
  id: number;
  idTitular: number;
  titularNombre: string;
  apellidoPaterno: string;
  apellidoMaterno: string;
  grupoFamilia: _grupoFamilia;
  promotor: _promotor;
  tipoInversionista: _tipoInversionista;
  excentoIsr: boolean;
  excentoIva: boolean;
  fechaNacimiento: Date;
  entidadFederativaNacimiento: _estados;
  fechaInicioOperaciones: Date;
  estadoCivil: string;
  profesion: _profesiones;
  nombreEmpresaPrestaServicios: string;
  nombrePuesto: string;
  funcionesGeneralesDirectivas: string;
  nivelJerarquico: string;
  antiguedadEmpleo: string;
  sectorEmpresa: string;
  giroEmpresa: string;
  tipoIngreso: string;
  ingresoAdicional: string;
  sectorPrestaServicio: string;
  giroEspecificoServicios: _actVulnerable;
  sectorEmpresa2: string;
  razonSocialEmpresa: string;
  actividadEmpresa: string;
  ingresoAdicional2: string;
  ocupacionActual: string;
  fuenteIngresos: string;
  sociedadesAsociacionesRFCEmpresa: string;
  nacionalidadEmpresa: _nacionalidades;
  telefonoEmpresa: string;
  sectorEmpresa3: string;
  actividadGiroEspecificoEmpresa: string;
  porcentajeCapitalSocial: string;
  consejeroEmpresaRFCEmpresa: string;
  nacionalidadEmpresa2: _nacionalidades;
  telefonoEmpresa2: string;
  sectorEmpresa4: string;
  actividadGiroEmpresa3: string;
  vinculoPatrimonial: string;
  consejeroEmpresa: string;
  cargoDesempeno: string;
  nombreInstitucion: string;
  institucionCargoExtranjero: string;
  pais: _paises;
  cargo: string;
  relacionPersonaNacionalExtranjera: string;
  cargo2: string;
  institucionDesempenaCargo: string;

  // cotitular
  idCotitular: number;
  nombreCotitular: string;
  apellidoPaternoC: string;
  apellidoMaternoC: string;
  estadoCivilC: string;
  lugarPrestaServicios: string;
  nombrePuestoC: string;
  funcionesGeneralesDirectivasC: string;
  nivelJerarquicoC: string;
  antiguedadEmpleoC: string;
  sectorEmpresaC: string;
  tipoIngresoC: string;
  ingresoAdicionalC: string;
  formasProporcionaServicios: string;
  sectorPrestaServicios: string;
  actividadGiroEEmpresaC: string;
  rfcEmpresa: string;
  sectorDEmpresaC: string;
  actividadGiroEmpresaC: string;
  cingresoAdicionalC: string;
  ocupacionActualC: string;
  fuenteIngresoC: string;
  razonSocialEmpresaC: string;
  rfc: string;
  nacionalidadEmpresaC: _nacionalidades;
  telefonoEmpresaC: string;
  sectorDeEmpresaC: string;
  actividadEmpresaC1: string;
  porcentajeEmpresaC: string;
  esConsejero: string;
  razonSocialC: string;
  rfcC: string;
  nacionalidadDEmpresaC: _nacionalidades;
  telefonoDEmpresaC: string;
  sectorDLEmpresaC: string;
  actividadEmpresaC2: string;
  porcentajeEmpresaPertenece: string;
  consejeroEmpresaC: string;
  institucionesCargosPublicosRelacion: string;
  institucionDesempenaCargoC: string;
  relacionPersonaNacionalExtranjeraC: string;

  // procedencia de recursos
  idProcedencia: number;
  procedenciaRecurso: string;
  detalleRecurso: string;

  // proveedor de recursos
  idProveedor: number;
  proveedorrecursoNombre: string;
  apellidoPaternoP: string;
  apellidoMaternoP: string;
  nacionalidadP: _nacionalidades;
  fechaNacimientoP: Date;
  curp: string;
  rfcP: string;
  firmaElectronica: string;
  tipoVialidad: string;
  nombreVialidad: string;
  noExterior: string;
  noInterior: string;
  colonia: string;
  municipio: _municipios;
  ciudad: _ciudades;
  estado: _estados;
  cp: string;
  paisP: _paises;
  personaMoralRazonSocial: string;
  nacionalidad: _nacionalidades;
  rfcPR: string;
  firmaElectronicaP: string;
  domicilio: string;
  tipoVialidadP: string;
  nombreVialidadP: string;
  noExteriorP: string;
  noInteriorP: string;
  coloniaP: string;
  delegacion: _municipios;
  ciudadP: _ciudades;
  estadoP: _estados;
  codigoPostal: string;
  paisPR: _paises;

  // propietario real
  idPropietario:number;
  propietarioRealNombre: string;
  apellidoPaternoPRE: string;
  apellidoMaternoPRE: string;
  genero: string;
  fechaNacimientoPRE: Date;
  curpPRE: string;
  paisNacimiento: _paises;
  estadoNacimiento: _estados;
  nacionalidadPRE: _nacionalidades
  calidadMigratoria: string;
  paisResidencia: _paises;
  regimenFiscal: string;
  rfcPRE: string;
  firmaElectronicaAvanzada: string;
  telefonoParticular: string;
  telefonoCelular: string;
  correoElectronico: string;
  domicilioPropietario: string;
  tipoVialidadPRE: string;
  nombreVialidadPRE: string;
  noExteriorPRE: string;
  noInteriorPRE: string;
  coloniaPRE: string;
  delegacionPRE: _municipios;
  ciudadPRE: _ciudades;
  estadoPRE: _estados;
  paisPRE: _paises;
  codigo: string;

  //Uso y movimientos de la cuenta
  idUso: number;
  tipoCliente: _tipoCliente;
  uso: string;
  montoDepositoInicial: number;
  numeroAproxDepoMensualesMin: number;
  numeroAproxDepoMensualesMax: number;
  porccentajePromedioMensualDepositosMin: number;
  porccentajePromedioMensualDepositosMax: number;
  numeroAproxRetirosMensualesMin: number;
  numeroAproxRetirosMensualesMax: number;
  montoAproxMensualRetirosMin: number;
  montoAproxMensualRetirosMax: number;
  fechaBaja: Date;
  liqVSsaldo: boolean;
  manejaCust: boolean;
  cortoEfectivo: boolean;

  //Generales
  idGenerales: number;
  nacionalidadG: _nacionalidades;
  paisG: _paises;
  calleG: string;
  noExteriorG: string;
  noInteriorG: string;
  coloniaG: string;
  alcaldia: _municipios;
  ciudadG: _ciudades;
  estadosG: _estados;
  cpG: string;
  telefonoParticularG: string;
  telefonoCelularG: string;
  email: string;
  rfcG: string;
  curpG: string;
  fiel: string;

}

export class _tipoCliente {
  id: number;
  cveTipoDeCliente: number;
  descripcion: string;
}


export class _cliente{
  id: number;
  titular: _titular;
  cotitular: _cotitular;
  procedenciaRecursos: _procedenciaRecursos;
  proveedorRecursos: _proveedorRecursos;
  propietarioReal: _propietarioReal;
  usoCuenta: _usoCuenta;
  generales: _generales;
}

export class _titular{
  id: number;
  titularNombre: string;
  apellidoPaterno: string;
  apellidoMaterno: string;
  grupoFamilia: _grupoFamilia;
  promotor: _promotor;
  tipoInversionista: _tipoInversionista;
  excentoIsr: boolean;
  excentoIva: boolean;
  fechaNacimiento: Date;
  entidadFederativaNacimiento: _estados;
  fechaInicioOperaciones: Date;
  estadoCivil: string;
  profesion: _profesiones;
  nombreEmpresaPrestaServicios: string;
  nombrePuesto: string;
  funcionesGeneralesDirectivas: string;
  nivelJerarquico: string;
  antiguedadEmpleo: string;
  sectorEmpresa: string;
  giroEmpresa: string;
  tipoIngreso: string;
  ingresoAdicional: string;
  sectorPrestaServicio: string;
  giroEspecificoServicios: _actVulnerable;
  sectorEmpresa2: string;
  razonSocialEmpresa: string;
  actividadEmpresa: string;
  ingresoAdicional2: string;
  ocupacionActual: string;
  fuenteIngresos: string;
  sociedadesAsociacionesRFCEmpresa: string;
  nacionalidadEmpresa: _nacionalidades;
  telefonoEmpresa: string;
  sectorEmpresa3: string;
  actividadGiroEspecificoEmpresa: string;
  porcentajeCapitalSocial: string;
  consejeroEmpresaRFCEmpresa: string;
  nacionalidadEmpresa2: _nacionalidades;
  telefonoEmpresa2: string;
  sectorEmpresa4: string;
  actividadGiroEmpresa3: string;
  vinculoPatrimonial: string;
  consejeroEmpresa: string;
  cargoDesempeno: string;
  nombreInstitucion: string;
  institucionCargoExtranjero: string;
  pais: _paises;
  cargo: string;
  relacionPersonaNacionalExtranjera: string;
  cargo2: string;
  institucionDesempenaCargo: string;
}
export class _cotitular{
  id: number;
  nombreCotitular: string;
  apellidoPaternoC: string;
  apellidoMaternoC: string;
  estadoCivilC: string;
  lugarPrestaServicios: string;
  nombrePuestoC: string;
  funcionesGeneralesDirectivasC: string;
  nivelJerarquicoC: string;
  antiguedadEmpleoC: string;
  sectorEmpresaC: string;
  tipoIngresoC: string;
  ingresoAdicionalC: string;
  formasProporcionaServicios: string;
  sectorPrestaServicios: string;
  actividadGiroEEmpresaC: string;
  rfcEmpresa: string;
  sectorDEmpresaC: string;
  actividadGiroEmpresaC: string;
  cingresoAdicionalC: string;
  ocupacionActualC: string;
  fuenteIngresoC: string;
  razonSocialEmpresaC: string;
  rfc: string;
  nacionalidadEmpresaC: _nacionalidades;
  telefonoEmpresaC: string;
  sectorDeEmpresaC: string;
  actividadEmpresaC1: string;
  porcentajeEmpresaC: string;
  esConsejero: string;
  razonSocialC: string;
  rfcC: string;
  nacionalidadDEmpresaC: _nacionalidades;
  telefonoDEmpresaC: string;
  sectorDLEmpresaC: string;
  actividadEmpresaC2: string;
  porcentajeEmpresaPertenece: string;
  consejeroEmpresaC: string;
  institucionesCargosPublicosRelacion: string;
  institucionDesempenaCargoC: string;
  relacionPersonaNacionalExtranjeraC: string;
}
export class _procedenciaRecursos{
  id: number;
  procedenciaRecurso: string;
  detalleRecurso: string;
}
export class _proveedorRecursos{
  id: number;
  proveedorrecursoNombre: string;
  apellidoPaternoP: string;
  apellidoMaternoP: string;
  nacionalidadP: _nacionalidades;
  fechaNacimientoP: Date;
  curp: string;
  rfcP: string;
  firmaElectronica: string;
  tipoVialidad: string;
  nombreVialidad: string;
  noExterior: string;
  noInterior: string;
  colonia: string;
  municipio: _municipios;
  ciudad: _ciudades;
  estado: _estados;
  cp: string;
  paisP: _paises;
  personaMoralRazonSocial: string;
  nacionalidad: _nacionalidades;
  rfcPR: string;
  firmaElectronicaP: string;
  domicilio: string;
  tipoVialidadP: string;
  nombreVialidadP: string;
  noExteriorP: string;
  noInteriorP: string;
  coloniaP: string;
  delegacion: _municipios;
  ciudadP: _ciudades;
  estadoP: _estados;
  codigoPostal: string;
  paisPR: _paises;
}
export class _propietarioReal{
  id: number;
  propietarioRealNombre: string;
  apellidoPaternoPRE: string;
  apellidoMaternoPRE: string;
  genero: string;
  fechaNacimientoPRE: Date;
  curpPRE: string;
  paisNacimiento: _paises;
  estadoNacimiento: _estados;
  nacionalidadPRE: _nacionalidades
  calidadMigratoria: string;
  paisResidencia: _paises;
  regimenFiscal: string;
  rfcPRE: string;
  firmaElectronicaAvanzada: string;
  telefonoParticular: string;
  telefonoCelular: string;
  correoElectronico: string;
  domicilioPropietario: string;
  tipoVialidadPRE: string;
  nombreVialidadPRE: string;
  noExteriorPRE: string;
  noInteriorPRE: string;
  coloniaPRE: string;
  delegacionPRE: _municipios;
  ciudadPRE: _ciudades;
  estadoPRE: _estados;
  paisPRE: _paises;
  codigo: string;
}
export class _usoCuenta{
  id: number;
  tipoCliente: _tipoCliente;
  uso: string;
  montoDepositoInicial: number;
  numeroAproxDepoMensualesMin: number;
  numeroAproxDepoMensualesMax: number;
  porccentajePromedioMensualDepositosMin: number;
  porccentajePromedioMensualDepositosMax: number;
  numeroAproxRetirosMensualesMin: number;
  numeroAproxRetirosMensualesMax: number;
  montoAproxMensualRetirosMin: number;
  montoAproxMensualRetirosMax: number;
  fechaBaja: Date;
  liqVSsaldo: boolean;
  manejaCust: boolean;
  cortoEfectivo: boolean;
}
export class _generales{
  id: number;
  nacionalidadG: _nacionalidades;
  paisG: _paises;
  calleG: string;
  noExteriorG: string;
  noInteriorG: string;
  coloniaG: string;
  alcaldia: _municipios;
  ciudadG: _ciudades;
  estadosG: _estados;
  cpG: string;
  telefonoParticularG: string;
  telefonoCelularG: string;
  email: string;
  rfcG: string;
  curpG: string;
  fiel: string;
}

export class _personas{
  id: number;

  idDatosGenerales: number;
  primerNombre: string;
  segundoNombre: string;
  apellidoPaterno: string;
  apellidoMaterno: string;
  genero: string;
  estadoCivil: _estadoCivil;
  nacionalidad: _nacionalidades;
  fechaNacimiento: Date;
  actividad: string;
  giro: _giroEmpresarial;
  paisNacimiento: _paises;
  estadoNacimiento: _estados;

  idDatosAlternos: number;
  primerNombreA: string;
  segundoNombreA: string;
  apellidoPaternoA: string;
  apellidoMaternoA: string;

  idDatosBancarios: number;
  banco: string;
  cuenta: string;
  clabe: string;
  noTarjeta: string;

  idCorreos: number;
  activo: boolean;
  principal: boolean;
  tipo: string;
  correo: string;

  idContactos: number;
  relacion: _tiposRelaciones;
  persona: string;

  idTelefonos: number;
  activo1: boolean;
  principal1: boolean;
  tipo1: string;
  compania: string;
  lada: string;
  telefono: string;
  extencion: string;
  observaciones: string;
}


export class _persona{
  id: number;
  persona: _datosGenerales;
  datos: _datosAlternos;
  bancarios: _datosBancarios;
  correo: _correos;
  contacto: _contactos;
  telefono: _telefonos;
}

export class _datosGenerales{
  id: number;
  primerNombre: string;
  segundoNombre: string;
  apellidoPaterno: string;
  apellidoMaterno: string;
  genero: string;
  estadoCivil: _estadoCivil;
  nacionalidad: _nacionalidades;
  fechaNacimiento: Date;
  actividad: string;
  giro: _giroEmpresarial;
  paisNacimiento: _paises;
  estadoNacimiento: _estados;
}

export class _datosAlternos{
  id: number;
  primerNombreA: string;
  segundoNombreA: string;
  apellidoPaternoA: string;
  apellidoMaternoA: string;
}

export class _datosBancarios{
  id: number;
  banco: string;
  cuenta: string;
  clabe: string;
  noTarjeta: string;
}

export class _contactos{
  id: number;
  relacion: _tiposRelaciones;
  persona: string;
}

export class _correos{
  id: number;
  activo: boolean;
  principal: boolean;
  tipo: string;
  correo: string;
}

export class _telefonos{
  id: number;
  activo1: boolean;
  principal1: boolean;
  tipo1: string;
  compania: string;
  lada: string;
  telefono: string;
  extencion: string;
  observaciones: string;
}

export class _negocios{
  id: number;

  idDatosGenerales:number;
  nombre:string;
  tipoPersona:string;
  tipoSociedad:_tiposSociedad;
  tipoOperacion: string;
  fechaInicioOperaciones: Date;
  fechaInicioRegistro: Date;
  actividad: _ocupaciones;
  giro: _giroEmpresarial;
  establecimiento: string;
  nacionalidad: _nacionalidades;
  paginaWeb: string;

  idTelefonos: number;
  activo: boolean;
  principal: boolean;
  tipo: string;
  compania: string;
  lada: string;
  telefono: string;
  extencion: string;
  observaciones: string;

  idCorreos: number;
  activo1: boolean;
  principal1: boolean;
  tipo1: string;
  correo: string;

  idParticipantes: number;
  participante: string;
  puesto: string;
  porcentajeParticipacion: string;
  apoderado: string;
  poder: string;
  firma: boolean;

  idContactos: number;
  relacion: string;
  persona: string;

  idCuentas: number;
  banco: string;
  cuenta: string;
  clabe: string;
  noTarjeta: string;
}

export class _negocio{
  id: number;
  negocios: _datosGeneralesNegocios;
  telefonosNegocios: _telefonosNegocios;
  correosNegocios: _correosNegocios;
  participantes: _participantes;
  contactosNegocios: _contactosNegocios;
  cuentasBancarias: _cuentasBancariasNegocios;
}

export class _datosGeneralesNegocios{
  id: number;
  nombre: string;
  tipoPersona: string;
  tipoSociedad: _tiposSociedad;
  tipoOperacion: string;
  fechaInicioOperaciones: Date;
  fechaInicioRegistro: Date;
  actividad: _ocupaciones;
  giro: _giroEmpresarial;
  establecimiento: string;
  nacionalidad: _nacionalidades;
  paginaWeb: string;
}

export class _telefonosNegocios {
  id: number;
  activo: boolean;
  principal: boolean;
  tipo: string;
  compania: string;
  lada: string;
  telefono: string;
  extencion: string;
  observaciones: string;
}

export class _correosNegocios{
  id: number;
  activo: boolean;
  principal: boolean;
  tipo: string;
  correo: string;
}

export class _participantes{
  id: number;
  participante: string;
  puesto: string;
  porcentajeParticipacion: string;
  apoderado: string;
  poder: string;
  firma: boolean;
}

export class _contactosNegocios{
  id: number;
  relacion: string;
  persona: string;
}

export class _cuentasBancariasNegocios{
  id: number;
  banco: string;
  cuenta: string;
  clabe: string;
  noTarjeta: string;
}

export class _prospectos {
  id: number;
  tipo: string;
  nombre: string;
  modoDeContacto: _modoContacto;
  comoSeEntero: _modoContacto;
  sucursal: _sucursales;
  ejecutivo: _empleados;
  promotor: _empleados;
  producto: string;
  monto: string;
}

export class _modoContacto {
  id: number;
  valor: number;
  descripcion: string;
  financieraNacional: string;
}

export class _sucursales {
  id: number;
  sucursal: string;
  responsable: string;
  puesto: string;
  domicilio: string;
  telefono: string;
  correo: string;
}

export class _empleados {
  id: number;
  numeroEmpleado: number;
  nombre: string;
  puesto: string;
  sucursal: _sucursales;
}

export class _productoFinanciero {
  id: number;
  producto: string;
  montoMinimo: number;
  montoMaximo: number;
  tipo: string;
  clasificacionBancaria: string;
  moneda: _monedas;
  activo: boolean;
}

export class _frecuenciaPago {
  id: number;
  dias: string;
  frecuenciaPago: string;
  cnbv: string;
  bc: string;
  cc: string;
}

export class _simulador {
  fechaEntrega: Date;
  fechaPrimerPago: Date;
  frecuenciaPago: _frecuenciaPago;
  numeroPagos: number;
  tipoTasa
  tasa: string;
  retenciones: number;
  retencionesFinanciadas: number;
  montoSolicitado: _prospectos;
  montoCredito: number;
  montoEntregar: number;
}

export class _parametros {
  id: number;
  baseCapital: string;
  plazoMinimo: string;
  plazoMaximo: string;
  proyectarIntereses: string;
  diasGracia: string;
  diasInhabiles: string;
  tipoPeriodoGracia: string;
  fechaCalculo: string;
  diasMinistracion: string;
  diaCorteEstadoCuenta: string;
  obtenerCat: string;

  numeroGracia: string;
  decimales: string;
  tipoCalculoDias: string;
  capitalizarIntereses: string;
  decimalesCalculo: string;
  tipoCalculo: string;
  capitalizarMoratorios: string;
  tipoCalendario: string;
  incluirImpuestos: string;
  diasCalculo: string;
  tipoTasaInteres: string;

  conceptoComprobantes: string;
  emitirComplementosComprobantes: string;
  emitirComprobantesFiscales: string;
  emitirComprobantesPor: string;

  tipoFactoraje: string;

  enviarInformacion: string;

  cobrarDiasProrroga: string;
  baseMoratorios: string;
  valoresMora: string;
  diasProrroga: string;
  cobrarMoratorios: string;
  tiposMoratorios: string;

  valoresTomaraTasa: string;

  llamadaMargen: string;
  porcentajeAforo: string;
  permiteRenovacion: string;

  desembolsoPorParticipante: boolean;
  permitirCapturaGrupo: boolean;

  aplicacionPagoAnticipado: string;
  prelacionAplicacionPago: string;

  plazoMinimoLineaCredito: string;
  montoMaximoDisposicion: string;
  plazoMaximoDisposicion: string;
  tasaEntregaRecursos: string;
}

export class _denominaciones {
  id: number;
  tipo: string;
  valor: string;
}

export class _formasPago {
  id: number;
  valor: string;
  descripcion: string;
  operacion: string;
}

export class _solicitudes {
  id: number;
  tipo: string;
  nombre: string;
  fechaSolicitud: Date;
  sucursal: _sucursales;
  producto: _productoFinanciero;
  ejecutivo: _empleados;
  promotor: _empleados;
  concetoInversion: string;
  numeroAmortizaciones: string;
  fechaEntrega: Date;
  fechaPrimerAmortizacion: Date;
  tasa: string;
  estatus: string;
}

export class _coacreditados {
  id: number;
  tipo: string;
  nombre: string;
  relacion: string;
}

export class _beneficiarios {
  id: number;
  tipo: string;
  nombre: string;
  relacion: _tiposRelaciones;
}

export class _informacionPLD  {
  id: number;
  montoMaximoPago: number;
  montoMaximoAnticipo: number;
  ingresosMensuales: number;
  moneda: _monedas;
  centroTrabajo: string;
  proveedorRecursos: string;
  canalPago: string;
  formaPago: _formasPago;
}

export class _avales {
  id: number;
  tipo: string;
  nombre: string;
  relacion: string;
}

export class _creditoSimple {
  id: number;
  tipo: string;
  nombre: string;
  ocupacion: string;
  sucursal: string;
  producto: string;
  conceptoInversion: string;
  fechaContrato: Date;
  numeroContrato: number;
  ejecutivo: string;
  promotor: string;
  frecuenciaPago: string;
  numeroAmortizacion: string;
  fechaPrimerAmortizacion: Date;
  cat: string;
  montoNeto: string;
  estatus: string;
  etiquetas: string;
}

export class _referencias {
  id: number;
  tipo: string;
  cuentaBancaria: string;
  referencia: string;
}

export class _datosAdicionalesCompa??ias {
  id: number;
  compa??iaRetenedora: string;
}
