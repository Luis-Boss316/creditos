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
  ruta: string;
  tipoArchivo: string;
  nombre: _usuario;
  fecha: Date;
}

export class _clientes {
  id: number;
  titularNombre: string;
  apellidoPaterno: string;
  apellidoMaterno: string;
  promotor: string;
  grupoFamilia: string;
  estatus: string;
}
